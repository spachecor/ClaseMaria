package temauno.ejercicios;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class programasSencillos {
    public static void main(String[] args) {
        /*1. Programa Java que lea dos números enteros por teclado y los muestre por pantalla.

        int numero1;
        int numero2;
        Scanner leer = new Scanner(System.in);
        System.out.println("Primer numero es : ");
        numero1 = leer.nextInt();
        System.out.println("El segundo numero es : ");
        numero2 = leer.nextInt();
        */
        /*2. Programa Java que lea un nombre y muestre por pantalla
        String nombre;
        Scanner leer1 = new Scanner(System.in);
        System.out.println("Tu nombre es : ");
        nombre = leer1.nextLine();
        */

        /*3. Escribe un programa Java que lee un número entero por teclado y obtiene y muestra por
        pantalla el doble y el triple de ese número.*/

        int number;
        Scanner read = new Scanner(System.in);
        System.out.println("El número es : ");
        number = read.nextInt();
        System.out.println("El dobles es : " + (2*number));
        System.out.println("El triple es : " + (3*number));





    }
    }