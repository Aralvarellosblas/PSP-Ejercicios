package ejercicio5;

import static ejercicio5.Ejercicio5.count2;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Este hilo pone a prueba las prioridades para ejecutar el hilo 2 antes que el
 * hilo 1
 *
 * @author Arturo
 */
public class HiloPrior extends Thread{

    /**
     * Constructor del hilo de prioridades
     *
     * @param st
     */
    public HiloPrior(String st){
        super(st);
        count2++;//aunemta el contador para el nombre del hilo

    }

    /**
     * El metodo run comprueba el nombre del hilo para aplicar la prioridad
     * mimina al hilo numero 1 y la maxima al hilo numero 2. Hace que los hilos
     * muestren un mensaje y que muestren su prioridad para comprobar que esta
     * ha cambiado
     */
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
