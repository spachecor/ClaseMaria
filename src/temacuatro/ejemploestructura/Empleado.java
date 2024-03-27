package temacuatro.ejemploestructura;

/**
 * Clase empleado que es el molde del comportamiento y propiedades del empleado.
 * @author Selene
 * @version 1.0
 */
public class Empleado {//Cabecera de identificación de la clase
    //Campos o atributos - propiedades del objeto
    private String dni, nombre;
    private int edad;
    private double sueldoBase, sueldoFinal;
    private boolean gafas;
    private static int contador;
    //Bloques de inicialización - son lo 1º que se ejecuta cuando se ejecuta el programa
    {
        this.gafas=false;
        this.sueldoBase=1100;
    }
    static{
        Empleado.contador=0;
    }
    //Métodos (incluido el constructor)
    /*El constructor es la forma en la que se crea el objeto - El constructor es lo segundo que se ejecuta cuando se ejecuta el programa
    * OBLIGATORIO - tiene el mismo nombre que la clase*/

    /**
     * 
     * @param dni
     * @param nombre
     * @param edad
     */
    protected Empleado(String dni, String nombre, int edad){
        this.dni=dni;
        this.nombre=nombre;
        this.edad=edad;
        Empleado.contador++;
    }
    protected Empleado(String dni, String nombre, int edad, boolean gafas){
        this(dni, nombre, edad);
        this.gafas=gafas;
    }

    /*
    * Lo primero es el modificador de acceso que es opcional(si no lleva nada, es default).
    * Después el tipo de dato que devuelve, que puede ser primitivo o un objeto o la palabra reservada void, que significa
    * que no devuelve nada.
    * Si el método devuelve algo, es OBLIGATORIO el return, y con el return devolvemos el dato (Ej: return "Casa";).
    * Los argumentos son opcionales, los llevará si lo necesita
    *
    * TIPOS DE MÉTODOS BÁSICOS - MÉTODOS GET Y SET O GETTERS Y SETTERS
    *
    * El método get es el aquel que nos devuelve el valor del campo que lleve su nombre (Ej: getNombre())
    * El método set es aquel que asigna un valor(o un nuevo valor) a un campo (Ej: setNombre(String nombre))
    *
    * La norma es que el set suele llevar argumentos y el get no. El set suele ser void y el get suele devolver el tipo
    * del dato solicitado
    *
    * */
    public static int getContador(){
        return Empleado.contador;
    }
    public String getDni(){
        return this.dni;
    }
    public void setNombre(String nuevoNombre){
        this.nombre=nuevoNombre;
    }
    public void setGafas(boolean gafas){
        this.gafas=gafas;
    }
    protected double getSueldoBase(){
        return this.sueldoBase;
    }
    protected void setSueldoFinal(double sueldo){
        this.sueldoFinal=sueldo;
    }


}
