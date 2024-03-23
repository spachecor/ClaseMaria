package temados.instanciablevsestatico;

/**
 * Ejemplo this vs static
 */
public class Animal {
    static int nAreneros = 0;
    String tipo, raza, nombre;
    int edad;
    private String color;
    Animal(String tipoAnimal, String razaAnimal, String nombreAnimal, int edadAnimal, String color){
        this.tipo = tipoAnimal;
        this.raza = razaAnimal;
        this.nombre = nombreAnimal;
        this.edad = edadAnimal;
        this.setColor(color);
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
    private void setColor(String color){
        this.color=color;
    }
    public String getColor(){
        return this.color;
    }
}
