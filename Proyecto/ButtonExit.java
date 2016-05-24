import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Es el boton de retorno al menu cuando estamos en los mundos Record y Ayuda.
 * 
 * @author (Alejo Hilario Angel Omar,    Miranda Victorino Aaron) 
 * @version (24-Mayo-2016)
 */
public class ButtonExit extends Actor
{
    /**
     * Act - do whatever the ButtonExit wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public ButtonExit()
    {
    }
    
    /**
     * cambia al menu 
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new Menu());
        }
    }    
}
