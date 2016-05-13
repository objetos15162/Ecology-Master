import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class barco here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Barco extends Actor
{
    /**
     * Act - do whatever the barco wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage img; 
    private int x;
    private int y;
    
    public Barco()
    {
        img =  new GreenfootImage("barco.png");
        x = 250;
        y = 50;
        agregar();
    }
    
    public void act() 
    {
      
      Mar world = (Mar)getWorld();
      UserData[] us = world.getTrackedUsers();
      
      for (UserData u : us) {
           Joint derecha = u.getJoint(Joint.RIGHT_HAND);
           setLocation(derecha.getX(),50);
           x = derecha.getX();
           y = derecha.getY();
      }
    }
    
    public void agregar()
    {    
        setImage(img);
        img.scale(70,70);
    }
    
    public int getX()
    {
        return x;
    }
    
    public int getY()
    {
        return y;
    }
}
