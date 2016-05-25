import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Clase Tabla records, se encarga de mostrar en pantalla una tabla con los records ordenados de menor a mayor.
 *
 * @author (Alejo Hilario Angel Omar,    Miranda Victorino Aaron) 
 * @version (24-Mayo-2016)
 */
//usuario Llista de usuarios cada localidad contiene el nombre y los puntos de los diferentes usuarios.
//tabla   Contiene la la imagen de la tabla.
// nombre Etiqueta que muestra el nombre.
// puntos Etiqueta que muestra la puntuacion.
// Ban    Bandera que controla la incersion de los objetos en el mundo.
// c      Variable usada para ordenar las etiquetas en la tabla.
public class TablaRecord extends Actor
{
    private LinkedList<Usuario> usuario;
    private GreenfootImage tabla;
    private Label nombreJugador;
    private Label puntosJugador;
    private boolean Ban;
    private int Ordenador;
    
    /**Constructor de la clase aqui se inicializan todas las variables.
    @param us Lista de todos los usuarios.
    */
    public TablaRecord(LinkedList<Usuario> us)
    {
        usuario=new LinkedList<Usuario>();
        usuario=us;
        Ban=false;
        Ordenador=0;
        tabla=new GreenfootImage("TablaRecords.png");
    }

    /**Metodo act de la clase aqui se inserta la tabla y las etiquetas en orden.
     */
    public void act() 
    {
        if(Ban==false) {
            setLocation(getWorld().getWidth()/2,getWorld().getHeight()/2);
            tabla.scale(350,300);
            setImage(tabla);
            for(Usuario i : usuario) {
                nombreJugador=new Label(i.getnombreJugador()+".",30);
                puntosJugador=new Label(i.getPuntuacionJugador()+".",30);
                getWorld().addObject(nombreJugador, 231,176+40*Ordenador);
                getWorld().addObject(puntosJugador, 432,176+40*Ordenador);
                Ordenador++;
            }
            Ban=true;                
        }
    }    
}
