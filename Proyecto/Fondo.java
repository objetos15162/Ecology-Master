import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Fondo en mundo Ayuda y Record.
 * 
 * @author (Alejo Hilario Angel Omar,    Miranda Victorino Aaron) 
 * @version (24-Mayo-2016)
 */
public class Fondo extends Actor
{
    
    private String nombre ; // variable que guarda el nombre del fondo
    
    /**
     * Constructor
     * @param String nombre  recibe el nombre del fondo
     */
    public Fondo(String nombre)
    {
        this.nombre = nombre;    
    }
    
    /**
     * Añade el objeto de imagen
     */
    public void act() 
    {
       GreenfootImage img = new GreenfootImage(nombre);
       setImage(img);      
       img.scale(4000,100);
    }    
}
