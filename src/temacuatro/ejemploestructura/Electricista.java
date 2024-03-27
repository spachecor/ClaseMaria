package temacuatro.ejemploestructura;
/**
 * Clase empleado que es el molde del comportamiento y propiedades del empleado del tipo electricista.
 * @author Selene
 * @version 1.0
 */
public class Electricista extends Empleado{
    private final double PLUS_PELIGROSIDAD;
    {
        this.PLUS_PELIGROSIDAD =300;
    }

    /**
     * Constructor basico para un electricista
     * @param dni el dni del electricista
     * @param nombre el nombre el electricista
     * @param edad la edad de electricista
     */
    public Electricista(String dni, String nombre, int edad){
        super(dni, nombre, edad);
        super.setSueldoFinal(super.getSueldoBase()+this.PLUS_PELIGROSIDAD);
    }

    /**
     * Constructor avanzado para un electricista
     * @param dni el dni del electricista
     * @param nombre el nombre el electricista
     * @param edad la edad de electricista
     * @param gafas si lleva o no gafas
     */
    public Electricista(String dni, String nombre, int edad, boolean gafas){
        this(dni, nombre, edad);
        super.setGafas(gafas);
    }

}
