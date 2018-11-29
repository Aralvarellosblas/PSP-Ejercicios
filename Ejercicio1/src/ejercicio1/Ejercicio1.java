package ejercicio1;

/**
 * Esta clase principal contiene las llamadas a los metodos para que funcione el
 * programa
 *
 * @author Arturo
 */
public class Ejercicio1{

    /**
     * Desde la clase main se inician los dos hilos y se muestra el mensaje de
     * finalización del main
     *
     * @param args the command line arguments
     */
    public static void main(String[] args){
        new NuevoHilo("a").start();
        new NuevoHilo("b").start();
        System.out.println("Termina clase main");
    }

}
