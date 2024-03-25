package temattres.sentanciasseleccion;

import java.util.Scanner;

public class Condicionales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean resultado;
        System.out.println("¿Desea ver el mensaje?(true/false)");
        resultado = sc.nextBoolean();
        //IF-ELSE BÁSICO
        if(resultado==true){//igualar a true es redundante pero se puede
            System.out.println("Este es el mensaje");
        }else{
            System.out.println("No te voy a enseñar el mensaje");
        }

        int numero;
        System.out.println("Dime un nº del 1 al 6");
        numero = sc.nextInt();
        //PRIMERA FORMA
        if(numero==1||numero==2){
            System.out.println("Tu nº es el 1 o el 2");
        } else if (numero==3||numero==4) {
            System.out.println("Tu nº es el 3 o el 4");
        }else if(numero==5||numero==6){
            System.out.println("Tu nº es el 5 o el 6");
        }else {
            System.out.println("El nº introducido no me vale");
        }
        //2º FORMA CONTRAIDA
        if(numero==1||numero==2)System.out.println("Tu nº es el 1 o el 2");
        else if (numero==3||numero==4)System.out.println("Tu nº es el 3 o el 4");
        else if(numero==5||numero==6)System.out.println("Tu nº es el 5 o el 6");
        else System.out.println("El nº introducido no me vale");

        //3º FORMA ANIDADA
        if(numero==1||numero==2){
            if(numero==1) System.out.println("Tu nº es el 1");
            else System.out.println("Tu nº es el 2");
        } else if (numero==3||numero==4) {
            if(numero==3) System.out.println("Tu nº es el 3");
            else System.out.println("Tu nº es el 4");
        }else if(numero==5||numero==6){
            if(numero==5) System.out.println("Tu nº es el 5");
            else System.out.println("Tu nº es el 6");
        }else {
            System.out.println("El nº introducido no me vale");
        }

    }
}
