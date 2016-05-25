import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Es el contenedor para la basura.
 * Si llega una basura, esta aumenta el puntaje.
 * 
 * @author (Alejo Hilario Angel Omar,    Miranda Victorino Aaron) 
 * @version (24-Mayo-2016)
 */
public class Contenedor extends Player
{
    
    
    /**
     * Constructor
     */
    public Contenedor()
    {
        super("recicla.png");
    }
    
    /**
     * escala imagen , elimina y posiciona
     */
    public void act() 
    {   
        agregaImg();
        setLocation(600,100);
        Escalar(40,40);
        elimina();
    }    
    
    /**
     * metodo que elimina basura y aumenta puntos
     */
    public void  elimina()
    {
        if(isTouching(Basura.class)) {
            removeTouching(Basura.class);
            setPuntosPositive(getPuntos());
        }
    }
    
}
