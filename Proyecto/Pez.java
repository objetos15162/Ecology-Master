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
    private String Nombre;// TOMA EL Nombre DE LA IMAGEN 
    private int Velocidad; // Velocidad DE MI PEX
    private boolean DireccionIzqDer; //DireccionIzqDer DE MI PEZ IZQUIERDA O DERECHA
    private GreenfootImage ImgPez ;  // Variable para cargar la imagen y obtener metodos que nos serviran mas adelante
    
    /**
     * @param int x posicion x
     * @param int y posicion y
     * @param String Nombre Nombre de la imagen
     * @param int Velocidad Velocidad del pez
     * @param boolean DireccionIzqDer bander que nos indica la DireccionIzqDer del pez
     */
    public Pez(int x , int y , String Nombre , int Velocidad , boolean DireccionIzqDer)
    {
        xPos = x;
        yPos = y;
        this.Nombre = Nombre;
        this.Velocidad = Velocidad;
        this.DireccionIzqDer = DireccionIzqDer;
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
    public void mover()
    {
        World mundo = getWorld();
        Mar mi_mundo =(Mar)mundo;
        
        if(xPos <= mi_mundo.getWidth() - ImgPez.getWidth() && DireccionIzqDer) {
            xPos+=Velocidad;
        }
        
        if(xPos >= ImgPez.getWidth() && !DireccionIzqDer) {
            xPos-=Velocidad;
        }
        
        if(xPos >= mi_mundo.getWidth() - ImgPez.getWidth() && DireccionIzqDer) {
           reiniciarPez();
        }
           
        if(xPos  <= ImgPez.getWidth()  && !DireccionIzqDer) {
            reiniciarPez();
        }
        setLocation(xPos,yPos);
    }
    
    /**
    * metodo para desaparecer pez y cambiar DireccionIzqDer
    */
    public void reiniciarPez()
    {
        World mundo = getWorld();
        Mar mi_mundo =(Mar)mundo;
        
        if(DireccionIzqDer) {
            xPos = ImgPez.getWidth();
        }
        else {
            xPos = mi_mundo.getWidth() - ImgPez.getWidth();
        }
     
        ImgPez.setTransparency(0);
        yPos=(int)(Math.random()*250+200);
        Velocidad = mi_mundo.generarAleatorio(7);
        ImgPez.setTransparency(255);
    }
    
    /**
     * @param Strin Nombre  recibe el Nombre de la imagen
     * metodo para cargar imagen del pez
     * 
     */
    public void cargarImagen(String Nombre)
    {
        ImgPez = new GreenfootImage(Nombre);
        setImage(ImgPez);
        ImgPez.scale(30,20);
    }
}