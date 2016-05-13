import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tesoro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tesoro extends Actor
{
    GifImage gif = new GifImage("tesoro.gif");
    
    public void act() 
    {
        setImage(gif.getCurrentImage());
    }    
}

