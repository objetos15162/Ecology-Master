import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends KinectWorld
{

    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
    {
        prepare();
    }
    
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
