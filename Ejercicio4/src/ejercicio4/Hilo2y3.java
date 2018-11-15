package ejercicio4;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Arturo
 */
public class Hilo2y3 extends Thread implements Runnable{

    private int cuenta=0;

    public Hilo2y3(String st){
        super(st);
    }

    @Override
    public void run(){
        for(int i=0; i<=1000; i++){
            if(i%10==2||i%10==3){
                try{
                    cuenta=cuenta+i;
                    System.out.println("h23-"+cuenta);
                    Hilo2y3.sleep(10);
                }catch(InterruptedException ex){
                    Logger.getLogger(Hilo2y3.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        System.out.println("Termina el hilo "+getName());
    }
}
