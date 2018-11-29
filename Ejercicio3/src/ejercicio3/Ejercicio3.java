package ejercicio3;

/**
 * Esta clase principal contiene las llamadas a los metodos para que funcione el
 * programa
 *
 * @author Arturo
 */
public class Ejercicio3{

    /**
     * En este main tenemos una variable de tipo int denominada contador que nos
     * permite llevar la cuenta de cuantos hilos se han creado. Iniciamos el
     * hilo, pasandole el parametro del contador para que pueda saber que hilo
     * es el que crea
     *
     * @param args the command line arguments
     */
    public static void main(String[] args){
        int contador=0;
        new Hilo(contador).start();
    }

}
