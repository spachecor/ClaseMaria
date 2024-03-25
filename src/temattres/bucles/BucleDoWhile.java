package temattres.bucles;

import java.util.Scanner;

public class BucleDoWhile {
    public static void main(String[] args) {
        int numero;
        final int PRIMERA=1, SEGUNDA=2, TERCERA=3, SALIDA=4;
        Scanner sc = new Scanner(System.in);
        //SE UTILIZA CUANDO QUEREMOS QUE EL CONTENIDO SE EJECUTE AL MENOS 1 VEZ
        //el contenido se ejecuta AL MENOS 1 VEZ, después comprueba condición
        do{
            System.out.println("Elige una opcion para ver:\n1- La primera\n2- La segunda\n3- La tercera\n4- Salir");
            numero = sc.nextInt();
            //USO CONSTANTES PORQUE NO SE DEBEN PONER LITERALES
            switch (numero){
                case PRIMERA:
                    System.out.println("Viendo la primera...");
                    break;
                case SEGUNDA:
                    System.out.println("Viendo la segunda...");
                    break;
                case TERCERA:
                    System.out.println("Viendo la tercera...");
                    break;
                case SALIDA:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Canal no válido.");
                    break;
            }
        }while(numero!=4);
    }
}
