import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * El ancla para agarrar la basura o al pez.
 * Sabemos que si agarra al pez nos quita vida.
 * 
 * @author (Alejo Hilario Angel Omar,    Miranda Victorino Aaron) 
 * @version (24-Mayo-2016)
 */
public class Ancla extends Player
{
    
    
    
    private int vida; // Init vida jugador
    private boolean flagBasura, flagContenedor;// Banderas para saber si tocamos basura o contenedor
    
    /**
     * constructor
     */
    public Ancla ()
    {
        super("ancla.png");
        flagBasura =  false;
        vida = 10;
    }
    
    /**
     * verifica si estamos tocando a un pez para eliminarlo o si estamos tocando al contenedor
     */
    public void act() 
    {   
        super.act();
        agregaImg();
        posicionar();  
        if(tocandoPez()) {
             eliminaPez();
        }
        isTouchingContenedor();
    }
    
    /**
         * @return boolean
         * verifica si estamos tocando un objeto del tipo basura
         */
    public boolean touchingBasura()
    {            
        if(isTouching(Basura.class)) {
                flagBasura = true;
            }
         else {
            flagBasura = false;
        }
        return flagBasura;
    }
     
    /**
     * Posiciona objeto
     */
    private void posicionar()
    {
        setLocation(getXpos(),getYpos());
    }
    
    /**
     * Metodo para eliminar a mi clase pez y modifica puntuacion
     */
    private void eliminaPez()
    {
        setPuntos(getPuntos());
        removeTouching(Pez.class);
    }
    
    /**
     * @return boolean
     * retorna bandea si esta tocando algun objeto del tipo pez
     */
    private boolean tocandoPez()
    {
        if(isTouching(Pez.class)) {
            setVida(vida-=1);
            return true;
        }
        else {
            return false;
        }
    }
    
    /**
     * @return boolean
     * retorna si estamos tocando el contenedor
     */
    
    private boolean isTouchingContenedor()
    {
        if(isTouching(Contenedor.class)) {
            flagContenedor = true;
        }
        return flagContenedor;        
    }
}
