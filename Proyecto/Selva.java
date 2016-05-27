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
    private int vida; // variabp para nuestro constructor
    // objetos a regar
    private Planta planta0;
    private Planta planta1;
    private Planta planta2;
    private Planta planta3;
    private Planta planta4; 
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
        planta0 = new Planta();
        planta1 = new Planta();
        planta2 = new Planta ();
        planta3 = new Planta();
        planta4 = new Planta();
        
        addObject(new Regar(),250,358);
        addObject(planta0,200,400);
        addObject(planta1,50,400);
        addObject(planta2,300,400);
        addObject(planta3,400,400);
        addObject(planta4,550,400);
    }
    
    /**
     * suma la puntuacion  de cada planta para regresar al menu inicial
     */
    public void act(){
        super.act();
        int sumaContador = planta0.getContador() + planta1.getContador() + planta2.getContador() 
        + planta3.getContador() + planta4.getContador();
        if(sumaContador >= 5) {
            setLvl(4);
        }
    }
}
