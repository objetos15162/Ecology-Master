import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.lang.Math.*;
/**
 * Write a description of class basura here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Basura extends Actor
{
    private GreenfootImage img; // objeto tipo imagen
    private String nombre; // objeto para guardar nombre de imagen
    private int x , y; // posicion x y y
    private boolean tocando; // bandera
    private boolean flagContenedor; // bandera Contenedor
    /**
     * Constructor
     * @param nombre  nombre de la imagen
     * @param int x posicion objeto
     * @param int y posicon objeto
     */
    public Basura(String nombre , int x , int y )
    {
        this.nombre = nombre;
        tocando = false;
        this.x =x;
        this.y = y;
    }
    
    /**
     * posiciona la basura en random
     */
    public void act() 
    {
        World m = getWorld();
        Mar mundo = (Mar)m;
        
        CargarImagen(nombre);
        
        if( touchme()) {
            setPosition(mundo.getAnclaLocationX(),mundo.getAnclaLocationY());
        }
    }
    
    /**
     * @return regresa posicion X
     */
    public int getX()
    {
        return this.x;
    }
    
    /**
     * @return regresa posicion y
     */
    public int getY()
    {
        return this.y;
    }
    
    /**
     * @param nombre
     * carga la imagen
     */
    public void CargarImagen(String nombre)
    {
        img = new GreenfootImage(nombre);
        setImage(img);
    }
    
    /**
     * @return tocando  
     * retorna bandera si esta tocando el ancla
     */
    public boolean touchme()
    {
        if(isTouching(Ancla.class) /*&& !flagContenedor*/) {
            tocando = true;
        }
        return tocando;
    }
    
    /**
     * @param int x  modifica posicion x
     * @param int y modifica posicion y
     */
    public void setPosition(int x , int y )
    {
        setLocation(x,y);
    }
}
