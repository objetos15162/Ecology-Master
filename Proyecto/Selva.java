import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class selva here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Selva extends Juego
{
    private int vida; // variable para nuestro constructor
    private Plantas p0,p1,p2,p3,p4; // objetos a regar
    /**
     * Constructor for objects of class selva.
     * 
     */
    /**
     * @param int vida , recibe la vida del jugador del nivel anterior
     * @param int puntos , recibe los puntos del jugador del nivel anterior
     */
    public Selva(int vida , int puntos)
    {
        super(true);//corregir no lleva lvl
        super.setVida(vida);
        super.setPuntos(puntos);
        this.vida = vida;
        p0 = new Plantas();
        p1 = new Plantas();
        p2 = new Plantas ();
        p3 = new Plantas();
        p4 = new Plantas();
        
        addObject(new Regar(),250,358);
        addObject(p0,200,400);
        addObject(p1,50,400);
        addObject(p2,300,400);
        addObject(p3,400,400);
        addObject(p4,550,400);
    }
    
    /**
     * suma la puntuacion  de cada planta para regresar al menu inicial
     */
    public void act(){
        super.act();
        int suma = p0.getContador() + p1.getContador() + p2.getContador() + p3.getContador() + p4.getContador();
        if(suma >= 5) {
            setLvl(4);
        }
    }
}
