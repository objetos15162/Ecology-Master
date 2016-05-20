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
    
    /**
     * @param int x posicion x
     * @param int y posicion y
     * @param String nombre nombre de la imagen
     * @param int velocidad velocidad del pez
     * @param boolean direccion bander que nos indica la direccion del pez
     */
    public Pez(int x , int y , String nombre , int velocidad , boolean direccion)
    {
        this.x = x;
        this.y = y;
        this.nombre = nombre;
        this.velocidad = velocidad;
        this.direccion = direccion;
        cargarImagen(nombre);
    }
    
    /**
     * mueve a los peces
     */
    public void act() 
    {
        mover();
    }    
    
    /**
     * Metodo para mover a mi pez dentro del mundo
     */
    public void mover()
    {
        World mundo = getWorld();
        Mar mi_mundo =(Mar)mundo;
        
        if(x <= mi_mundo.getWidth() - img.getWidth() && direccion) {
            x+=velocidad;
        }
        
        if(x >= img.getWidth() && !direccion) {
            x-=velocidad;
        }
        
        if(x >= mi_mundo.getWidth() - img.getWidth() && direccion) {
           reiniciarPez();
        }
           
        if(x  <= img.getWidth()  && !direccion) {
            reiniciarPez();
        }
        setLocation(x,y);
    }
    
    /**
    * metodo para desaparecer pez y cambiar direccion
    */
    public void reiniciarPez()
    {
        World mundo = getWorld();
        Mar mi_mundo =(Mar)mundo;
        
        if(direccion) {
            x = img.getWidth();
        }
        else {
            x = mi_mundo.getWidth() - img.getWidth();
        }
     
        img.setTransparency(0);
        y=(int)(Math.random()*250+200);
        velocidad = mi_mundo.generar(7);
        img.setTransparency(255);
    }
    
    /**
     * @param Strin nombre  recibe el nombre de la imagen
     * metodo para cargar imagen del pez
     * 
     */
    public void cargarImagen(String nombre)
    {
        img = new GreenfootImage(nombre);
        setImage(img);
        img.scale(30,20);
    }
}