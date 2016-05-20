import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Thumbnail here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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