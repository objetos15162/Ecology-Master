import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PUNTUACION here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Puntuacion extends Juego
{
    private Records record;// objeto del tipo record
    private TablaRecords tabla; // objeto del tipo tabla
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
        record = new Records(); 
    }
    
    /**
     * solo añade el objeto de tabla para  visualizar los recors
     */
    public void act()
    {
        tabla = new TablaRecords(record.creaTablaRecords());
        addObject(tabla,0,0);
    }
}
