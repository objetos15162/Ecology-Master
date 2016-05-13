import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mar extends KinectWorld 
{   
    private static final int THUMBNAIL_WIDTH = 80;
    private static final int THUMBNAIL_HEIGHT = 60;
    private long leftHandUp;
    private Label leftHandWarning;
    private Ancla a ;
    private Barco b ;
    private int x,y,puntos;
    private ArrayList <Basura> bas ;
    public Counter puntuacion;
    public Counter vida;
    private Puntos p;
    
    public Mar()
    {    
        
     //      super(KinectClient.DEFAULT_IMAGE_WIDTH, KinectClient.DEFAULT_IMAGE_HEIGHT, 2, false);
         super(THUMBNAIL_WIDTH, THUMBNAIL_HEIGHT, 1.0, false);   
         
         final int width = getWidth();
         final int height = getHeight();
         x=y=puntos=0;
         bas = new ArrayList<Basura>();
         prepare();
         addObject(new Instructions(), width/2, height/2);
         addObject(new Thumbnail(), 600, 450);
    }
   
    public void act()
    {
        super.act();
         /*if (!isConnected())
            return;*/
        if(a.touchingBasura())
            whoistouchingme();
          
        vida.setValue(a.getVida());
         
        for(Basura b:bas) {
             // modificar puntos y agregar documentacion
             if(b.transparencia() == true  && b.getFlagPuntos() == true  ) {
                 p.setBandera(true);
             }     
        }
            
        puntuacion.setValue(p.getPuntos());
        p.setBandera(false);        
    }
        
    private void whoistouchingme()
    {    
      for(Basura b:bas) {
           if(b.touchme() && !b.transparencia())
                b.setLocation(a.getX(),a.getY());       
      } 
    }
    
    private void posicionar(Actor name,int x , int y ) 
    {
        addObject(name,x,y);
    }
        
    public int generar(int number)
    {
        return Greenfoot.getRandomNumber(number)+1;    
    }
    
    private void generar()
    {
        x = (int)(Math.random()*500+100);
        y = (int)(Math.random()*250+200);
    }
    
    private void prepare()
    {
       String nombres[] = {"Pez.png","pez2.png","pez6.png","pez3.png","pez4.png","tiburon.png",
                    "pezz5.png","lata1.png","petroleo.png"};
        b = new Barco();
        a = new Ancla();
        posicionar(new Fondo(),0,120);
        posicionar(new FondoOceano(),100,320);
        posicionar(b,getWidth()/2,100);
        
        for(int i = 0 ; i < 3 ;i++)
            posicionar(new Pez(generar(400),200,nombres[i],generar(3),true),generar(400),400);
            
        for(int i = 3 ; i < 7 ;i ++)
            posicionar(new Pez(generar(400),300,nombres[i],generar(3),false),generar(400),400);
        
        for(int i = 0 ; i < 10; i++){
            generar();
            if(i < 5) {
                bas.add(new Basura(nombres[7],5,x,y)); 
            }
            else {
                bas.add(new Basura(nombres[8],5,x,y)); 
            }
        
            posicionar(bas.get(i),x,y);
        }
       posicionar(a,getWidth()/2,300);
       posicionar(new Tesoro(),30,390);
       posicionar(new Tesoro(),200,450);
       posicionar(new Contenedor(),600,100);
       vida = new Counter("VIDA : ");
       puntuacion = new Counter("Puntos: ");
       addObject(puntuacion,200,25);
       addObject(vida,50,25);
       p = new Puntos();
    }
}
    

