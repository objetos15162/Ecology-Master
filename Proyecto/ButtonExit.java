import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Es el boton de retorno al menu cuando estamos en los mundos Record y Ayuda.
 * 
 * @author (Alejo Hilario Angel Omar,    Miranda Victorino Aaron) 
 * @version (24-Mayo-2016)
 */
public class ButtonExit extends Button
{
    /**
     * Act - do whatever the ButtonExit wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public ButtonExit()
    {
        super();
    }
    
    /**
     * Si el boton esta presionado , cambiamos de mundo
     */
    public void act() 
    {
        if(isClicked()){
           Greenfoot.setWorld(new Menu());
        }
    }    
}
