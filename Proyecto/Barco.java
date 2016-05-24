import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Nos muestra la imagen del barco y le da direccion en el eje y.
 * 
 * @author (Alejo Hilario Angel Omar,    Miranda Victorino Aaron) 
 * @version (24-Mayo-2016)
 */
public class Barco extends Actor
{
    /**
     * Act - do whatever the barco wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage img; 
    private int x;
    private int y;
    
    /**
     * Constructor
     */
    public Barco()
    {
        img =  new GreenfootImage("barco.png");
        x = 250;
        y = 50;
        agregar();
    }
    
    /**
     * cambia la posicion de mi barco
     */
    public void act() 
    {
        Mar world =   (Mar)getWorld();
        UserData[] us = world.getTrackedUsers(); 
        for (UserData u : us) {
            Joint derecha = u.getJoint(Joint.RIGHT_HAND);
            setLocation(derecha.getX(),50);
            x = derecha.getX();
            y = derecha.getY();
        }
    }
    
    /**
     * Metodo para agregar y escalar imagen
     */
    public void agregar()
    {    
        setImage(img);
        img.scale(70,70);
    }
}
