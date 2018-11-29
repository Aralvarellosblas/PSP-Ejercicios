package ejercicio4;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Este hilo se encarga de sumar todos los numeros impares entre el 0 y el 1000
 *
 * @author Arturo
 */
public class HiloImpar extends Thread implements Runnable{

    private int cuenta=0;//Variable que nos premite almacenar la cuenta de la suma total

    /**
     * Constructor de la clase HiloPar
     *
     * @param st nombre del hilo
     */
    public HiloImpar(String st){
        super(st);
    }
    /**
     * Metodo run de este hilo. Identifica los numeros impares y los suma para
     * calcular el total. Mensaje de despedida al finalizal la suma de los mil
     * numeros
     */
    @Override
    public void run(){
        for(int i=0; i<=1000; i++){
            //El modulo de los numeros impares al dividirlos entre dos da distinto de 0
            if(i%2!=0){
                try{
                    cuenta=cuenta+i;
                    System.out.println("i-"+cuenta);
                    HiloImpar.sleep(10);//espera 10 milisegundos
                }catch(InterruptedException ex){
                    Logger.getLogger(HiloImpar.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        System.out.println("Termina el hilo "+getName());
    }
}
