import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.lang.Math.*;
/**
 * Esta clase nos muestra los peces.
 * Le da el movimiento a los peces.
 * 
 * @author (Alejo Hilario Angel Omar,    Miranda Victorino Aaron) 
 * @version (24-Mayo-2016)
 */
public class Pez extends Actor
{
   
    private String nombre;// TOMA EL Nombre DE LA IMAGEN 
    private int velocidad; // Velocidad DE MI PEX
    private boolean direccionIzqDer; //DireccionIzqDer DE MI PEZ IZQUIERDA O DERECHA
    private GreenfootImage imgPez ;  // Variable para cargar la imagen y obtener metodos que nos serviran mas adelante
    
    /**
     * 
     * @param String Nombre Nombre de la imagen
     * @param int Velocidad Velocidad del pez
     * @param boolean DireccionIzqDer bander que nos indica la DireccionIzqDer del pez
     */
    public Pez( String Nombre , int Velocidad , boolean DireccionIzqDer)
    {
        
        this.nombre = Nombre;
        this.velocidad = Velocidad;
        this.direccionIzqDer = DireccionIzqDer;
        cargarImagen(Nombre);
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
    private void mover()
    {
        int posicionPezx = getX(); 
        int posicionPezy = getY();  
          
        World mundo = getWorld();
        Mar miMundo =(Mar)mundo;
        
        if(posicionPezx <= miMundo.getWidth() - imgPez.getWidth() && direccionIzqDer) {
            posicionPezx+=velocidad;
        }
        
        if(posicionPezx >= imgPez.getWidth() && !direccionIzqDer) {
            posicionPezx-=velocidad;
        }
        
        if(posicionPezx >= miMundo.getWidth() - imgPez.getWidth() && direccionIzqDer) {
           
            reiniciarPez();
            if(direccionIzqDer) {
            posicionPezx = imgPez.getWidth();
            posicionPezy=(int)(Math.random()*250+200);
       }
           
       }
           
       if(posicionPezx  <= imgPez.getWidth()  && !direccionIzqDer) {
            
            reiniciarPez();
            posicionPezx = miMundo.getWidth() - imgPez.getWidth();
            posicionPezy=(int)(Math.random()*250+200);
        }
        
        
        setLocation(posicionPezx,posicionPezy);
    }
    
    /**
    * metodo para desaparecer pez y cambiar DireccionIzqDer
    */
    private void reiniciarPez( )
    {
        
        World mundo = getWorld();
        Mar miMundo =(Mar)mundo;
        imgPez.setTransparency(0);
        
        velocidad = miMundo.generarAleatorio(7);
        imgPez.setTransparency(255);
    }
    
    
    /**
     * @param Strin Nombre  recibe el Nombre de la imagen
     * metodo para cargar imagen del pez
     * 
     */
    private void cargarImagen(String Nombre)
    {
        imgPez = new GreenfootImage(Nombre);
        setImage(imgPez);
        imgPez.scale(30,20);
    }
    
    
}