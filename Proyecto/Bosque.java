import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class bosque here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bosque extends Juego
{
    private Cueva c; // objeto cueva
    private int i ; //variable entera
    private String [] animal; // arreglo de animales
    /**
     * Constructor for objects of class bosque.
     * Constructor
     * @param int vida    recibe la vida del jugador del nivel anterior
     * @param int puntos recibe los puntos del jugador del nivel anterior
     */
    public Bosque(int vida , int puntos)
    {
        super(true);
        super.setVida(vida);
        super.setPuntos(puntos);
        animal = new String [4];
        animal[0] ="chango.gif";
        animal[1] ="tortuga.gif";
        animal[2] ="leon.gif";
        animal[3] ="guajolote.gif";
        c = new Cueva("cueva.gif",getPuntos());
        i = 0;
        addObject(c,25,455);
        addObject(new Animal(getVida(),getPuntos(),animal[i]),600,455);
        prepare();
    }
    
    /**
     * verifica que objeto se toca para cambiar de animal y cambia al nivel 3
     */
    public void act()
    {    
        super.act();
        //setPuntos(c.getPuntos());
        if(c.tocando()) {
            i++;
            if( i < 4) {
                addObject(new Animal(getVida(),getPuntos(),animal[i]),600,455);
            }
        }
        
        if( c.tocando() && i >= 4) {
          setLvl(3);
        }
    }
    
    /**
     * prepara el mundo del nivel
     */
    public void prepare(){
        String enemigo[] = {"cazador1.gif","cazador2.gif","planta1.gif","planta2.gif"};
        addObject(new Gif(enemigo[0]),25,400);
        addObject(new Gif(enemigo[0]),200,280);
        addObject(new Gif(enemigo[0]),200,450);
        addObject(new Gif(enemigo[1]), 200,400);
        addObject(new Gif(enemigo[1]),400,450);
        addObject(new Gif(enemigo[2]),500,350);
        addObject(new Gif(enemigo[2]),600,400);
        addObject(new Gif(enemigo[2]),100,400);
        addObject(new Gif(enemigo[3]),300,350);
        addObject(new Gif(enemigo[3]),360,400);
    }
}
