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
    // objetos a regar
    private Planta Planta0;
    private Planta Planta1;
    private Planta Planta2;
    private Planta Planta3;
    private Planta Planta4; 
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
        Planta0 = new Planta();
        Planta1 = new Planta();
        Planta2 = new Planta ();
        Planta3 = new Planta();
        Planta4 = new Planta();
        
        addObject(new Regar(),250,358);
        addObject(Planta0,200,400);
        addObject(Planta1,50,400);
        addObject(Planta2,300,400);
        addObject(Planta3,400,400);
        addObject(Planta4,550,400);
    }
    
    /**
     * suma la puntuacion  de cada planta para regresar al menu inicial
     */
    public void act(){
        super.act();
        int sumaContador = Planta0.getContador() + Planta1.getContador() + Planta2.getContador() 
        + Planta3.getContador() + Planta4.getContador();
        if(sumaContador >= 5) {
            setLvl(4);
        }
    }
}
