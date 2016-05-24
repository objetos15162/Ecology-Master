import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Nos cambiara de nivel, al que queremos avanzar.
 * Nos gardara los puntos
 * 
 * @author (Alejo Hilario Angel Omar,    Miranda Victorino Aaron) 
 * @version (24-Mayo-2016)
 */
public class Juego extends KinectWorld
{
    private static final int THUMBNAIL_WIDTH = 80; // ancho
    private static final int THUMBNAIL_HEIGHT = 60; // alto
    private Counter puntuacion; // contador de puntuacion
    private Counter vida; // contador de vida
    private int pun , vid,lvl; // variables privadas  para puntuacion vida y nivel
    private String nombre; // agrega el nombre del jugador
    private Usuario usuario; // guarda todos los datos del jugador
    private Record record; // objeto para actualizar los records
    private Instruction i; // objeto que nos permite detectar usuario kinect
    
    /**
     * Constructor for objects of class JUEGO.
     * @param int lvl boolean flag
     * Constructor de juego recibe el nivel y si quiere que aparezca las puntuaciones y la vida
     */
    public Juego(int lvl , boolean flag)
    {
        
        super(THUMBNAIL_WIDTH, THUMBNAIL_HEIGHT, 1.0, false); 
        this.lvl = lvl;
        i = new Instruction();
        final int width = getWidth();
        final int height = getHeight();
        addObject(i, width/2, height/2);
        addObject(new Thumbnail(), 600, 50);
        
        pun = 0;
        vid= 10;
        if(flag) {
            vida = new Counter("VIDA : ");
            puntuacion = new Counter("Puntos: ");
            addObject(puntuacion,200,25);
            addObject(vida,50,25);
        }     
    }
    
    /**
     * Constructor for objects of class JUEGO.
     * @param  boolean flag
     * Constructor de juego recibe si quiere que aparezca las puntuaciones y la vida
     */
    public Juego(boolean flag)
    {    
        super(THUMBNAIL_WIDTH, THUMBNAIL_HEIGHT, 1.0, false); 
        final int width = getWidth();
        final int height = getHeight();
        Instruction i = new Instruction();
        addObject(i, width/2, height/2);
        addObject(new Thumbnail(), 600, 450);
        pun = 0;
        vid= 10;
        if(flag) {
            vida = new Counter("VIDA : ");
            puntuacion = new Counter("Puntos: ");
            addObject(puntuacion,200,25);
            addObject(vida,50,25);
        }
    }
    
    /**
     * Verifica el nivel en el que estemos y el nivel que queremos cambiar
     * y ademas termina el juego y modifica la puntuacion
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
            
        if(vid <= 0  || lvl == 4 ) {
            usuario = new Usuario();
            usuario.setNombre(Greenfoot.ask("dame tu nombre"));
            usuario.setPuntos(getPuntos());
            record = new Record();
            int p = usuario.getPuntos();
            System.out.println(p);
            usuario.setPuntos(p);
            record.addUsuario(usuario);
            Greenfoot.setWorld(new Menu());
               
        }
    }
    
    /**
    * @param int v
    * Modifica la vida del jugador
    */
    public void setVida(int v)
    {   
        vid = v;
    }
    
    /**
     * param  int p 
     * Modifica los puntos del jugador
     */
    public void setPuntos(int p)
    {
        if(p>=0) {
            pun = p;
        }
    }
    
    /**
     * @return int pun
     * regresa la puntacion del jugador
     */
    public int getPuntos()
    {
        return pun;
    }
    
    /**
     * @return int vid
     * regresa la vida del jugador
     */
    public int getVida()
    {
        return vid;
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
