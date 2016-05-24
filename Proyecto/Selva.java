import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * El segundo nivel del juego, donde se tienen que llevar a los animales a la puerta para salvarlos.
 * Habra cazadores, se tienen que evitar.
 * 
 * @author (Alejo Hilario Angel Omar,    Miranda Victorino Aaron) 
 * @version (24-Mayo-2016)
 */
public class Selva extends Juego
{
    private int vida; // variable para nuestro constructor
    private Planta p0,p1,p2,p3,p4; // objetos a regar
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
        p0 = new Planta();
        p1 = new Planta();
        p2 = new Planta ();
        p3 = new Planta();
        p4 = new Planta();
        
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
