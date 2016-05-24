import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Nos da los objetos Planta.
 * Si el objeto esta siendo regado, entonces cambia de planta y nos aumenta el puntaje.
 * Si no se termina de regar, entonces nos quita vida.
 * 
 * @author (Alejo Hilario Angel Omar,    Miranda Victorino Aaron) 
 * @version (24-Mayo-2016)
 */
public class Planta extends Puntaje
{
    private GreenfootImage [] arbol ;
    private int currentMillis,currentMillis2,currentMillis3,currentMillis4,currentMillis5;
    private SimpleTimer timer,timer1;
    private boolean  banderaPuntos;
    private int contador;
    
    /**
     * Constructor
     */
    public Planta( )
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
                    check(1);
                    recet('1');
                    
                }
                else {
                    incrementa('1');
                }
                   
                if(currentMillis2 == 2) {
                    check(2);
                    recet('2');
                }
                else {
                   incrementa('2');
                }

                if(currentMillis3 == 3) {
                    check(3);
                    recet('3');}
                else {
                   incrementa('3');
                }
                
                if(currentMillis4 == 4) {
                   check(4);
                   recet('4');
                }
                else {
                  incrementa('4');
                }
            }
        }
        
        if(timer1.millisElapsed() > 1000) {
            timer1.mark();
            if(currentMillis5 == 8 ){
                    check(5);
                    recet('5');
            }
            else {
                incrementa('5');
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
    
    public void check(int time){
        switch(time){
            case 1:
                if(getImage() == arbol[4]) 
                    setImage(arbol[3]);
                    
            break;
            case 2:
                if(getImage() == arbol[3]) 
                     setImage(arbol[2]);
            break;
            case 3:
                if(getImage() == arbol[2]) 
                        setImage(arbol[1]);
                    
            break;
            case 4:
                if(getImage() == arbol[1]) {
                        setImage(arbol[0]);
                        banderaPuntos = true;
                        contador++;
                    }
            
                if(banderaPuntos) {
                        setPuntosPositive(getPuntos());
                        banderaPuntos = false;
                    }
            
            break;
            case 5:
                    if(getImage() != arbol[0] && isTouching(Regar.class) != true && getImage() != arbol[4]) {
                    setImage(arbol[4]);
                    setPuntos( getPuntos());
                }
            
            break;
            
            
        }
        
    }
    
    
    public void incrementa(char op){
        
        switch(op){
            case '1':
            currentMillis++;
            break;
            case '2':
            currentMillis2++;
            break;
            case '3':
            currentMillis3++;
            break;
            case '4':
            currentMillis4++;
            break;
            case '5':
            currentMillis5++;
            break;
            
            
        }
        
        
    }
    
    public void recet(char op){
        switch(op){
            case '1':
            currentMillis=0;
            break;
            case '2':
            currentMillis2=0;
            break;
            case '3':
            currentMillis3=0;
            break;
            case '4':
            currentMillis4=0;
            break;
            case '5':
            currentMillis5=0;
            break;
            
            
        }
    }
    
    public boolean check (){
        
       if(currentMillis5 == 8)
       return true;
       else
       return false;
    }
}
    
   
    

