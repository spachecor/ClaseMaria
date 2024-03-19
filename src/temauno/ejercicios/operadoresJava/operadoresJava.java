package temauno.ejercicios.operadoresJava;

import java.util.Scanner;

public class operadoresJava {
    /*Completa y comenta, con comentarios de código, el siguiente trozo de código:*/



    public class NumeroMayor {

        public static void main(String[] args) {

            int numero1, numero2; //Inicializamos la variable poniendole un nombre

            Scanner sc = new Scanner(System.in); //Llamamos a Scanner para que leamos por pantalla

            System.out.println("Introduce un número entero: "); //Pedimos que introduzca un numero

            numero1 = sc.nextInt(); // A la variable le ponemos el nextInt para que podamos ingresar el numero1 en pantalla

            System.out.println("Introduce un número entero: "); // Le pedimos que introduzca el numero

            numero2 = sc.nextInt(); // Volvemos a ponerle el nextInt a la variable para poder ingresar el numero2 por pantalla

        }

    }
}
