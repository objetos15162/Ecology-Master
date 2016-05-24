import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * El tercer nivel del juego.
 * Se regaran arboles, en cierto tiempo, si no se logra regar uno a tiempo, se te quita una vida.
 * 
 * @author (Alejo Hilario Angel Omar,    Miranda Victorino Aaron) 
 * @version (24-Mayo-2016)
 */
public class Bosque extends Juego
{
    private Cueva c; // objeto cueva
    private int i ; //variable entera
    private String [] animal; // arreglo de animales
    boolean flagAnimalAp,flag2 ;
    private SimpleTimer timer;
    private int currentMillis,x,y;
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
        flagAnimalAp = true;
        flag2 = true;
        timer = new SimpleTimer();
        currentMillis = 0;
        animal = new String [4];
        animal[0] ="chango.gif";
        animal[1] ="tortuga.gif";
        animal[2] ="leon.gif";
        animal[3] ="guajolote.gif";
        c = new Cueva("cueva.gif",getPuntos());
        i = x = y =0;
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
        UserData[] us = getTrackedUsers();
        
        for (UserData u : us) {
            Joint derecha = u.getJoint(Joint.RIGHT_HAND);
            y= derecha.getY();
            x= derecha.getX();
        }
        
            
            if(c.tocando() == false  && flagAnimalAp == true && i!= 0) {
             
            switch(i){
                
                case 1:
                addObject(new Animal(getVida(),getPuntos(),"tortuga.gif"),550,400);
                
                break;
                case 2:
                addObject(new Animal(getVida(),getPuntos(),"leon.gif"),550,400);
                
                break;
                case 3:
                addObject(new Animal(getVida(),getPuntos(),"guajolote.gif"),550,400);
                
                break;
                
            }
            
       
              }
              
              if(c.tocando() == true && i == 0){
                flagAnimalAp = false;
            }
            
            if(c.tocando() == true && i >= 1){
            flagAnimalAp = false;
            
        }
        
        
            if(timer.millisElapsed() > 1000 &&flagAnimalAp == false ) {
                timer.mark();
                if(currentMillis == 5 ){
                    i+=1;
                    flagAnimalAp = true;
                    currentMillis = 0;
                    int puntos = getPuntos();
                    setPuntos(puntos += 1);
                }
                else
                currentMillis++;
            }
            if(i == 3 && c.tocando() )
            i = 4;
            
            if( c.tocando() && i >= 4) {
          setLvl(3);
        }
            
       
           
           /* if( i < 4 && flagAnimalAp == true) {
                 addObject(new Animal(getVida(),getPuntos(),animal[i]),550,400);
                 flagAnimalAp = false;
                 
            }*/
        
        
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
    
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
}
