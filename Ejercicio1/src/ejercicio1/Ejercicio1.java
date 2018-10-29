package ejercicio1;

/**
 *
 * @author Arturo
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new NuevoHilo("a").start();
        new NuevoHilo("b").start();
        System.out.println("Termina clase main");
    }

}
