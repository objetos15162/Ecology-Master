import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Nos cambiara de nivel, al que queremos avanzar.
 * Nos gardara los puntuaciontos
 * 
 * @author (Alejo Hilario Angel Omar,    Miranda Victorino Aaron) 
 * @version (24-Mayo-2016)
 */
public class Juego extends KinectWorld
{
    private static final int THUMBNAIL_WIDTH = 80; // ancho
    private static final int THUMBNAIL_HEIGHT = 60; // alto
    private Counter puntuacion; // contador de puntuaciontuacion
    private Counter vida; // contador de vida
    private int puntos, vidaJugador,lvl; // variables privadas  para puntuaciontuacion vida y nivel
    private String nombre; // agrega el nombre del jugador
    private Usuario usuario; // guarda todos los datos del jugador
    private Record record; // objeto para actualizar los records
    private Instruction i; // objeto que nos permite detectar usuario kinect
    
    /**
     * Constructor for objects of class JUEGO.
     * @param int lvl boolean muestraPuntuacion
     * Constructor de juego recibe el nivel y si quiere que aparezca las puntuaciontuaciones y la vida
     */
    public Juego(int lvl , boolean muestraPuntuacion)
    {
        
        super(THUMBNAIL_WIDTH, THUMBNAIL_HEIGHT, 1.0, false); 
        this.lvl = lvl;
        i = new Instruction();
        final int width = getWidth();
        final int height = getHeight();
        addObject(i, width/2, height/2);
        addObject(new Thumbnail(), 600, 50);
        
        puntos = 0;
        vidaJugador= 10;
        if(muestraPuntuacion) {
            vida = new Counter("VIDA : ");
            puntuacion = new Counter("puntuacion: ");
            addObject(puntuacion,200,25);
            addObject(vida,50,25);
        }     
    }
    
    /**
     * Constructor for objects of class JUEGO.
     * @param  boolean muestraPuntuacion
     * Constructor de juego recibe si quiere que aparezca las puntuaciontuaciones y la vida
     */
    public Juego(boolean muestraPuntuacion)
    {    
        super(THUMBNAIL_WIDTH, THUMBNAIL_HEIGHT, 1.0, false); 
        final int width = getWidth();
        final int height = getHeight();
        Instruction i = new Instruction();
        addObject(i, width/2, height/2);
        addObject(new Thumbnail(), 600, 450);
        puntos = 0;
        vidaJugador= 10;
        if(muestraPuntuacion) {
            vida = new Counter("VIDA : ");
            puntuacion = new Counter("puntuacion: ");
            addObject(puntuacion,200,25);
            addObject(vida,50,25);
        }
    }
    
    /**
     * Verifica el nivel en el que estemos y el nivel que queremos cambiar
     * y ademas termina el juego y modifica la puntuaciontuacion
     */
    public void act()
    {
        super.act();
        vida.setValue(getVida());
        puntuacion.setValue(getPuntos());
           
        if(lvl == 1) {
            Greenfoot.setWorld(new Mar());
        }
           
        if( lvl == 2) {
            Bosque bm = new Bosque(getVida(),getPuntos());
            Greenfoot.setWorld(bm);
        }
            
        if(lvl == 3) {             
            Selva s = new Selva(getVida(),getPuntos());
            Greenfoot.setWorld(s);
        }
            
        if(vidaJugador <= 0  || lvl == 4 ) {
            usuario = new Usuario();
            usuario.setnombreJugador(Greenfoot.ask("dame tu nombre"));
            usuario.setpuntuacionJugador(getPuntos());
            record = new Record();
            int pts = usuario.getpuntuacionJugador();
            System.out.println(pts);
            usuario.setpuntuacionJugador(pts);
            record.addUsuario(usuario);
            Greenfoot.setWorld(new Menu());
               
        }
    }
    
    /**
    * @param int v
    * Modifica la vida del jugador
    */
    public void setVida(int vidaJ)
    {   
        vidaJugador = vidaJ;
    }
    
    /**
     * param  int p 
     * Modifica los puntos del jugador
     */
    public void setPuntos(int puntuacion)
    {
        if(puntuacion >= 0) {
            puntos = puntuacion;
        }
    }
    
    /**
     * @return int pun
     * regresa la puntacion del jugador
     */
    public int getPuntos()
    {
        return puntos;
    }
    
    /**
     * @return int vid
     * regresa la vida del jugador
     */
    public int getVida()
    {
        return vidaJugador;
    }
    
    /**
     * @param int lvl
     * modifica el nivel para cambiar de mundo
     */
    public void setLvl ( int lvl)
    {
        this.lvl = lvl;
    }
}
