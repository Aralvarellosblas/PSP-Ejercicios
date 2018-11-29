package ejercicio4;

/**
 * Esta clase principal contiene las llamadas a los metodos para que funcione el
 * programa
 *
 * @author Arturo
 */
public class Ejercicio4{

    /**
     * El metodo main crea e inicia los tres tipos de hilos con los que tratamos
     * en este ejercicio
     *
     * @param args the command line arguments
     */
    public static void main(String[] args){
        HiloPar hp=new HiloPar("Pares");
        hp.start();
        HiloImpar hi=new HiloImpar("Impares");
        hi.start();
        Hilo2y3 h23=new Hilo2y3("H2-3");
        h23.start();
    }

}
