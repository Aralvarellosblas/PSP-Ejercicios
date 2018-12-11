package ejercicio8;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Hilo que se encarga de controlar el movimiento de la tortuga por el tablero
 *
 * @author Arturo
 */
public class HiloTartaruga extends Thread{

    private int numero=0;
    private int pos=0;

    public HiloTartaruga(String nombre){
        super(nombre);

    }

    /**
     * Cuando se ejecuta, mientras la liebre o la tortuga no lleguen al final se
     * genera un numero aleatorio entre 1 y 100. En funcion del numero
     * seleccionado se ejecuta un movimiento u otro
     */
    @Override
    public void run(){
        synchronized(Ejercicio8.tabl){
            Ejercicio8.tabl.notify();
            while(Ejercicio8.tabl.getTartaruga()<71&&Ejercicio8.tabl.getLebre()<71){
                //Generacion de numero aleatorio
                numero=(int) (Math.random()*100)+1;
                //Primer mov
                if(numero>=50){
                    try{
                        pos=Ejercicio8.tabl.getTartaruga();
                        Ejercicio8.tabl.wait();
                        Ejercicio8.tabl.setTartaruga(pos+3);

                        HiloTartaruga.sleep(100);
                        Ejercicio8.tabl.notify();
                        System.out.println("T----"+pos);

                    }catch(InterruptedException ex){
                        Logger.getLogger(HiloTartaruga.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    //Segundo mov
                }else if(numero<=20){
                    pos=Ejercicio8.tabl.getTartaruga();
                    try{
                        Ejercicio8.tabl.wait();
                    }catch(InterruptedException ex){
                        Logger.getLogger(HiloTartaruga.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    if(pos<=6){
                        Ejercicio8.tabl.setTartaruga(1);
                        Ejercicio8.tabl.notify();

                        try{
                            HiloTartaruga.sleep(100);
                            System.out.println("T----"+pos);

                        }catch(InterruptedException ex){
                            Logger.getLogger(HiloTartaruga.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }else{
                        Ejercicio8.tabl.setTartaruga(pos-6);
                        Ejercicio8.tabl.notify();
                    }
                    try{
                        HiloTartaruga.sleep(100);
                        System.out.println("T----"+pos);
                    }catch(InterruptedException ex){
                        Logger.getLogger(HiloTartaruga.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    //Tercer mov
                }else{
                    Ejercicio8.tabl.setTartaruga(pos+1);
                    Ejercicio8.tabl.notify();
                }
                try{
                    HiloTartaruga.sleep(100);
                    System.out.println("T----"+pos);
                }catch(InterruptedException ex){
                    Logger.getLogger(HiloTartaruga.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
            //Condicion de victoria
            if(Ejercicio8.tabl.getTartaruga()>69){
                System.out.println("Ganador Tartaruga");
            }else if(Ejercicio8.tabl.getLebre()>69&&Ejercicio8.tabl.getTartaruga()>69){
                System.out.println("Empate");
            }

        }
    }
}
