import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class puntos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Puntos extends Actor
{
    /**
     * Act - do whatever the puntos wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private boolean bandera ;
    private int puntos;
    
    public Puntos()
    {
        bandera = false;
        puntos = 0;
    }
    
    public void act() 
    {
        if(getBandera()) {
            setPuntos();
        }
    }    
    
    public void setBandera(boolean bandera)
    {
        this.bandera = bandera;
    }
    
    public int getPuntos()
    {
        return puntos;
    }
    
    private void setPuntos()
    {
        puntos++;
    }
    
    public boolean getBandera()
    {
        return bandera;
    }
    
    
}
