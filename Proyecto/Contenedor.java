import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class contenedor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Contenedor extends Actor
{
    /**
     * Act - do whatever the contenedor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage img;
    private int x , y;
    
    public Contenedor()
    {
        img = new GreenfootImage("recicla.png");
        x = 600;
        y = 100;    
    }
    
    public void act() 
    {
        setImage(img);
        setLocation(x,y);
        escalar();
    }    
    
    public int getX()
    {
        return x;
    }
    
    public int getY()
    {
        return y;
    }
    
    public void escalar()
    {
        img.scale(40,40 );
    }
}
