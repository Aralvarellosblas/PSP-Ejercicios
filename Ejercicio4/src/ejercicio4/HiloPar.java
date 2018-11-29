package ejercicio4;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Este hilo se encarga de sumar todos los numeros pares entre el 0 y el 1000
 *
 * @author Arturo
 */
public class HiloPar extends Thread implements Runnable{

    private int cuenta=0;//Variable que nos premite almacenar la cuenta de la suma total

    /**
     * Constructor de la clase HiloPar
     *
     * @param st nombre del hilo
     */
    public HiloPar(String st){
        super(st);
    }

    /**
     * Metodo run de este hilo. Identifica los numeros pares y los suma para
     * calcular el total. Mensaje de despedida al finalizal la suma de los mil
     * numeros
     */
    @Override
    public void run(){
        for(int i=0; i<=1000; i++){
            //Los numeros pares son aquellos en los cuales el modulo de la division entre 2 es 0
            if(i%2==0){
                try{
                    cuenta=cuenta+i;
                    System.out.println("p-"+cuenta);
                    HiloPar.sleep(10);//para el hilo durante 10 milisegundos
                }catch(InterruptedException ex){
                    Logger.getLogger(HiloPar.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        System.out.println("Termina el hilo "+getName());
    }
}
