package ejercicio8;

/**
 * Esta clase contiene las posiciones en el tablero de la liebre y la tortuga
 * para que ambos hilos puedan usarlas
 *
 * @author Arturo
 */
public class Tablero{

    int lebre=1;
    int tartaruga=1;

    public Tablero(){
    }

    public int getLebre(){
        return lebre;
    }

    public void setLebre(int lebre){
        this.lebre=lebre;
    }

    public int getTartaruga(){
        return tartaruga;
    }

    public void setTartaruga(int tartaruga){
        this.tartaruga=tartaruga;
    }
}
