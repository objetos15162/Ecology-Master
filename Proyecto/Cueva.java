import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Donde tienen que llegar los animales para ponerlos a salvo.
 * 
 * @author (Alejo Hilario Angel Omar,    Miranda Victorino Aaron) 
 * @version (24-Mayo-2016)
 */
public class Cueva extends Player
{
    /**
     * Act - do whatever the cueva wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

       /**
        * constructor
        * @param nombre
        * @param Puntuacion
        * 
        * Recibe el nombre de la imagen y la cantidad de Puntuacion del usuario
        */
    public Cueva(String nombre)
    {
        
        super(nombre);
        
    }
    
    /**
     * verifica si toca un animal
     * y agrega imagen
     */
    public void act() 
    {   
        agregaImg();
        isTouchingAnimal();
    }  
    
    /**
     * verifica si estamos tocando un objeto del tipo animal y lo elimina
     */
    private void isTouchingAnimal()
    {
        if(isTouching(Animal.class)) {
            deleteAnimal();            
        }
    }
    
    /**
     * elimina objeto del tipo animal
     */
    public void deleteAnimal() 
    {  
        removeTouching(Animal.class);    
    }
    
    /**
     * return boolean
     * verifica si estamos tocando objetoo del tipo animal
     */
    public boolean tocando()
    {
        boolean flag = false;
        if(isTouching(Animal.class)) {
            flag = true;
        }
        return flag;
    }
}
