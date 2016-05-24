import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Esta clase solo nos muestra el menu.
 * 
 * @author (Alejo Hilario Angel Omar,    Miranda Victorino Aaron) 
 * @version (24-Mayo-2016)
 */
public class Menu extends KinectWorld
{

    /**
     * Cara los botones para la interfaz de ayuda.
     * 
     */
    public Menu()
    {
        prepare();
    }
    
    /**
     * Contiene los metodos de agregar objeto y los nombres de los objetos
     * para cargar en el menu de inicio
     */
    private void prepare()
    {
        ButtonPlay play = new ButtonPlay();
        addObject(play,320,400);
        ButtonHelp help = new ButtonHelp();
        addObject(help,120,400);
        ButtonRecord record = new ButtonRecord();
        addObject(record,520,400);
        Ecology ecologia = new Ecology();
        addObject(ecologia,320,170);
    }
}