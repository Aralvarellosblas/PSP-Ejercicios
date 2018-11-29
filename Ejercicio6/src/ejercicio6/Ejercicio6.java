package ejercicio6;

/**
 * La clase main contiene la cuenta inicial del programa e inicia los metodos de
 * ingreso y extracción
 *
 * @author Arturo
 */
public class Ejercicio6{

    static Cuenta cuen=new Cuenta();

    /**
     * Inicio de los metodos de ingreso y estracción y balance inicial de la
     * cuenta
     *
     * @param args the command line arguments
     */
    public static void main(String[] args){

        cuen.setValorTotal(0);

        new HiloIngreso("Ingreso").start();
        new HiloExtrac("Extraccion").start();
    }

}
