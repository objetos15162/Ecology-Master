import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ancla here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ancla extends Actor{
    /**
     * Act - do whatever the ancla wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int x , y;
    GreenfootImage img; 
    private boolean flagPez;
    private int puntos , vida;
    private boolean flagBasura,flagContenedor;
    
    public Ancla ()
    {    
        img =  new GreenfootImage("ancla.png");
        x = 250;
        y = 50;
        agregar();
        flagBasura = flagPez = false;
        puntos = 0;
        vida = 7;
    }
    
    public void act() 
    {
      posicionar();
      Mar world = (Mar)getWorld();
      UserData[] us = world.getTrackedUsers();
      if(Greenfoot.isKeyDown("down")) {
          y+=2;   
      }
        
      if(Greenfoot.isKeyDown("up")) {
          y-=2;
      }
      
      if(Greenfoot.isKeyDown("left")) {
          x-=2;
      }
      
      if(Greenfoot.isKeyDown("right")) {
          x+=2;
      }
        
      setLocation(x,y);
       /*for (UserData u : us){
           Joint derecha = u.getJoint(Joint.RIGHT_HAND);
           setLocation(derecha.getX(),derecha.getY());
        
        x= derecha.getX();
        y= derecha.getY();
       }*/
     
      if(tocandoPez())
          eliminaPez();
          
      isTouchingcontenedor();
    }
        
    public boolean touchingBasura()
    {            
        if(isTouching(Basura.class))
                flagBasura = true;
         else
            flagBasura = false;
            
        return flagBasura;
    }
     
    public boolean getFlag()
    {
        return flagPez;
    }
    
    public void posicionar( )
    {
        setLocation(x,y);
    }
    
    public void getValores(int x , int y )
    {
        this.x = x;
        this.y = y;
    }
    
    public void agregar()
    {
        setImage(img);
    }
  
    public int getX()
    {
        return x;
    }
    
    public int getY()
    {
        return y;
    }
    
    public boolean getFlagBasura()
    {
        return flagBasura;
    }
    
    private void eliminaPez()
    {
        removeTouching(Pez.class);
    }
    
    private boolean tocandoPez()
    {
        if(isTouching(Pez.class)) {
            vida--;
            return true;
        }
        else
            return false;
    }
    
    public int getVida()
    {
        return vida;
    }
    
    private void isTouchingcontenedor(){
        if(isTouching(Contenedor.class)&& !flagContenedor )
           puntos++;
        
    }
    
    public void setValueContenedor(boolean transparencia)
    {    
        flagContenedor = transparencia;
    }
}
