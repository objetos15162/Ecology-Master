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
    private GreenfootImage img;
    private String nombre;
    private int x , y;
    private SimpleTimer timer;
    private int currentMillis;
    private int delay;
    private boolean tocando;
    private boolean flagContenedor; 
    private boolean flagPuntos;
    private boolean flagTransparencia;
    
    public Basura(String nombre ,int delay, int x , int y )
    {
        this.nombre = nombre;
        tocando = false;
        currentMillis = 0;
         this.x =x;
         this.y = y;
        timer = new SimpleTimer();
        this.delay = delay;
        flagContenedor = false;
        flagTransparencia= false;
        flagPuntos = false;
    }
    
    public void act() 
    {
        CargarImagen(nombre);
  
        if(touchingContenedor())
            checkTransparencia();
        
    }
    
    public int getX()
    {
        return this.x;
    }
    
    public int getY()
    {
        return this.y ;
    }
    
    public void CargarImagen(String nombre)
    {
        img = new GreenfootImage(nombre);
        setImage(img);
    }
    
    public boolean touchme()
    {
        if(isTouching(Ancla.class) && !flagContenedor)
            tocando = true;
            
        return tocando;
    }
    
     public boolean touchingContenedor()
     {
        if(isTouching(Contenedor.class)) {
            flagContenedor= true;
            flagPuntos = true;
        }
        
        return flagContenedor;
    }
    
    public boolean transparencia()
    {    
       return flagTransparencia;
    }
    
    private void checkTransparencia()
    {
       if(flagContenedor ){
            img.setTransparency(0);     
            flagTransparencia = true;
       }  
    }
    
    public boolean getFlagPuntos()
    {    
        return flagPuntos;
    }
}
