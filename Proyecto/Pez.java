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
    private int xPos; // PERMITE AL PEZ MOVERSE EN EL EJE X!!!!!!!!!!!!!!!!
    private int yPos; // PERMITE AL PEZ MOVERESE EN EL EJE Y!!!!!!!!!!!!
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
        World mundo = getWorld();
        Mar mi_mundo =(Mar)mundo;
        
        if(xPos <= mi_mundo.getWidth() - imgPez.getWidth() && direccionIzqDer) {
            xPos+=velocidad;
        }
        
        if(xPos >= imgPez.getWidth() && !direccionIzqDer) {
            xPos-=velocidad;
        }
        
        if(xPos >= mi_mundo.getWidth() - imgPez.getWidth() && direccionIzqDer) {
           reiniciarPez();
        }
           
        if(xPos  <= imgPez.getWidth()  && !direccionIzqDer) {
            reiniciarPez();
        }
        setLocation(xPos,yPos);
    }
    
    /**
    * metodo para desaparecer pez y cambiar DireccionIzqDer
    */
    private void reiniciarPez()
    {
        World mundo = getWorld();
        Mar mi_mundo =(Mar)mundo;
        
        if(direccionIzqDer) {
            xPos = imgPez.getWidth();
        }
        else {
            xPos = mi_mundo.getWidth() - imgPez.getWidth();
        }
     
        imgPez.setTransparency(0);
        yPos=(int)(Math.random()*250+200);
        velocidad = mi_mundo.generarAleatorio(7);
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