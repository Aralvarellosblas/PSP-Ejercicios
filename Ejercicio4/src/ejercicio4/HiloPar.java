package ejercicio4;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Arturo
 */
public class HiloPar extends Thread implements Runnable{

    private int cuenta=0;

    public HiloPar(String st){
        super(st);
    }

    @Override
    public void run(){
        for(int i=0; i<=1000; i++){
            if(i%2==0){
                try{
                    cuenta=cuenta+i;
                    System.out.println("p-"+cuenta);
                    HiloPar.sleep(10);
                }catch(InterruptedException ex){
                    Logger.getLogger(HiloPar.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        System.out.println("Termina el hilo "+getName());
    }
}
