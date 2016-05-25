import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fondos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FondosJuego extends Actor
{
    GreenfootImage Img ;
    /**
     * Act - do whatever the Fondos wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public FondosJuego(String NomImg){
        Img = new GreenfootImage(NomImg);
    }
    public void act() 
    {
        setImage(Img); 
    }   
    
    public void scaleImg (int Width , int Height){
        Img.scale(Width,Height);
    }
}

            
       