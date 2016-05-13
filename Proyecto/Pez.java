import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.lang.Math.*;
/**
 * Write a description of class pez here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pez extends Actor
{
    private int x;
    private int y;
    private String nombre;
    private int velocidad;
    private boolean direccion;
    private GreenfootImage img ;
    
    public Pez(int x , int y , String nombre , int velocidad , boolean direccion)
    {
        this.x = x;
        this.y = y;
        this.nombre = nombre;
        this.velocidad = velocidad;
        this.direccion = direccion;
        CargarImagen(nombre);
    }
    
    public void act() 
    {
        mover();
    }    
    
    public void mover()
    {
        World mundo = getWorld();
        Mar mi_mundo =(Mar)mundo;
        
        if(x <= mi_mundo.getWidth() - img.getWidth() && direccion)
            x+=velocidad;
        
        if(x >= img.getWidth() && !direccion)
            x-=velocidad;
        
        if(x >= mi_mundo.getWidth() - img.getWidth() && direccion)
           ReiniciarPez();
           
        if(x  <= img.getWidth()  && !direccion)
            ReiniciarPez();
           
        setLocation(x,y);
    }
  
    public void ReiniciarPez()
    {
        World mundo = getWorld();
        Mar mi_mundo =(Mar)mundo;
        
        if(direccion)
            x = img.getWidth();
        else
            x = mi_mundo.getWidth() - img.getWidth();
     
        img.setTransparency(0);
        y=(int)(Math.random()*250+200);
        velocidad = mi_mundo.generar(7);
        img.setTransparency(255);
    }
    
    public void CargarImagen(String nombre)
    {
        img = new GreenfootImage(nombre);
        setImage(img);
        img.scale(30,20);    
    }
}