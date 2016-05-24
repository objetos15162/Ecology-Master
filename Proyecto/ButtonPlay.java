import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Esta clase es del boton play.
 * Al darle click a este objeto nos manda a la clase Juego y se va al primer nivel.
 * 
 * @author (Alejo Hilario Angel Omar,    Miranda Victorino Aaron) 
 * @version (24-Mayo-2016)
 */
public class ButtonPlay extends Actor
{
    /**
     * Inicia el juego
     */
    public ButtonPlay()
    {
    }
    
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new Juego(1,true));
        }
    }    
}
