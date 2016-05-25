import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Nos crea los objetos animales, nos da el movimiento de estos tambien.
 * 
 * @author (Alejo Hilario Angel Omar,    Miranda Victorino Aaron) 
 * @version (24-Mayo-2016)
 */
public class Animal extends Player
{
    /**
     * Act - do whatever the animal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   
    
    /**
     * Constructor
     * @param int vida
     * @param int puntos
     * @param String nombre
     * recibe vida y puntos del jugador para modificarlos 
     * y recibe el nombre de la imagen
     */
    private int Vida, Puntos;
    private GifImage gifAnimal ;
    private String nombre;
    
    public Animal (int vida ,int puntos,String nombre){
        super();
        Vida = vida;
        Puntos = puntos;
        gifAnimal = new GifImage(nombre); 
    }
    
    /** 
     * modifica la posicion de mi animal  y verifica si toca animales
     */
    public void act() 
    {  
        super.act();
        isTouchingEnemy();
        setImage(gifAnimal.getCurrentImage());
        
           if( getYpos() >= 270) {
               setLocation(getXpos(),getYpos());
           }
    }    
     
    /**
     * Verifica si estamos tocando a un objeto del tipo gif(enemigo)
     */
    private void isTouchingEnemy()
    {
        if(isTouching(Gif.class)) {
            setPuntos(Puntos--);
            setVida(Vida-=1);
            removeTouching(Gif.class);
        }
    }
    
    
}
