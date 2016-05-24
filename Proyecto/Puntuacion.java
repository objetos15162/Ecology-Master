import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Nos actualiza los records del juego.
 * 
 * @author (Alejo Hilario Angel Omar,    Miranda Victorino Aaron) 
 * @version (24-Mayo-2016)
 */
public class Puntuacion extends Juego
{
    private Record record;// objeto del tipo record
    private TablaRecord tabla; // objeto del tipo tabla
    private ButtonExit exit; // boton para regresar a menu inicial
    
    /**
     * MUESTRA LAS PUNTUACIONES QUE SE HAN REALIZADO
     * 
     */
    public Puntuacion()
    {
        super(false);
        exit = new ButtonExit();
        addObject(exit,570,400);
        record = new Record(); 
    }
    
    /**
     * solo añade el objeto de tabla para  visualizar los recors
     */
    public void act()
    {
        tabla = new TablaRecord(record.creaTablaRecords());
        addObject(tabla,0,0);
    }
}
