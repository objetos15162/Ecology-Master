import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class fondo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fondo extends Actor
{
    /**
     * Act - do whatever the fondo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       GreenfootImage img = new GreenfootImage("olas.png");
       setImage(img);      
       img.scale(4000,100);
    }    
}
