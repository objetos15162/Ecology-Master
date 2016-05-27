import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *clase usuario, esta clase permite guardar el nombreJugador y puntuacion de un jugador
 *
 * @author (Alejo Hilario Angel Omar,    Miranda Victorino Aaron) 
 * @version (24-Mayo-2016)
 */
// puntuacionJugador cariable que guarda los puntuacionJugador
// nombreJugador variable que guarda el nombreJugador del jugador

public  class Usuario extends Actor
{
    private int puntuacionJugador; // variable entera para guardar puntuacionJugador
    private String nombreJugador; // variable String recibe el nombreJugador del jugador

    /**
     * Constructor del usuario
     */
    public Usuario()
    {
        puntuacionJugador = 0;
        nombreJugador = "";
    }
    
    /** siempre resetea las variables para que no existan errores
     * 
     */
    public void act() 
    {
       nombreJugador="";
       puntuacionJugador=0;
    }    
    
    /**
     * @Param String n  
     * Cambia el nombreJugador del jugador
     */
    public void setnombreJugador(String n)
    {
        nombreJugador=n;
    }
    
    /**
     * @Param int p  
     * Cambia la puntuacion del jugador
     */
    public void setpuntuacionJugador(int puntuacion)
    {
        puntuacionJugador=puntuacion;
    }
    
    /**
     * @return nombreJugador
     * Regresa el nombreJugador del jugador
     */
    public String getnombreJugador()
    {
        return nombreJugador;
    }
    
    /**
     * @return puntuacionJugador
     * Regresa los puntuacionJugador del jugador
     */
    public int getpuntuacionJugador()
    {
        return puntuacionJugador;
    }    
}
