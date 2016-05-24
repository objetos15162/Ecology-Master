import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Boton record.
 * Al dar click a este objeto nos manda a el mundo records.
 * 
 * @author (Alejo Hilario Angel Omar,    Miranda Victorino Aaron) 
 * @version (24-Mayo-2016)
 */
public class ButtonRecord extends Actor
{
    /**
     * Lleva al menu de puntuacion
     */
    public ButtonRecord()
    {
    }
    
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new Puntuacion());
        }
    }    
}
