package ejercicio7;

import static ejercicio7.Ejercicio7.co;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Hilo encargado de leer un mensaje 5 veces, si el mensaje ya está leido y el
 * buzon vacio se muestra un mensaje informativo
 *
 * @author Arturo
 */
public class HiloLeer extends Thread{

    /**
     * Constructor de la clase
     *
     * @param string nombre del hilo
     */
    public HiloLeer(String string){
        super(string);
    }

    /**
     * Cuando se ejecuta realiza 5 iteraciones intentando leer un mensaje si el
     * buzon se encuentra vacio muestra un mensaje
     */
    @Override
    public void run(){
        for(int i=0; i<5; i++){

            synchronized(co.getMensaje()){
                if(co.getMensaje()!=""){
                    System.out.println(getName()+" "+co.getMensaje().toString());
                    co.setMensaje("");
                }else{
                    System.out.println("No hay mensajes");
                }

                try{
                    HiloLeer.sleep(100);
                }catch(InterruptedException ex){
                    Logger.getLogger(HiloEscribir.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }

    }
}
