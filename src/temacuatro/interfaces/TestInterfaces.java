package temacuatro.interfaces;

public class TestInterfaces {
    public static void main(String[] args) {
        String cadena1="hola", cadena2="hol";
        System.out.println(cadena2.compareTo(cadena1));

        Automovil coche1=new Automovil(null, null);
        Automovil coche2=new Automovil("azul", "dacia");
        System.out.println(coche1.compareTo(coche2));
    }
}
