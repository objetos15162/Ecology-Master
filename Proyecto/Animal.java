import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class animal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Animal extends Puntos
{
    /**
     * Act - do whatever the animal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int vida, puntos,x,y;
    GifImage gif ;
    
    /**
     * Constructor
     * @param int vida
     * @param int puntos
     * @param String nombre
     * recibe vida y puntos del jugador para modificarlos 
     * y recibe el nombre de la imagen
     */
    public Animal (int vida ,int puntos,String nombre){
        super();
        x=650;
        y=440;
        this.vida = vida;
        this.puntos = puntos;
        gif = new GifImage(nombre); 
    }
    
    /** 
     * modifica la posicion de mi animal  y verifica si toca animales
     */
    public void act() 
    {
        isTouchingEnemy();
        setImage(gif.getCurrentImage());
        Juego world = (Juego)getWorld();
        UserData[] us = world.getTrackedUsers();
        for (UserData u : us) {
            Joint derecha = u.getJoint(Joint.RIGHT_HAND);
            y= derecha.getY();
            x= derecha.getX();
        
           if( y >= 270) {
               setLocation(x,y);
           }
        }
        /*if(Greenfoot.isKeyDown("down")){
            if(y <= 440)
          y+=2;   
        }
        if(Greenfoot.isKeyDown("up")){
            if(y >= 280)
          y-=2;
        }
        if(Greenfoot.isKeyDown("left")){
            x-=2;
        }
        if(Greenfoot.isKeyDown("right")){
            x+=2;
        }
        setMove(x,y);
        */
    }    
    
    /**
     * @param int x
     * @param int y
     * 
     * Modifica la posicion de mi imagen 
     */
    private void setMove(int x , int y)
    {
        setLocation(x-100,y);
    }
    
    /**
     * Verifica si estamos tocando a un objeto del tipo gif(enemigo)
     */
    private void isTouchingEnemy()
    {
        if(isTouching(Gif.class)) {
            setPuntos(puntos--);
            setVida(vida-=1);
            removeTouching(Gif.class);
            y = 480;
        }
    }
}
