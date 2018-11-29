package ejercicio5;

import static java.lang.Thread.MAX_PRIORITY;
import static java.lang.Thread.MIN_PRIORITY;

/**
 * Esta clase principal contiene las llamadas a los metodos para que funcione el
 * programa
 *
 * @author Arturo
 */
public class Ejercicio5{

    static int count=1;
    static int count2=1;

    /**
     * El main crea e inicia los hilos necesarios para que el programa funcione
     *
     * @param args the command line arguments
     */
    public static void main(String[] args){
        //iniciamos hilo con join
        new HiloJoin("Hilo "+count).start();
        //iniciamos hilo con prioridades
        HiloPrior hp=new HiloPrior("HiloPrior "+count2);
        HiloPrior hp2=new HiloPrior("HiloPrior "+count2);

        hp.start();
        hp2.start();

    }

}
