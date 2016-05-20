import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Arboles here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Plantas extends Puntos
{
    private GreenfootImage [] arbol ;
    private int currentMillis,currentMillis2,currentMillis3,currentMillis4,currentMillis5;
    private SimpleTimer timer,timer1;
    private boolean  banderaPuntos;
    private int contador;
    
    /**
     * Constructor
     */
    public Plantas( )
    {    
        arbol = new GreenfootImage [5];
        String nombres[] = {"arbol1.png","arbol1.1.png","arbol1.2.png","arbol1.3.png","arbol1.4.png"};
        for(int i = 0 ; i < 5 ; i++) {
           arbol[i] = new GreenfootImage(nombres[i]);
        }
        contador = 0;
        currentMillis = 0;
        timer = new SimpleTimer();
        timer1 = new SimpleTimer();
        setImage(arbol[4]);
        banderaPuntos = false;
    }
    
    /**
     * metodo act verifica si estamos tocando a nuestro objeto regar 
     * para cambiar de imagen cada determinado tiempo
     */
    public void act() 
    {
        if(isTouching(Regar.class)) {
            if(timer.millisElapsed() > 1000) {
                timer.mark();
                if(currentMillis == 1) {
                    if(getImage() == arbol[4]) {
                         setImage(arbol[3]);
                    }
                    currentMillis= 0;
                }
                else {
                    currentMillis++;
                }
                   
                if(currentMillis2 == 2) {
                    if(getImage() == arbol[3]) {
                         setImage(arbol[2]);
                    }
                    currentMillis2= 0;
                }
                else {
                    currentMillis2++;
                }

                if(currentMillis3 == 3) {
                    if(getImage() == arbol[2]) {
                        setImage(arbol[1]);
                    }
                    currentMillis3= 0;
                }
                else {
                    currentMillis3++;
                }
                
                if(currentMillis4 == 4) {
                    if(getImage() == arbol[1]) {
                        setImage(arbol[0]);
                        banderaPuntos = true;
                        contador++;
                    }
            
                    if(banderaPuntos) {
                        setPuntosPositive(getPuntos());
                        banderaPuntos = false;
                    }
                }
                else {
                    currentMillis4++;
                }
            }
        }
        
        if(timer1.millisElapsed() > 1000) {
            timer1.mark();
            if(currentMillis5 == 8 ){
                if(getImage() != arbol[0] && isTouching(Regar.class) != true && getImage() != arbol[4]) {
                    setImage(arbol[4]);
                    setPuntos( getPuntos());
                }
                currentMillis5 = 0;
            }
            else {
                currentMillis5++;
            }
        } 
    }
    
    /**
     * @return int
     * obtiene el contador de plantas que han adquirido el tamaño ideal
     */
    public int getContador()
    {
        return contador;
    }
}
    
   
    

