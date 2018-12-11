package ejercicio8;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Hilo que se encarga de controlar el movimiento de la liebre por el tablero
 *
 * @author Arturo
 */
public class HiloLebre extends Thread{

    private int numero=0;
    private int pos=0;

    public HiloLebre(String nombre){
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
            while(Ejercicio8.tabl.getLebre()<71&&Ejercicio8.tabl.getTartaruga()<71){
                //generacion de numeros aleatorios
                numero=(int) (Math.random()*100)+1;
                //Primer mov
                if(numero<=20){
                    System.out.println("A lebre esta Dormindo");
                    try{
                        HiloLebre.sleep(100);
                        System.out.println("L----"+pos);
                    }catch(InterruptedException ex){
                        Logger.getLogger(HiloLebre.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    //Segundo mov
                }else if(numero>=20&&numero<=40){

                    pos=Ejercicio8.tabl.getLebre();
                    try{
                        Ejercicio8.tabl.wait();
                    }catch(InterruptedException ex){
                        Logger.getLogger(HiloLebre.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    Ejercicio8.tabl.setLebre(pos+9);
                    Ejercicio8.tabl.notify();
                    try{
                        HiloLebre.sleep(100);
                        System.out.println("L----"+pos);
                    }catch(InterruptedException ex){
                        Logger.getLogger(HiloLebre.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    //Tercer mov
                }else if(numero>40&&numero<50){
                    pos=Ejercicio8.tabl.getLebre();
                    try{
                        Ejercicio8.tabl.wait();
                    }catch(InterruptedException ex){
                        Logger.getLogger(HiloLebre.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    if(pos<=12){
                        Ejercicio8.tabl.setLebre(1);
                        Ejercicio8.tabl.notify();
                        try{
                            HiloLebre.sleep(100);
                            System.out.println("L----"+pos);
                        }catch(InterruptedException ex){
                            Logger.getLogger(HiloLebre.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    Ejercicio8.tabl.setLebre(pos-12);
                    Ejercicio8.tabl.notify();
                    try{
                        HiloLebre.sleep(100);
                        System.out.println("L----"+pos);
                    }catch(InterruptedException ex){
                        Logger.getLogger(HiloLebre.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    //Cuarto mov
                }else if(numero>50&&numero<80){
                    pos=Ejercicio8.tabl.getLebre();
                    try{
                        Ejercicio8.tabl.wait();
                    }catch(InterruptedException ex){
                        Logger.getLogger(HiloLebre.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    Ejercicio8.tabl.setLebre(pos+1);
                    Ejercicio8.tabl.notify();
                    try{
                        HiloLebre.sleep(100);
                        System.out.println("L----"+pos);
                    }catch(InterruptedException ex){
                        Logger.getLogger(HiloLebre.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    //Quinto mov
                }else if(numero>=80){
                    pos=Ejercicio8.tabl.getLebre();
                    try{
                        Ejercicio8.tabl.wait();
                    }catch(InterruptedException ex){
                        Logger.getLogger(HiloLebre.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    if(pos<3){
                        Ejercicio8.tabl.setLebre(1);
                        Ejercicio8.tabl.notify();
                        try{
                            HiloLebre.sleep(100);
                            System.out.println("L----"+pos);
                        }catch(InterruptedException ex){
                            Logger.getLogger(HiloLebre.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }else{
                        Ejercicio8.tabl.setLebre(pos-2);
                        Ejercicio8.tabl.notify();
                    }
                    try{
                        HiloLebre.sleep(100);
                        System.out.println("L----"+pos);
                    }catch(InterruptedException ex){
                        Logger.getLogger(HiloLebre.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

            }
            //Condidiciones de victoria
            if(Ejercicio8.tabl.getLebre()>69){
                System.out.println("Ganador Lebre");
            }else if(Ejercicio8.tabl.getLebre()>69&&Ejercicio8.tabl.getTartaruga()>69){
                System.out.println("Empate");
            }

        }
    }

}
