import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Nos muestra la ayuda del juego.
 * 
 * @author (Alejo Hilario Angel Omar,    Miranda Victorino Aaron) 
 * @version (24-Mayo-2016)
 */
public class Ayuda extends World
{
    /**
     * Constructor de objeto ayuda , solamente el texto de ayuda
     */
    public Ayuda()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(650, 470, 1); 
        addObject(new ButtonExit(),630,460);
    }
}
