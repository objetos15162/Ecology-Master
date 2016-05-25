import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Button here.
 *  @author (Alejo Hilario Angel Omar,    Miranda Victorino Aaron) 
 * @version (24-Mayo-2016)
 */
public class Button extends Actor
{
    /**
     * Act - do whatever the Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Button(){
        
    }
    
    public void act() 
    {
       
    }    
    
    /**
     * Metodo que verifica si estamos presionando el boton con el mouse
     * @return boolean regresa verdadero si el boton esta presionado
     */
    public boolean isClicked(){
        if(Greenfoot.mouseClicked(this))
        return true;
        else
        return false;
    }
    
    
    
}
