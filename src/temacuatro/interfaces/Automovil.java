package temacuatro.interfaces;

import org.eclipse.jdt.annotation.NonNull;

public class Automovil implements Comparable{
    private String color, nombre;
    private int id;
    private static int contador;
    static{
        contador=0;
    }
    public Automovil(@NonNull String color, String nombre){
        Automovil.contador++;
        this.id=Automovil.contador;
        this.color=color;
        if(nombre==null)throw new RuntimeException("Loco es null");
        this.nombre=nombre;
    }

    @Override
    public int compareTo(Object o) {
        if(this.id==((Automovil)o).getId()) return 0;
        else if(this.id>((Automovil)o).getId()) return 1;
        else return -1;
        //return this.nombre.compareTo(((Automovil)o).getNombre());
    }
    public int getId(){
        return this.id;
    }
    public String getNombre(){
        return this.nombre;
    }
}
