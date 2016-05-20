import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class regar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Regar extends Actor
{
    private int puntos,x,y;
    GifImage gif ;
    /**
     * constructor
     */
    public Regar()
    {
        gif = new GifImage("regar.gif");
        x=250;
        y=358;
        
    }
    
    /**
     * Detecta los movimientos de mi usuario
     * para cambiar la localizazcion de mi imagen
     */
    public void act() 
    {
        setImage(gif.getCurrentImage());
        Juego world = (Juego)getWorld();
        UserData[] us = world.getTrackedUsers();
        for (UserData u : us) {
           Joint derecha = u.getJoint(Joint.RIGHT_HAND);
           y= derecha.getY();
           x= derecha.getX();
        
           if( y <= 357)
           setLocation(x,y);
         /*if(Greenfoot.isKeyDown("left")){
            x-=2;
         }
         if(Greenfoot.isKeyDown("right")){
             x+=2;
         }
         if(Greenfoot.isKeyDown("down")){
             if(y <= 357)
           y+=2;   
         }
         if(Greenfoot.isKeyDown("up")){
             if(y >= 280)
           y-=2;
         }
         setLocation(x,y);*/
        }    
    }
}
