import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fondos here.
 * 
  @author (Alejo Hilario Angel Omar,    Miranda Victorino Aaron) 
 * @version (24-Mayo-2016)
 */
public class FondosJuego extends Actor
{
    GreenfootImage Img ; // Cargar imagen de fondo
    /**
     * @Param String NomImg recibe el nombre del fondo 
     */
    
    public FondosJuego(String NomImg){
        Img = new GreenfootImage(NomImg);
    }
    public void act() 
    {
        setImage(Img);  
    }   
    
    /**
     * @Param int Width   
     * @Param int Height
     * 
     * Este metodo sirve unicamente para escalar nuestra imagen de fondo
     */
    public void scaleImg (int Width , int Height){
        Img.scale(Width,Height);
    }
}

            
       