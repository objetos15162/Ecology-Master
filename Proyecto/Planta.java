import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Nos da los objetos Planta.
 * Si el objeto esta siendo regado, entonces cambia de planta y nos aumenta el puntaje.
 * Si no se termina de regar, entonces nos quita vida.
 * 
 * @author (Alejo Hilario Angel Omar,    Miranda Victorino Aaron) 
 * @version (24-Mayo-2016)
 */
public class Planta extends Player
{
    private GreenfootImage [] arbolSprite ;
    private int timeSprite,timeSprite2,timeSprite3,timeSprite4,timeSprite5;
    private SimpleTimer timerPlant,timerKill;
    private boolean  banderaPuntos;
    private int Contador;
    
    /**
     * Constructor
     */
    public Planta( )
    {    
        super();
        arbolSprite = new GreenfootImage [5];
        String nombres[] = {"arbol1.png","arbol1.1.png","arbol1.2.png","arbol1.3.png","arbol1.4.png"};
        
        for(int i = 0 ; i < 5 ; i++) {
           arbolSprite[i] = new GreenfootImage(nombres[i]);
        }
        
        Contador = 0;
        timeSprite = timeSprite2 = timeSprite3 = 
        timeSprite4 = timeSprite5 = 0;
        timerPlant = timerKill = new SimpleTimer();
        setImage(arbolSprite[4]);
        banderaPuntos = false;
    }
    
    /**
     * metodo act verifica si estamos tocando a nuestro objeto regar 
     * para cambiar de imagen cada determinado tiempo
     */
    public void act() 
    {
        
        if(isTouching(Regar.class)) {
            if(timerPlant.millisElapsed() > 1000) {
                timerPlant.mark();
                  if(timeSprite == 1) {
                    check(1);
                    recet('1');
                    
                }
                else {
                    incrementa('1');
                }
                   
                if(timeSprite2 == 2) {
                    check(2);
                    recet('2');
                }
                else {
                   incrementa('2');
                }

                if(timeSprite3 == 3) {
                    check(3);
                    recet('3');}
                else {
                   incrementa('3');
                }
                
                if(timeSprite4 == 4) {
                   check(4);
                   recet('4');
                }
                else {
                  incrementa('4');
                }
            }
        }
        
        if(timerKill.millisElapsed() > 1000) {
            timerKill.mark();
            if(timeSprite5 == 8 ){
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
     * obtiene el Contador de plantas que han adquirido el tamaño ideal
     */
    public int getContador()
    {
        return Contador;
    }
    
    public void check(int time){
        switch(time){
            case 1:
                if(getImage() == arbolSprite[4]) 
                    setImage(arbolSprite[3]);
                    
                    break;
            case 2:
                if(getImage() == arbolSprite[3]) 
                     setImage(arbolSprite[2]);
                     break;
            case 3:
                if(getImage() == arbolSprite[2]) 
                        setImage(arbolSprite[1]);
                    
                        break;
            case 4:
                if(getImage() == arbolSprite[1]) {
                        setImage(arbolSprite[0]);
                        banderaPuntos = true;
                        Contador++;
                    }
            
                if(banderaPuntos) {
                        setPuntosPositive(getPuntos());
                        banderaPuntos = false;
                    }
            
                    break;
            case 5:
                    if(getImage() != arbolSprite[0] && !isTouching(Regar.class)  
                      && getImage() != arbolSprite[4]) {
                    setImage(arbolSprite[4]);
                    setPuntos(getPuntos());
                }
            
                break;
            
            
        }
        
    }
    
    
    public void incrementa(char op){
        
        switch(op){
            case '1':
            timeSprite++;
            break;
            case '2':
            timeSprite2++;
            break;
            case '3':
            timeSprite3++;
            break;
            case '4':
            timeSprite4++;
            break;
            case '5':
            timeSprite5++;
            break;
            
            
        }
        
        
    }
    
    public void recet(char op){
        switch(op){
            case '1':
            timeSprite=0;
            break;
            case '2':
            timeSprite2=0;
            break;
            case '3':
            timeSprite3=0;
            break;
            case '4':
            timeSprite4=0;
            break;
            case '5':
            timeSprite5=0;
            break;
            
            
        }
    }
    
    public boolean check (){
        
       if(timeSprite5 == 8)
       return true;
       else
       return false;
    }
}
    
   
    

