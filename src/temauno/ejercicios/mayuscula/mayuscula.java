package mayuscula;

import java.util.Locale;
import java.util.Scanner;

public class mayuscula {
    public static void main(String[] args) {
        /*Programa que lea un carácter por teclado y compruebe si es una letra mayúscula.*/


       char caracter;
        Scanner leer = new Scanner(System.in);
        System.out.println("El carácter es : " );
        caracter = leer.next().charAt(0);

        if (Character.isUpperCase(caracter)){
            System.out.println("Es mayúscula");

        }else{
            System.out.println("Es minúscula");
        }



    }
}
