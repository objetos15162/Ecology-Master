import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Nos crea los objetos animales, nos da el movimiento de estos tambien.
 * 
 * @author (Alejo Hilario Angel Omar,    Miranda Victorino Aaron) 
 * @version (24-Mayo-2016)
 */
public class Animal extends Puntaje
{
    /**
     * Act - do whatever the animal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int vida, puntos,x,y;
    GifImage gif ;
    private String nombre;
    
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
        Bosque world = (Bosque)getWorld();
        
           if( world.getY() >= 270) {
               setLocation(world.getX(),world.getY());
           }
        
        
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
        }
    }
    
    
}
