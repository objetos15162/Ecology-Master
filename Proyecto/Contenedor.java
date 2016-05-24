import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Es el contenedor para la basura.
 * Si llega una basura, esta aumenta el puntaje.
 * 
 * @author (Alejo Hilario Angel Omar,    Miranda Victorino Aaron) 
 * @version (24-Mayo-2016)
 */
public class Contenedor extends Puntaje
{
    GreenfootImage img;
    private int x , y;
    
    /**
     * Constructor
     */
    public Contenedor()
    {
        img = new GreenfootImage("recicla.png");
        x = 600;
        y = 100;
    }
    
    /**
     * escala imagen , elimina y posiciona
     */
    public void act() 
    {
        setImage(img);
        setLocation(x,y);
        escalar();
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
    
    /**
     * @return int
     * retorna posicion en X
     */
    public int getX()
    {
        return x;
    }
    
    /**
     * @return int
     * retorna posicion en Y
     * 
     */
    public int getY()
    {
        return y;
    }
    
    /**
     * escala la imagen
     */
    public void escalar()
    {
        img.scale(40,40 );
    }
}
