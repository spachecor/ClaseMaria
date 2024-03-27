package temacuatro.ejemploestructura;

public class Electricista extends Empleado{
    private final double PLUS_PELIGROSIDAD;
    {
        this.PLUS_PELIGROSIDAD =300;
    }

    public Electricista(String dni, String nombre, int edad){
        super(dni, nombre, edad);
        super.setSueldoFinal(super.getSueldoBase()+this.PLUS_PELIGROSIDAD);
    }
    public Electricista(String dni, String nombre, int edad, boolean gafas){
        this(dni, nombre, edad);
        super.setGafas(gafas);
    }

}
