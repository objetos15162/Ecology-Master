import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Fondo nivel uno.
 * 
 * @author (Alejo Hilario Angel Omar,    Miranda Victorino Aaron) 
 * @version (24-Mayo-2016)
 */
public class FondoOceano extends Actor
{
    /**
     * Act - do whatever the fondooceano wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public FondoOceano()
    {
    }
    
    /**
     * establece fondo de oceano
     */
    public void act() 
    {
       GreenfootImage img = new GreenfootImage("fondo.jpg");     
       setImage(img); 
       img.scale(1100,590);
    }    
}