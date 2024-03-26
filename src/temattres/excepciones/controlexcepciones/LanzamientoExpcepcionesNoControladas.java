package temattres.excepciones.controlexcepciones;

public class LanzamientoExpcepcionesNoControladas {
    static int contador;
    static int[] numeros;

    static {
        contador = 0;
        numeros = new int[3];
    }

    public static void main(String[] args) {

        LanzamientoExpcepcionesNoControladas obj = new LanzamientoExpcepcionesNoControladas();
        //Vamos a controlar por si nos salta la excepción
        try{//INTENTA HACER ESTO
            obj.aniadir(1);
            obj.aniadir(5);
            obj.aniadir(4);
            obj.aniadir(7);//VA A SALTAR EXCEPCION PORQUE EL ARRAY MIDE 3 E INTENTO METER 4
        }catch(RuntimeException e){//CAPTURA LA EXCEPCION
            System.out.println("Te has colao");//NO DETIENE EL PROGRAMA, HACE LO QUE CONTENGA EL CATCH Y CONTINÚA
        }finally {//HAYA O NO EXCEPCION, SÍ O SI REALIZA EL CÓDIGO DEL FINALLY
            for (int i = 0; i < LanzamientoExpcepcionesNoControladas.numeros.length; i++) {
                System.out.println(numeros[i]);
            }
        }

    }

    /**
     * Método que añade numeros a un array de numeros. Contiene una excepción para controlar que no se llene el array
     *
     * @param numero el nº que va a entrar al array
     */
    void aniadir(int numero) {
        if (LanzamientoExpcepcionesNoControladas.contador < 3) {
            LanzamientoExpcepcionesNoControladas.numeros[contador] = numero;
            LanzamientoExpcepcionesNoControladas.contador++;
        } else throw new RuntimeException("El array está lleno");//lanzamos una excepción si el array está lleno
    }
}
