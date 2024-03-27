package temauno.ejercicios;

import java.util.Scanner;

public class examenTema1 {
    //Ejercicio 5
    public class SumadorUnario{  //Estaba mal porque habia que hacerle un casting de long a int
        public static void main(String[] args){
            int sumador1,sumador2;
            long contador=0;
            sumador1 = (int) contador++;
            System.out.println("sumador1=" + sumador1);
            sumador2= (int) ++contador;
            System.out.println("sumador2=" + sumador2 );
            System.out.println( contador%2==0 && sumador1%contador>0);



    //Ejercicio 6

            /*Sumar el dígito más a la izquierda de un número entero al propio valor de dicho
            número. Por ejemplo, si el número contiene el valor 463 después de la operación contendrá el
            valor 467 ( 463 + 4 ). El número introducido debe tener como mínimo 3 dígitos y como máximo
            6. Si se introduce un número que no tiene el tamaño anterior no se hará ninguna operación y se
            mostrará en consola 'El número introducido debe tener entre 3 y 6 dígitos' */

            Scanner leer = new Scanner(System.in);
            int numero;
            System.out.println("Introduce un numero de tres cifras");
            numero = leer.nextInt();






        }
    }








}
