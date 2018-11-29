package ejercicio6;

import java.util.logging.Level;
import java.util.logging.Logger;
import static ejercicio6.Cuenta.ValorTotal;

/**
 * Esta clase es un hilo que realiza 5 extracciones de dinero aleatorio de la
 * cuenta
 *
 * @author Arturo
 */
public class HiloExtrac extends Thread{

    /**
     * Construntor del hilo
     *
     * @param string nombre del hilo
     */
    public HiloExtrac(String string){
        super(string);
    }

    /**
     * Durante la ejecucuón se realizan 5 extracciones de una cifra aleatoria
     * del total de dinero de la cuenta. En caso de no ser posible la
     * extracción, al no haber sufciente dinero, se muestra un mensaje de error.
     * Si la extracción es posible se muestra la cantidad retirada y el nuevo
     * total
     */
    @Override
    public void run(){

        for(int i=0; i<5; i++){

            int extraccion=(int) Math.floor(Math.random()*(1-1000+1)+1000);
            synchronized(Ejercicio6.cuen){
                if(ValorTotal>extraccion){
                    try{
                        ValorTotal=ValorTotal-extraccion;
                        System.out.println(getName()+"   Extraccion "+i+" de : "+extraccion+" ----> Saldo total : "+ValorTotal+"€");
                        HiloExtrac.sleep(100);//detiene el hilo durante 100 milisegundos
                    }catch(InterruptedException ex){
                        Logger.getLogger(HiloExtrac.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }else{
                    System.out.println("Tu saldo es de :"+ValorTotal+"€"+" y quieres quitar "+extraccion+"€"+" NO PUEDES");
                }
            }
        }
    }
}
