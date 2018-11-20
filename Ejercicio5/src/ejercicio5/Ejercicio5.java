package ejercicio5;

/**
 *
 * @author Arturo
 */
public class Ejercicio5 {
    static int count=1;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        new Hilo("Hilo " + count).start();
        
        
    }

}
