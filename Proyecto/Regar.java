import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Esta clase, es para regar a los arboles.
 * 
 * 
 * @author (Alejo Hilario Angel Omar,    Miranda Victorino Aaron) 
 * @version (24-Mayo-2016)
 */
public class Regar extends Player
{
    
    GifImage RegarGif ;
    /**
     * constructor
     */
    public Regar()
    {
        super();
        RegarGif = new GifImage("regar.gif");
       
    }
    
    /**
     * Detecta los movimientos de mi usuario
     * para cambiar la localizazcion de mi imagen
     */
    public void act() 
    {  
        super.act();
        setImage(RegarGif.getCurrentImage());
        checking();
           
    }
    
    private void checking(){
        if( getYpos() <= 357) {
               setLocation(getXpos(),getYpos());
            }
    }
}
