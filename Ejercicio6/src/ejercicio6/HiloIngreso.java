package ejercicio6;

import java.util.logging.Level;
import java.util.logging.Logger;
import static ejercicio6.Cuenta.ValorTotal;

/**
 * Esta clase es un hilo que realiza 10 ingresos de dinero aleatorio en la
 * cuenta
 *
 * @author Arturo
 */
public class HiloIngreso extends Thread implements Runnable{

    /**
     * Constructor del hilo
     *
     * @param str nombre del hilo
     */
    public HiloIngreso(String str){
        super(str);
    }

    /**
     * Durante la ejecución se ejecuta 10 veces un ingreso de una cantidad
     * aleatoria a la cuenta sincronizada. Se muestra un mensaje con el saldo
     * ingresado y el nuevo total
     */
    @Override
    public void run(){

        for(int i=0; i<10; i++){
            int ingreso=(int) Math.floor(Math.random()*(1-1000+1)+1000);
            synchronized(Ejercicio6.cuen){
                try{
                    ValorTotal=ValorTotal+ingreso;
                    System.out.println(getName()+"   Ingreso "+i+" de : "+ingreso+" ----> Saldo total : "+ValorTotal+"€");
                    HiloIngreso.sleep(100);//detiene el hilo durante 100 milisegundos
                }catch(InterruptedException ex){
                    Logger.getLogger(HiloIngreso.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
