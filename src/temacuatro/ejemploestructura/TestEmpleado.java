package temacuatro.ejemploestructura;

public class TestEmpleado {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("12345678W", "Pepe", 45, true);
        Empleado empleado2 = new Empleado("87654321A", "Ana", 34);
        empleado2.setGafas(true);

        System.out.println("Tenemos un total de: "+Empleado.getContador()+" empleados.");

        Electricista electricista1 = new Electricista("45678123D", "Maria", 35);
        Electricista electricista2 = new Electricista("65498732A", "Manuel", 65, true);
        System.out.println("Tenemos un total de: "+Empleado.getContador()+" empleados.");


    }
}
