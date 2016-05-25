import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Boton de ayuda.
 * Al hacer click al objeto, Nos manda al mundo Ayuda
 * 
 * @author (Alejo Hilario Angel Omar,    Miranda Victorino Aaron) 
 * @version (24-Mayo-2016)
 */
public class ButtonHelp extends Button
{
    /**
     * RNos lleva al menu de ayuda
     */
    public ButtonHelp()
    {
        super();
    }
    
    /**
     * Si el boton esta presionado , cambiamos de mundo
     */
    public void act() 
    {
        
         if(isClicked()){
            Greenfoot.setWorld(new Ayuda());
        }
    }    
}
