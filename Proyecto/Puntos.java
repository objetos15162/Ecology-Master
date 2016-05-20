import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class puntos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Puntos extends Actor
{
    /**
     * constructor
     */
    public Puntos()
    {
    }
    
    public void act() 
    {
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
}
