import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Nos guarda el puntaje que se acumula en cada nivel.
 * 
 * @author (Alejo Hilario Angel Omar,    Miranda Victorino Aaron) 
 * @version (24-Mayo-2016)
 */
public class Player extends Actor
{
    /**
     * constructor
     */
    private int xPos , yPos;
    private GreenfootImage Img; 
    public Player(String nombreImg)
    {
        xPos = yPos  = 0;
        Img = new GreenfootImage(nombreImg);
    }
    
    public Player()
    {
        xPos = yPos  = 0;
        
    }
    
    public void act() 
    {
        Juego world = (Juego)getWorld();
        UserData[] us = world.getTrackedUsers();
        for (UserData u : us) {
            Joint derecha = u.getJoint(Joint.RIGHT_HAND);
            setLocation(derecha.getX(),derecha.getY());
            xPos= derecha.getX();
            yPos= derecha.getY();
        }
        
    }  
    
    /**
     * @param int puntaje   recibe el puntaje del jugador
     * Modifica el puntaje del jugador
     */
    public void setPuntos(int puntaje)
    {
        World mundo = getWorld();
        Juego mi_mundo =(Juego)mundo;
        puntaje = getPuntos();
        puntaje -=1;
        mi_mundo.setPuntos(puntaje);
    }
    
    /**
     * @return puntos regresa los puntos de mi jugador
     */
    public int getPuntos()
    {
        World mundo = getWorld();
        Juego mi_mundo =(Juego)mundo;
        return(mi_mundo.getPuntos());
    }
    
    /**
     * @param int vida recibe la vida del jugador
     * Modifica la vida del jugador
     */
    public void setVida(int vida)
    {
        World mundo = getWorld();
        Juego mi_mundo =(Juego)mundo;
        mi_mundo.setVida(vida);    
    }
    
    /**
     * @return int vida regresa vida del jugador
     */
    public int getVida()
    {
        World mundo = getWorld();
        Juego mi_mundo =(Juego)mundo;
        return(mi_mundo.getVida());
    }
    
    /**
     * @param int puntaje  recibe los puntos del jugador
     * aumenta los puntos de mi jugador 
     */
    public void setPuntosPositive(int puntaje)
    {
        World mundo = getWorld();
        Juego mi_mundo =(Juego)mundo;
        puntaje = mi_mundo.getPuntos();
        puntaje +=3;
        mi_mundo.setPuntos(puntaje);
    }
    
    public int getXpos(){
        return xPos;
    }
    
    public int getYpos(){
        return yPos;
    }
    
    /**
     * agrega mi imagen
     */
     public void agregaImg()
     {
        setImage(Img);
    }
    
     public void Escalar(int Width , int Height){
         Img.scale(Width,Height);
        }
}
