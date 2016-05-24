import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Esta clase es para cargar las imagenes gif.
 * 
 * @author (Alejo Hilario Angel Omar,    Miranda Victorino Aaron) 
 * @version (24-Mayo-2016)
 */

public class Gif extends Actor
{
    GifImage gif ; // objeto tipo gif
    /**
    * @Param String nombre
    * Recibe el nombrede la imagen tipo gif
    */
    public Gif(String nombre)
    {
        gif = new GifImage(nombre);     
    }
    
    /**
     * pone la imagen
     */
    public void act() 
    {
        setImage(gif.getCurrentImage());
    }    
}

