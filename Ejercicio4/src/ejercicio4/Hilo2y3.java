package ejercicio4;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Este hilo se encarga de sumar todos los numeros que teminan en 2 y en 3 entre
 * el 0 y el 1000
 *
 * @author Arturo
 */
public class Hilo2y3 extends Thread implements Runnable{

    private int cuenta=0;//Variable que nos premite almacenar la cuenta de la suma total

    /**
     * onstructor de la clase HiloPar
     *
     * @param st nombre del hilo
     */
    public Hilo2y3(String st){
        super(st);
    }

    /**
     * Metodo run de este hilo. Identifica los numeros terminados en dos y tres
     * y los suma para calcular el total. Mensaje de despedida al finalizal la
     * suma de los mil numeros
     */
    @Override
    public void run(){
        for(int i=0; i<=1000; i++){
            //condicion con OR para que se sumen los que terminan en 2 o los que terminan en 3
            if(i%10==2||i%10==3){
                try{
                    cuenta=cuenta+i;
                    System.out.println("h23-"+cuenta);
                    Hilo2y3.sleep(10);//espera 10 milisegundos
                }catch(InterruptedException ex){
                    Logger.getLogger(Hilo2y3.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        System.out.println("Termina el hilo "+getName());
    }
}
