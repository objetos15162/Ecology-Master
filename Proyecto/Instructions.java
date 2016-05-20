import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Instructions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instructions  extends Actor
{
    private GreenfootImage begin;
    private GreenfootImage blank;
    private GreenfootImage calibrating;    
    private boolean flag;
    
    /**
     * @Param World world recibe mi objeto mundo
     * 
     */
    protected void addedToWorld(World world)
    {
        begin = new GreenfootImage("begin.png");
        begin.scale(world.getWidth(), world.getHeight());
        calibrating = new GreenfootImage("calibrating.png");
        calibrating.scale(world.getWidth(), world.getHeight());
        blank = new GreenfootImage(1, 1);
        setImage(blank);
        flag = false;
    }

    /**
     * Calibra a mi kinect
     */
    public void act() 
    {
        KinectWorld world = (KinectWorld)getWorld();
        boolean trackingAny = false;
        boolean calibratingAny = false;
        UserData[] us = world.getAllUsers();
        for (UserData u : us) {
            trackingAny = trackingAny || u.isTracking();
            calibratingAny = calibratingAny || u.isCalibrating();
        }
        
        if (us.length > 0 && !trackingAny && ! calibratingAny) {
            //setImage(begin);   
        }
        else if (us.length > 0 && !trackingAny && calibratingAny) {
            //setImage(calibrating);
        }
        else {
            //setImage(blank);
            flag = true;
        }
    }   
    
    /**
     * @return boolean flag  bandera para saber si kinect quedo calibrado
     * metodo para saber si el kinect esta calibrado
     */
    public boolean getFlag()
    {
        return flag;
    }
}
