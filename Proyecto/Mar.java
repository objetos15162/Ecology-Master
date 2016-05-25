import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Primer nivel del juego.
 * En este nivel, se tiene que recoger la basura y llevarse a un contenedor.
 * Si tocas a un pez, te quita una vida.
 * 
 * @author (Alejo Hilario Angel Omar,    Miranda Victorino Aaron) 
 * @version (24-Mayo-2016)
 */
public class Mar extends Juego
{
    private Ancla Ancla ; // objeto ancla
    private Barco Barco ;// objeto barco
    private int puntosPersonaje; // variables para modificar movimiento de misobjetos
    private Contenedor Contenedor; // variable contenedor
    
    /**
     * Constructor for objects of class selva.
     * 
     */
    public Mar()
    { 
         super(true);        
         setVida(10);
         puntosPersonaje=0;
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
        if(getPuntos() >= 25 ) {
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
        return Ancla.getX();
    }
    
    /**
    * @return int positionY
    * Utilizada para mandarle las coordenadas a nuestra basura
    * y se mueva en la misma direccion que nuestra ancla
    */ 
    public int getAnclaLocationY()
    {
        return Ancla.getY();
    }  
    
   
    
    /**
    * @param int number
    * @return int
    * 
    * Utilizada para la generacion de numeros aleatorios
    */
    public int generarAleatorio(int number)
    {
        return Greenfoot.getRandomNumber(number)+1;
    }
    
    
    
    /**
     * Metodo que agrega a todos los objetos en mi mundo
     */
     public void prepare()
     {
        String nombres[] = {"Pez.png","pez2.png","pez6.png","pez3.png","pez4.png","tiburon.png",
                    "pezz5.png","lata1.png","petroleo.png"};
        Barco = new Barco();
        Ancla = new Ancla();
        Contenedor = new Contenedor();
        posicionarObj(new Fondo("olas.png"),0,120);
        posicionarObj(new FondoOceano(),100,320);
        posicionarObj(Barco,getWidth()/2,100);
        for(int i = 0 ; i < 3 ;i++) {
            posicionarObj(new Pez(generarAleatorio(400),200,nombres[i],generarAleatorio(3),true),
            generarAleatorio(400),400);
        }
        
        for(int i = 3 ; i < 7 ;i ++) {
            posicionarObj(new Pez(generarAleatorio(400),300,nombres[i],generarAleatorio(3),false),
            generarAleatorio(400),400);
        }
        
        for(int i = 0 ; i < 10; i++) {
            if(i < 5) {
                posicionarObj(new Basura(nombres[7],(int)(Math.random()*500+100),
                (int)(Math.random()*250+200)),(int)(Math.random()*500+100),(int)(Math.random()*250+200));
            }
            else {
                posicionarObj(new Basura(nombres[8],(int)(Math.random()*500+100),
                (int)(Math.random()*250+200)),(int)(Math.random()*500+100),(int)(Math.random()*250+200)); 
            }
        }
        posicionarObj(Ancla,getWidth()/2,300);
        posicionarObj(new Gif("tesoro.gif"),30,390);
        posicionarObj(new Gif("tesoro.gif"),200,450);
        posicionarObj(Contenedor,600,100);
    }
    
     /**
    * @param Actor name
    * @param int xPosition
    * @param int yPosition
    * metodo utilizazdo para posicionar mas rapido a mis objeto
    */ 
    private void posicionarObj(Actor name,int x , int y )
    {
        addObject(name,x,y);
    }
}
