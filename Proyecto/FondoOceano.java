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
     * Manda a nuestra super clase el nombre de nuestro fondo
     */
    public FondoOceano()
    {
        super("fondo.jpg");
    }
    
    /**
     * escala  nuestra imagen
     */
    public void act() 
    {
        super.act();
        scaleimg(1100,590);
    }    
}