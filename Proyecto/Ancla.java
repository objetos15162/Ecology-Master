import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ancla here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ancla extends Puntos
{
    private int x , y;
    GreenfootImage img; 
    private boolean flagPez;
    private int puntos , vida;
    private boolean flagBasura, flagContenedor;
    
    /**
     * constructor
     */
    public Ancla ()
    {
        super();
        img =  new GreenfootImage("ancla.png");
        x = 250;
        y = 50;
        agregar();
        flagBasura = flagPez = false;
        puntos = 0;
        vida = 10;
    }
    
    /**
     * obtiene la posicion de mi usuario y  esta checando si toca a un pez
     */
    public void act() 
    {
        posicionar();  
        //mar world =   (mar)getWorld();
        Juego world = (Juego)getWorld();
        UserData[] us = world.getTrackedUsers();
        /* if(Greenfoot.isKeyDown("down")){
           y+=2;   
         }
         if(Greenfoot.isKeyDown("up")){
           y-=2;
         }
         if(Greenfoot.isKeyDown("left")){
             x-=2;
         }
         if(Greenfoot.isKeyDown("right")){
             x+=2;
         }
         setLocation(x,y);*/
        for (UserData u : us) {
            Joint derecha = u.getJoint(Joint.RIGHT_HAND);
            setLocation(derecha.getX(),derecha.getY());
            x= derecha.getX();
            y= derecha.getY();
        }
        
        if(tocandoPez()) {
             eliminaPez();
        }
        isTouchingcontenedor();
    }
    /**
         * @return boolean
         * verifica si estamos tocando un objeto del tipo basura
         */
    public boolean touchingBasura()
    {            
        if(isTouching(Basura.class)) {
                flagBasura = true;
            }
         else {
            flagBasura = false;
        }
        return flagBasura;
    }
     
    /**
     * Posiciona objeto
     */
    public void posicionar()
    {
        setLocation(x,y);
    }
    
    /**
     * agrega mi imagen
     */
     public void agregar()
     {
        setImage(img);
    }

    /**
     * Metodo para eliminar a mi clase pez y modifica puntuacion
     */
    private void eliminaPez()
    {
        setPuntos(getPuntos());
        removeTouching(Pez.class);
    }
    
    /**
     * @return boolean
     * retorna bandea si esta tocando algun objeto del tipo pez
     */
    private boolean tocandoPez()
    {
        if(isTouching(Pez.class)) {
            setVida(vida-=1);
            return true;
        }
        else {
            return false;
        }
    }
    
    /**
     * @return boolean
     * retorna si estamos tocando el contenedor
     */
    
    public boolean isTouchingcontenedor()
    {
        if(isTouching(Contenedor.class)) {
            flagContenedor = true;
        }
        return flagContenedor;        
    }
}
