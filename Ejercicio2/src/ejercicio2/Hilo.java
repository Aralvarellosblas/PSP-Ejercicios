package ejercicio2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Arturo
 */
public class Hilo extends Thread implements Runnable{

    public Hilo(String st){
        super(st);
    }

    @Override
    public void run(){
        for(int i=0; i<10; i++){
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
