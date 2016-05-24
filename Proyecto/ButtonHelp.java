import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Boton de ayuda.
 * Al hacer click al objeto, Nos manda al mundo Ayuda
 * 
 * @author (Alejo Hilario Angel Omar,    Miranda Victorino Aaron) 
 * @version (24-Mayo-2016)
 */
public class ButtonHelp extends Actor
{
    /**
     * RNos lleva al menu de ayuda
     */
    public ButtonHelp()
    {
    }
    
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new Ayuda());
        }
    }    
}
