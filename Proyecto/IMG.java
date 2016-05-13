import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class IMG here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class IMG extends Actor
{
    /**
     * Act - do whatever the IMG wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage img;
    private  String name;
    
    public IMG(String name)
    {
        this.name = name;    
    }
    
    public void act() 
    {
        setImagen();    
    }   
    
    public void  setImagen()
    {
        img = new GreenfootImage(name);
        setImage(img);
    }
    
    
    
}
