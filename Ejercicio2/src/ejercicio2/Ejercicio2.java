package ejercicio2;

/**
 * Esta clase principal contiene las llamadas a los metodos para que funcione el
 * programa
 *
 * @author Arturo
 */
public class Ejercicio2{

    /**
     * El metodo main inicia 4 hilos diferentes y muestra su mensaje de
     * finalización
     *
     * @param args the command line arguments
     */
    public static void main(String[] args){
        new Hilo("a").start();
        new Hilo("b").start();
        new Hilo("c").start();
        new Hilo("d").start();
        System.out.println("Termina clase main");
    }

}
