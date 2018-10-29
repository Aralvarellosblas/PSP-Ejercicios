package ejercicio1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Arturo
 */
public class NuevoHilo extends Thread implements Runnable{

    public NuevoHilo(String st){
        super(st);
    }

    @Override
    public void run(){
        for(int i=0; i<10; i++){
            try{
                System.out.println(i+" "+getName());
                long s=(long) ((Math.random()*2000)+1);
                NuevoHilo.sleep(s);
            }catch(InterruptedException ex){
                Logger.getLogger(NuevoHilo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("Termina el hilo "+getName());
    }
}
