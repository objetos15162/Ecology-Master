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
     * Variable de instancia xPos y Ypos sirven para obtener de nuestro jugador
     * la posicion en X y Y de su mano derecha 
     */
    private int ejeX , ejeY;  // variables que almacenan la posicion en X y Y de los movimientos de nuestra mano X y Y
    private GreenfootImage img;  // Cargamos nuestra imagen que nos manden nuestras subclases
    
    /**
     * Constructor
     * @Param String nombreImg   recibe el nombre de la imagen 
     * 
     * Inicializa nuestras variables de instancia
     */
    public Player(String nombreImg)
    {
        ejeX = ejeY  = 0;
        img = new GreenfootImage(nombreImg);
    }
    
    /**
     * Constructor , inicializa variables de instancia
     */
    public Player()
    {
        ejeX= ejeY  = 0;
    }
    
    /**
     * Obtiene la posicion de X y Y de nuestro usuario de su mano derecha y las asigna a nuestras variables
     * Xpos y Ypos
     */
    public void act() 
    {
        Juego world = (Juego)getWorld();
        UserData[] us = world.getTrackedUsers();
        for (UserData u : us) {
            Joint derecha = u.getJoint(Joint.RIGHT_HAND);
            setLocation(derecha.getX(),derecha.getY());
            ejeX= derecha.getX();
            ejeY= derecha.getY();
        }
        
    }  
    
    /**
     * @param int puntaje   recibe el puntaje del jugador
     * Modifica el puntaje del jugador
     */
    public void setPuntos(int puntaje)
    {
        World mundo = getWorld();
        Juego miMundo =(Juego)mundo;
        puntaje = getPuntos();
        puntaje -=1;
        miMundo.setPuntos(puntaje);
    }
    
    /**
     * @return puntos regresa los puntos de mi jugador
     */
    public int getPuntos()
    {
        World mundo = getWorld();
        Juego miMundo =(Juego)mundo;
        return(miMundo.getPuntos());
    }
    
    /**
     * @param int vida recibe la vida del jugador
     * Modifica la vida del jugador
     */
    public void setVida(int vida)
    {
        World mundo = getWorld();
        Juego miMundo =(Juego)mundo;
        miMundo.setVida(vida);    
    }
    
    /**
     * @return int vida regresa vida del jugador
     */
    public int getVida()
    {
        World mundo = getWorld();
        Juego miMundo =(Juego)mundo;
        return(miMundo.getVida());
    }
    
    /**
     * @param int puntaje  recibe los puntos del jugador
     * aumenta los puntos de mi jugador 
     */
    public void setPuntosPositive(int puntaje)
    {
        World mundo = getWorld();
        Juego miMundo =(Juego)mundo;
        puntaje = miMundo.getPuntos();
        puntaje +=3;
        miMundo.setPuntos(puntaje);
    }
    
    /**
     * @return xPos
     * Retorna la posicion X de la mano derecha de nuestro usuario
     */
    public int getXpos(){
        return ejeX;
    }
    
    /**
     * @return xPos
     * Retorna la posicion Y de la mano derecha de nuestro usuario
     */
    public int getYpos(){
        return ejeY;
    }
    
    /**
     * agrega mi imagen
     */
     public void agregaImg()
     {
        setImage(img);
    }
    /**
     * Escala la imagen
     */
     public void escalar(int Width , int Height){
         img.scale(Width,Height);
        }
}
