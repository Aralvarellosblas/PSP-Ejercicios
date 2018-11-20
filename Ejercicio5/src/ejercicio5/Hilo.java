package ejercicio5;

import static ejercicio5.Ejercicio5.count;
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
        try{

            while(count<=2){
                count++;
                Hilo Hilo=new Hilo("Hilo "+count);
                Hilo.start();
                Hilo.join();

                System.out.println("Soy el thread "+getName());
            }
        }catch(InterruptedException ex){
            Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
