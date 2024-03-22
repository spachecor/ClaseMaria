package temados.instanciablevsestatico;

public class TestAnimal {
    public static void main(String[] args) {
        System.out.println(Animal.nAreneros);
        Animal animal1 = new Animal("Gato", "Común", "Pepito", 12);
        System.out.println(Animal.nAreneros);
        Animal animal2  = new Animal("Gato", "Siames", "Leo", 1);
        System.out.println(animal1);
        System.out.println(animal2);
        animal1.nombre = "Amelio";
        System.out.println(animal1);
        Animal.nAreneros = 3;
        System.out.println(Animal.nAreneros);

        //Método estático
        System.out.println("Elevar 3 al cuadrado: "+Math.pow(3, 2));
    }
}
