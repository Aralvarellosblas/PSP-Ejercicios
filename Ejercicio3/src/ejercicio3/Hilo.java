package ejercicio3;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * En esta clase Hilo se define un constructor para la clase, y lo que debe
 * hacer dicho hilo cuando se inicia
 *
 * @author Arturo
 */
public class Hilo extends Thread implements Runnable{

    Hilo h;//Variable de tipo hilo que permite al constructor iniciar a los hilos hijos

    /**
     * El constructor de la clase se encarga de aumentar el contador del hilo,
     * mostrar el mensaje de saludo y controlar que no se creen más hilos de los
     * necesarios
     *
     * @param contador numero de hilos que se han creado
     */
    public Hilo(int contador){
        contador=contador+1; //Se incrementa el contador cada vez  que creamos un nuevo hilo
        System.out.println(getName()+" empezó");
        //El condicional comprueba que no se creen mas de 5 hilos
        if(contador<5){
            h=new Hilo(contador);
            h.start();
        }
    }

    /**
     * El hilo se ejecuta 10 vececs mostrando su nombre y el numero de
     * iteración, a continuación espera un numero aleatorio de milisegundos
     * (entre 1 y 600) Si el nombre del hilo que se ejecuta no es el 4, además
     * el hilo realiza un join, lo que significa que espera a que el siguiente
     * hilo termine antes de mostrar su ultimo mensaje. Tambien muestra un
     * mensaje de finalización
     */
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
        //Evita que el ultimo hilo se quede esperando dejando colgado todo el programa
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
