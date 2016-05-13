import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class fondooceano here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FondoOceano extends Actor
{
    /**
     * Act - do whatever the fondooceano wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       GreenfootImage img = new GreenfootImage("fondo.jpg");     
       setImage(img); 
       img.scale(1100,590);
    }    
}