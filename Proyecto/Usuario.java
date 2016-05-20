import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *clase usuario, esta clase permite guardar el nombre y puntuacion de un jugador
 */
// puntos cariable que guarda los puntos
// nombre variable que guarda el nombre del jugador

public  class Usuario extends Actor
{
    private int puntos; // variable entera para guardar puntos
    private String nombre; // variable String recibe el nombre del jugador

    /**
     * Constructor del usuario
     */
    public Usuario()
    {
        puntos = 0;
        nombre = "";
    }
    
    /** siempre inicializa las variables para que no existan errores
     * 
     */
    public void act() 
    {
       nombre="";
       puntos=0;
    }    
    
    /**
     * @Param String n  
     * Cambia el nombre del jugador
     */
    public void setNombre(String n)
    {
        nombre=n;
    }
    
    /**
     * @Param int p  
     * Cambia la puntuacion del jugador
     */
    public void setPuntos(int p)
    {
        puntos=p;
    }
    
    /**
     * @return nombre
     * Regresa el nombre del jugador
     */
    public String getNombre()
    {
        return nombre;
    }
    
    /**
     * @return puntos
     * Regresa los puntos del jugador
     */
    public int getPuntos()
    {
        return puntos;
    }    
}
