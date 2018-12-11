package ejercicio7;

/**
 * Clase correo con el atributo mensaje un constructor y los metodos de acceso
 * para manejar el objeto
 *
 * @author Arturo
 */
public class Correo{

    String mensaje="";

    public Correo(){
    }

    public String getMensaje(){
        return mensaje;
    }

    public void setMensaje(String mensaje){
        this.mensaje=mensaje;
    }

    @Override
    public String toString(){
        return "Correo{"+"mensaje="+mensaje+'}';
    }
}
