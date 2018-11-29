package ejercicio1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * En esta clase Hilo se define un constructor para la clase, y lo que debe
 * hacer dicho hilo cuando se inicia
 *
 * @author Arturo
 */
public class NuevoHilo extends Thread implements Runnable{

    /**
     * Constructor del Hilo
     *
     * @param st Nombre del hilo
     */
    public NuevoHilo(String st){
        super(st);
    }

    /**
     * En el metodo run se define lo que hace el hilo cuando se ejecuta
     *
     * En este caso el hilo muestra sun numero de iteración y su nombre y a
     * continuación espera un tiempo aleatorio antes de mostrar la siguiente
     * iteración. Tambien incluye un mensaje de fin de ejecución
     */
    @Override
    public void run(){
        for(int i=0; i<10; i++){
            try{
                System.out.println(i+" "+getName());
                long s=(long) ((Math.random()*2000)+1);//selecciona aleatoriamente un numero ente 1 y 2000
                NuevoHilo.sleep(s); //para el hilo durante un numero de millisegundos s
            }catch(InterruptedException ex){
                Logger.getLogger(NuevoHilo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("Termina el hilo "+getName());
    }
}
