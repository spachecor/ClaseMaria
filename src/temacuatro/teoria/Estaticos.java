package temacuatro.teoria;

public class Estaticos {
    //los campos estáticos pernecen a la clase(molde) y no a la instancia(el objeto). Todos los objetos van a tener acceso
    //al mismo campo, obtener su valor y modificarlo
    private static int contador;
    public final int MAXIMO;
    {
        MAXIMO = 1;
    }

    Estaticos(){
        contador++;
    }

}
