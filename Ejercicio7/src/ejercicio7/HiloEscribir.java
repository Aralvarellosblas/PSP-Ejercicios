package ejercicio7;

import static ejercicio7.Ejercicio7.co;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Hilo encargado de escibir un mensaje 5 veces, si el mensaje ya está escrito
 * se muestra un mensaje informativo
 *
 * @author Arturo
 */
public class HiloEscribir extends Thread{

    /**
     * Constructor de la clase
     *
     * @param string nombre del hilo
     */
    public HiloEscribir(String string){
        super(string);
    }

    /**
     * Cuando se ejecuta realiza 5 iteraciones escribiendo un mensaje y
     * mostrando el numero de iteracion
     */
    @Override
    public void run(){
        for(int i=0; i<5; i++){

            synchronized(co.getMensaje()){
                if("".equals(co.getMensaje())){
                    co.setMensaje("Mensaje nº:    "+i);
                    System.out.println("Mensaje enviado "+i);
                }else{
                    System.out.println(getName()+"YA HAY UN MENSAJE");
                }
                try{
                    HiloEscribir.sleep(100);
                }catch(InterruptedException ex){
                    Logger.getLogger(HiloEscribir.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
