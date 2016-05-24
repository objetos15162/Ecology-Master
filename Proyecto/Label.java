import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Nos muestra mensajes.
 * 
 * @author (Alejo Hilario Angel Omar,    Miranda Victorino Aaron) 
 * @version (24-Mayo-2016)
 */

public class Label extends Actor
{
    /**
     * @Param String text  nombre del texto
     */
    public Label(String text)
    {
        setText(text);
    }
    
     /**
     * @Param String text  nombre del texto
     * @Param int size tamaño del texto
     */
    public Label(String text, int size)
    {
        setText(text, size);
    }
    
    /**
     * @String text
     * Modifica el texto
     */
    public void setText(String text)
    {
        setText(text, 20);
    }
    
    /**
     * @String text
     * @int size
     * Modifica el texto
     */
    public void setText(String text, int size)
    {
        setImage(new GreenfootImage(text, size, java.awt.Color.BLACK, new java.awt.Color(0,0,0,0)));
    }

    public void act() 
    {
    }    
}