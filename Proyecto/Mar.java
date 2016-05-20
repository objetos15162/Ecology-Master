import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class kinectMundo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mar extends Juego
{
    private Ancla a ; // objeto ancla
    private Barco b ;// objeto barco
    private int x,y,puntos; // variables para modificar movimiento de misobjetos
    private Contenedor con; // variable contenedor
    
    /**
     * Constructor for objects of class selva.
     * 
     */
    public Mar()
    { 
         super(true);        
         setVida(10);
         x=y=puntos=0;
         prepare();
    }
   
    /**
    * modifica la vida y cambia de nivel
    */
    public void act()
    {
        super.act();
        setVida(getVida()); 
        setPuntos(getPuntos());
        if(getPuntos() >= 10 ) {
            setLvl(2);
        }
    }
    
    /**
    * @return int positionX
    * Utilizada para mandarle las coordenadas a nuestra basura
    * y se mueva en la misma direccion que nuestra ancla
    */   
    public int getAnclaLocationX()
    {
        return a.getX();
    }
    
    /**
    * @return int positionY
    * Utilizada para mandarle las coordenadas a nuestra basura
    * y se mueva en la misma direccion que nuestra ancla
    */ 
    public int getAnclaLocationY()
    {
        return a.getY();
    }  
    
    /**
    * @param Actor name
    * @param int xPosition
    * @param int yPosition
    * metodo utilizazdo para posicionar mas rapido a mis objeto
    */ 
    private void posicionar(Actor name,int x , int y )
    {
        addObject(name,x,y);
    }
    
    /**
    * @param int number
    * @return int
    * 
    * Utilizada para la generacion de numeros aleatorios
    */
    public int generar(int number)
    {
        return Greenfoot.getRandomNumber(number)+1;
    }
    
    /**
    * Metodo para generar posiciones aleatorias de posicion x y y de objetos especificos
    */
    private void generar()
    {
        x = (int)(Math.random()*500+100);
        y = (int)(Math.random()*250+200);
    }
    
    /**
     * Metodo que agrega a todos los objetos en mi mundo
     */
     public void prepare()
     {
        String nombres[] = {"Pez.png","pez2.png","pez6.png","pez3.png","pez4.png","tiburon.png",
                    "pezz5.png","lata1.png","petroleo.png"};
        b = new Barco();
        a = new Ancla();
        con = new Contenedor();
        posicionar(new Fondo("olas.png"),0,120);
        posicionar(new FondoOceano(),100,320);
        posicionar(b,getWidth()/2,100);
        for(int i = 0 ; i < 3 ;i++) {
            posicionar(new Pez(generar(400),200,nombres[i],generar(3),true),generar(400),400);
        }
        
        for(int i = 3 ; i < 7 ;i ++) {
            posicionar(new Pez(generar(400),300,nombres[i],generar(3),false),generar(400),400);
        }
        
        for(int i = 0 ; i < 10; i++) {
            generar();
            if(i < 5) {
                posicionar(new Basura(nombres[7],x,y),x,y);
            }
            else {
                posicionar(new Basura(nombres[8],x,y),x,y); 
            }
        }
        posicionar(a,getWidth()/2,300);
        posicionar(new Gif("tesoro.gif"),30,390);
        posicionar(new Gif("tesoro.gif"),200,450);
        posicionar(con,600,100);
    }
}
