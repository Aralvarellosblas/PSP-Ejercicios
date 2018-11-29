package ejercicio2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * En esta clase Hilo se define un constructor para la clase, y lo que debe
 * hacer dicho hilo cuando se inicia
 *
 * @author Arturo
 */
public class Hilo extends Thread implements Runnable{

    /**
     * Constructor de la clase hilo
     *
     * @param st nombre del hilo
     */
    public Hilo(String st){
        super(st);
    }

    /**
     * El hilo se ejecuta 5 veces, mostrando en cada una un mensaje con el
     * numero de iteración y su nombre, después espera durante un segundo. Una
     * vez terminadas todas las iteraciones el hilo muestra un mensaje de
     * despedida
     */
    @Override
    public void run(){
        for(int i=0; i<5; i++){
            try{
                System.out.println(i+" "+getName());
                Hilo.sleep(1000);
            }catch(InterruptedException ex){
                Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("Termina el hilo "+getName());
    }
}
