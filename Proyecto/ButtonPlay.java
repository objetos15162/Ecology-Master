import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Esta clase es del boton play.
 * Al darle click a este objeto nos manda a la clase Juego y se va al primer nivel.
 * 
 * @author (Alejo Hilario Angel Omar,    Miranda Victorino Aaron) 
 * @version (24-Mayo-2016)
 */
public class ButtonPlay extends Button
{
    /**
     * Inicia el juego
     */
    public ButtonPlay()
    {
        super();
    }
    
    public void act() 
    {
        if(isClicked()){
            Greenfoot.setWorld(new Juego(1,true));
        }
    }    
}
