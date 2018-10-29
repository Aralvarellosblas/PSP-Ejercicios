package ejercicio2;

/**
 *
 * @author Arturo
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Hilo("a").start();
        new Hilo("b").start();
        new Hilo("c").start();
        new Hilo("d").start();
        System.out.println("Termina clase main");
    }

}
