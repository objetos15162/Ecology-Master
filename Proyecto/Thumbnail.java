import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Esta clase es para visualizar al jugador en el kinect
 * 
 * @author (Alejo Hilario Angel Omar,    Miranda Victorino Aaron) 
 * @version (24-Mayo-2016)
 */
public class Thumbnail  extends Actor
{
    public Thumbnail()
    {
    }

    /**
     *Pone imagen para visualizar a nuestro jugador
     */
    public void act() 
    {
        GreenfootImage img = ((KinectWorld)getWorld()).getThumbnailUnscaled();
        setImage(img);
    }
}