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
    
    GifImage regarGif ;
    /**
     * constructor
     */
    public Regar()
    {
        super();
        regarGif = new GifImage("regar.gif");
       
    }
    
    /**
     * Checa posicion de nuestra regadora y pone la imagen
     */
    public void act() 
    {  
        super.act();
        setImage(regarGif.getCurrentImage());
        checking();
           
    }
    /**
     * Checaa si nuestra regadora de plantas no excede la posicion
     */
    private void checking(){
        if( getYpos() <= 357) {
               setLocation(getXpos(),getYpos());
            }
    }
}
