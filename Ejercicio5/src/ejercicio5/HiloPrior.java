package ejercicio5;

import static ejercicio5.Ejercicio5.count;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Arturo
 */
public class HiloPrior extends Thread{

    public HiloPrior(String st){
        super(st);
        count++;

    }

    @Override
    public void run(){
        if(getName().equals("HiloPrior 1")){
            try{
                sleep(1); // Se pone un pequeño retardo para que de tiempo de aplicar la prioridad al hilo 2
                setPriority(1); //aplicamos prioridad minima al hilo 1
            }catch(InterruptedException ex){
                Logger.getLogger(HiloPrior.class.getName()).log(Level.SEVERE, null, ex);
            }

        }else{
            setPriority(10); //aplicamos la prioridad al hilo 2
        }
        System.out.println("Hola soy el hilo numero "+getName());
        System.out.println(getName()+" Prioridad "+getPriority()); // Mostramos la prioridad
    }
}
