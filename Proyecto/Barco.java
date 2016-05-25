import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Nos muestra la imagen del barco y le da direccion en el eje y.
 * 
 * @author (Alejo Hilario Angel Omar,    Miranda Victorino Aaron) 
 * @version (24-Mayo-2016)
 */
public class Barco extends Player
{
    /**
     * Act - do whatever the barco wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    /**
     * Constructor
     */
    public Barco()
    {   super("barco.png");
    }
    
    /**
     * cambia la posicion de mi barco
     */
    public void act() 
    { 
        super.act();
       agregaImg();
      setLocation(getXpos(),50);
      Escalar(70,70);
    }
    
    
}
