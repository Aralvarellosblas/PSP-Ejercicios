package ejercicio4;

/**
 *
 * @author Arturo
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HiloPar hp=new HiloPar("Pares");
        hp.start();
        HiloImpar hi=new HiloImpar("Impares");
        hi.start();
        Hilo2y3 h23=new Hilo2y3("H2-3");
        h23.start();
    }

}
