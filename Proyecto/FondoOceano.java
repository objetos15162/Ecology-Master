import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Fondo nivel uno.
 * 
 * @author (Alejo Hilario Angel Omar,    Miranda Victorino Aaron) 
 * @version (24-Mayo-2016)
 */
public class FondoOceano extends FondosJuego
{
    /**
     * Act - do whatever the fondooceano wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public FondoOceano()
    {
        super("fondo.jpg");
    }
    
    /**
     * establece fondo de oceano
     */
    public void act() 
    {
        super.act();
        scaleImg(1100,590);
    }    
}