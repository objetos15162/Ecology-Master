import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.lang.Math.*;
/**
 * Nos muestra los objeto basura.
 * Nos indica su posicion, y nos indica si fue tocado.
 * 
 * @author (Alejo Hilario Angel Omar,    Miranda Victorino Aaron) 
 * @version (24-Mayo-2016)
 */
public class Basura extends Player
{
    
   
    private boolean tocandoAncla; // bandera
    private boolean flagContenedor; // bandera Contenedor
    /**
     * Constructor
     * @param nombre  nombre de la imagen
     * @param int x posicion objeto
     * @param int y posicon objeto
     */
    public Basura(String nombre , int x , int y )
    {
        super(nombre);
        tocandoAncla = false;
        setLocation(x,y);
    }
    
    /**
     * posiciona la basura en random
     */
    public void act() 
    {  
       
        World m = getWorld();
        Mar mundo = (Mar)m;
        agregaImg();
        if( touchme()) {
            setPosition(mundo.getAnclaLocationX(),mundo.getAnclaLocationY());
        }
    }
    
    
    /**
     * @return tocando  
     * retorna bandera si esta tocando el ancla
     */
    public boolean touchme()
    {
        if(isTouching(Ancla.class) ) {
            tocandoAncla = true;
        }
        else
            tocandoAncla = false;
        return tocandoAncla;
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
