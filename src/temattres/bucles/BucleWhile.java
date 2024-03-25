package temattres.bucles;

public class BucleWhile {
    public static void main(String[] args) {
        int numero = 0;
        //SE USA CUANDO NO SE SABE EL Nº DE VUELTAS QUE VAMOS A DAR
        //Primero comprueba la condición y si la cumple entra, cuando no la cumpla sale del bucle
        while(numero<=100){
            System.out.println(numero);
            numero++;
        }
    }
}
