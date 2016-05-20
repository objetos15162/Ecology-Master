import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ButtonRecord here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
