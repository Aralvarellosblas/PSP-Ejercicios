package ejercicio3;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Arturo
 */
public class Hilo extends Thread implements Runnable{
    Hilo h;
    public Hilo(int contador){
        contador=contador+1;
        System.out.println(getName()+" empezó");
        if(contador<5){
           h=new Hilo(contador);
           h.start();
        }
    }

    @Override
    public void run(){

        for(int i=0; i<10; i++){
            System.out.println(getName()+" "+i);
            try{
                Thread.sleep((long) (Math.random()*600)+1);
            }catch(InterruptedException ex){
                Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(!getName().equals("Thread-4")){
            try{
                h.join();
            }catch(InterruptedException ex){
                Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println(getName()+" terminó");
    }
}
