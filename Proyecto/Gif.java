import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tesoro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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

