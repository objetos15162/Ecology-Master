import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Boton record.
 * Al dar click a este objeto nos manda a el mundo records.
 * 
 * @author (Alejo Hilario Angel Omar,    Miranda Victorino Aaron) 
 * @version (24-Mayo-2016)
 */
public class ButtonRecord extends Button
{
    /**
     * Lleva al menu de puntuacion
     */
    public ButtonRecord()
    {
        super();
    }
    
    public void act() 
    {
        if(isClicked()){
          Greenfoot.setWorld(new Puntuacion());  
        }
    }    
}
