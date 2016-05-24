import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Esta clase, es para regar a los arboles.
 * 
 * 
 * @author (Alejo Hilario Angel Omar,    Miranda Victorino Aaron) 
 * @version (24-Mayo-2016)
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
        
           if( y <= 357) {
               setLocation(x,y);
            }
        }    
    }
}
