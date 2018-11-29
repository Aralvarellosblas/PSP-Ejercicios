package ejercicio5;

import static ejercicio5.Ejercicio5.count;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Este hilo pone a prueba los join para ejecutar el hilo 2 antes que el hilo 1
 *
 * @author Arturo
 */
public class HiloJoin extends Thread implements Runnable{

    /**
     * constructor del hilo
     *
     * @param st ombre del hilo
     */
    public HiloJoin(String st){
        super(st);
    }

    /**
     * El metodo run se encarga de crear el segundo hilo e indicar al primero
     * que tiene que esperar a que el segundo termine mediante un join
     */
    @Override
    public void run(){
        try{

            while(count<=2){
                count++;
                HiloJoin h=new HiloJoin("Hilo "+count);
                h.start();
                h.join();

                System.out.println("Soy el thread "+getName());
            }
        }catch(InterruptedException ex){
            Logger.getLogger(HiloJoin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
