package temattres.excepciones;

public class PrecondicionesPostcondiciones {
    static int contador;
    static int[] numeros;
    static{
        contador=0;
        numeros=new int[3];
    }
    public static void main(String[] args) {

        PrecondicionesPostcondiciones obj = new PrecondicionesPostcondiciones();
        obj.aniadir(1);
        obj.aniadir(5);
        obj.aniadir(4);
        obj.aniadir(7);
        for(int i = 0;i<PrecondicionesPostcondiciones.numeros.length;i++){
            System.out.println(numeros[i]);
        }
    }

    /**
     * Método que añade numeros a un array de numeros. Contiene una precondición para evitar que se añada en posiciones que no existen
     * y una postcondicion que indique la posición del array donde entrará el siguiente nº
     * @param numero el nº que va a entrar al array
     */
    void aniadir(int numero){
        //PRECONDICIÓN - comprobamos que el array no esté lleno ya, si está lleno, no llena más
        if(PrecondicionesPostcondiciones.contador<3){
            PrecondicionesPostcondiciones.numeros[contador]=numero;
            //POSTCONDICIÓN - una vez se ha realizado lo que el programa tiene que realizar, se suma 1 al contador
            PrecondicionesPostcondiciones.contador++;
        }else System.out.println("Estoy lleno, no me coge");
    }

}
