package temattres.bucles;

import java.util.Scanner;

public class Anidaciones {
    public static void main(String[] args) {
        //PODEMOS ANIDAR TODAS LAS ESTRUCTURAS DE CONTROL QUE CONOCEMOS ENTRE SÍ, usamos el ejemplo de antes
        int numero;
        final int PRIMERA=1, SEGUNDA=2, TERCERA=3, SALIDA=4;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Elige una opcion para ver:\n1- La primera\n2- La segunda\n3- La tercera\n4- Salir");
            numero = sc.nextInt();
            switch (numero){
                case PRIMERA:
                    boolean consentimiento=false;
                    while(!consentimiento){
                        System.out.println("Me das consentimiento para guardar tus datos? (true/false)");
                        consentimiento = sc.nextBoolean();
                    }
                    System.out.println("Viendo la primera...");
                    break;
                case SEGUNDA:
                    for (int i = 0;i<=10;i++){
                        System.out.println(i);
                    }
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
