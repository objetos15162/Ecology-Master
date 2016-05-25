import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Fondo en mundo Ayuda y Record.
 * 
 * @author (Alejo Hilario Angel Omar,    Miranda Victorino Aaron) 
 * @version (24-Mayo-2016)
 */
public class Fondo extends FondosJuego
{
    
    
    
    /**
     * Constructor
     * @param String nombre  recibe el nombre del fondo
     */
    public Fondo(String nombre)
    {
        super(nombre);  
    }
    
    /**
     * Añade el objeto de imagen
     */
    public void act() 
    {
        super.act();
        scaleImg(4000,100);
    }    
}
