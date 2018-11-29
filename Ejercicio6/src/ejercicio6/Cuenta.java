package ejercicio6;

/**
 * La clase cuenta permite crear una cuenta con los metodos necesarios para el
 * ingreso y retirada de efectivo
 *
 * @author Arturo
 */
public class Cuenta{

    static int ValorTotal;//Saldo total de la cuenta

    /**
     * Constructor de la cuenta
     */
    public Cuenta(){
    }

    /**
     * Metodo de acceso
     *
     * @return devuelve el valor actuel de la cuenta
     */
    public int getValorTotal(){
        return ValorTotal;
    }

    /**
     * Metodo de acceso permite introducir un nuevo valor en la cuenta
     *
     * @param ValorTotal valor a introducir para el cambio
     */
    public void setValorTotal(int ValorTotal){
        this.ValorTotal=ValorTotal;
    }

}
