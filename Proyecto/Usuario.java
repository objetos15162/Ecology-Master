import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *clase usuario, esta clase permite guardar el nombreJugador y puntuacion de un jugador
 *
 * @author (Alejo Hilario Angel Omar,    Miranda Victorino Aaron) 
 * @version (24-Mayo-2016)
 */
// PuntuacionJugador cariable que guarda los PuntuacionJugador
// nombreJugador variable que guarda el nombreJugador del jugador

public  class Usuario extends Actor
{
    private int PuntuacionJugador; // variable entera para guardar PuntuacionJugador
    private String nombreJugador; // variable String recibe el nombreJugador del jugador

    /**
     * Constructor del usuario
     */
    public Usuario()
    {
        PuntuacionJugador = 0;
        nombreJugador = "";
    }
    
    /** siempre inicializa las variables para que no existan errores
     * 
     */
    public void act() 
    {
       nombreJugador="";
       PuntuacionJugador=0;
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
    public void setPuntuacionJugador(int puntuacion)
    {
        PuntuacionJugador=puntuacion;
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
     * @return PuntuacionJugador
     * Regresa los PuntuacionJugador del jugador
     */
    public int getPuntuacionJugador()
    {
        return PuntuacionJugador;
    }    
}
