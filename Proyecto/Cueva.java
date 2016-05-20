import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cueva here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cueva extends Puntos
{
    /**
     * Act - do whatever the cueva wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage img ;
    private int puntos;
       /**
        * constructor
        * @param nombre
        * @param puntos
        * 
        * Recibe el nombre de la imagen y la cantidad de puntos del usuario
        */
    public Cueva(String nombre, int puntos)
    {
        img =  new GreenfootImage(nombre);
        this.puntos = puntos;
    }
    
    /**
     * verifica si toca un animal
     * y agrega imagen
     */
    public void act() 
    {   
        setImage(img);
        isTouchingAnimal();
    }  
    
    /**
     * verifica si estamos tocando un objeto del tipo animal y lo elimina
     */
    private void isTouchingAnimal()
    {
        if(isTouching(Animal.class)) {
            setPuntosPositive(puntos++);
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
