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
     * Mandamos a nuestra super clase nombre de la imagen de fondo
     */
    public Fondo(String nombre)
    {
        super(nombre);  
    }
    
    /**
     * Escala nuestra imagen
     */
    public void act() 
    {
        super.act();
        scaleimg(4000,100);
    }    
}
