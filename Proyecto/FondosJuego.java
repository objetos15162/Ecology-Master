import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fondos here.
 * 
  @author (Alejo Hilario Angel Omar,    Miranda Victorino Aaron) 
 * @version (24-Mayo-2016)
 */
public class FondosJuego extends Actor
{
    GreenfootImage img ; // Cargar imagen de fondo
    /**
     * @Param String Nomimg recibe el nombre del fondo 
     */
    
    public FondosJuego(String Nomimg){
        img = new GreenfootImage(Nomimg);
    }
    public void act() 
    {
        setImage(img);  
    }   
    
    /**
     * @Param int Width   
     * @Param int Height
     * 
     * Este metodo sirve unicamente para escalar nuestra imagen de fondo
     */
    public void scaleimg (int Width , int Height){
        img.scale(Width,Height);
    }
}

            
       