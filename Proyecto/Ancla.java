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
    
    
    private boolean flagPez;
    private int Vida;
    private boolean flagBasura, flagContenedor;
    
    /**
     * constructor
     */
    public Ancla ()
    {
        super("ancla.png");
        flagBasura = flagPez = false;
        Vida = 10;
    }
    
    /**
     * obtiene la posicion de mi usuario y  esta checando si toca a un pez
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
    public void posicionar()
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
            setVida(Vida-=1);
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
    
    public boolean isTouchingContenedor()
    {
        if(isTouching(Contenedor.class)) {
            flagContenedor = true;
        }
        return flagContenedor;        
    }
}
