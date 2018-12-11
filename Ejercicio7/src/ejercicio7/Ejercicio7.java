package ejercicio7;

/**
 * Este programa simula un buzon de correo con un solo espacio de mensaje, de
 * forma que si se intenta escribir cuando ya hay un mensaje o leercuando no hay
 * se muestra un mensaje de error
 *
 * @author Arturo
 */
public class Ejercicio7{

    static Correo co=new Correo();

    /**
     * En el metodo main se elimina el contenido del mensaje y se inician los
     * hilos para leer y escribir
     *
     * @param args the command line arguments
     */
    public static void main(String[] args){

        co.setMensaje("");

        new HiloEscribir("Escribir").start();
        new HiloLeer("Leer").start();
    }
}
