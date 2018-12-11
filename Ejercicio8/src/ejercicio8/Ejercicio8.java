package ejercicio8;

/**
 * Este programa simula una carrera entre una tortuga y una liebre en un
 * tablero de 70 casillas. Ambas tienen distintos movimientos ejecutados de forma
 * aleatoria en función de probabilidades
 *
 * @author Arturo
 */
public class Ejercicio8{

    static Tablero tabl=new Tablero();

    /**
     * La clase main muestra el mensaje de inicio de carrera pone a los
     * participantes en posiscion inicial y comienza los hilos de la liebre y la
     * tortuga. Tambien se encarga de mostrar el mensaje de finalización cuando
     * uno de los participantes llega a la casilla 70
     *
     * @param args the command line arguments
     */
    public static void main(String[] args){
        System.out.println("Empeza a carreira");
        tabl.setLebre(1);
        tabl.setTartaruga(1);
        new HiloTartaruga("Tartaruga").start();
        new HiloLebre("Lebre").start();
        if(tabl.getLebre()>=70){
            System.out.println("Ganador Lebre");
        }else if(tabl.getTartaruga()>=70){
            System.out.println("Ganador Tartaruga");
        }
    }
}
