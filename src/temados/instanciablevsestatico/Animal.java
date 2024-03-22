package temados.instanciablevsestatico;

/**
 * Ejemplo this vs static
 */
public class Animal {
    static int nAreneros = 0;
    String tipo, raza, nombre;
    int edad;
    Animal(String tipoAnimal, String razaAnimal, String nombreAnimal, int edadAnimal){
        this.tipo = tipoAnimal;
        this.raza = razaAnimal;
        this.nombre = nombreAnimal;
        this.edad = edadAnimal;
        Animal.nAreneros++;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "tipo='" + tipo + '\'' +
                ", raza='" + raza + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
