package temados.objetoseinstancias;

public class TestCoche {
    public static void main(String[] args){
        int id2 = 2, numeroRuedas2 = 4, plaza2 = 5;
        String color2 = "azul";

        //instancia de coche, creamos un nuevo coche usando el constructor (usamos LITERALES)
        Coche coche1 = new Coche(1, "rojo", 4, 5);
        //instancia de coche, creamos un nuevo coche usando el constructor (NO usamos LITERALES)
        Coche coche2 = new Coche(id2, color2, numeroRuedas2, plaza2);

        //accedo a las propiedades del objeto coche y veo el color del coche instanciado
        System.out.println(coche1.color);

    }
}
