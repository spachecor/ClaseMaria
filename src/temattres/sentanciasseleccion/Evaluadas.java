package temattres.sentanciasseleccion;

import java.util.Scanner;

public class Evaluadas {
    public static void main(String[] args) {
        int numero;
        final int PRIMERA=1, SEGUNDA=2, TERCERA=3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Elige una opcion para ver:\n1- La primera\n2- La segunda\n3- La tercera");
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
            default:
                System.out.println("Canal no válido.");
                break;
        }
    }
}
