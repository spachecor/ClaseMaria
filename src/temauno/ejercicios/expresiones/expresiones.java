package temauno.ejercicios.expresiones;

import java.util.Scanner;

public class expresiones {
    public static void main(String[] args) {
        // Escribe un programa Java que resuelva las expresiones equivalentes para cada uno de los siguientes enunciados:
        //10. Comprobar si la primera cifra de un número entero N de 3 cifras es impar

        int numero;
        Scanner leer = new Scanner(System.in);
       /* System.out.println("Ingresa el numero: ");
        numero = leer.nextInt();

        int numero1 = numero / 100; // dividimos el numero entre 100 para coger la primera cifra
        boolean esImpar = numero1 % 2 != 0; // el resto de la division del numero e ntre dos no es igual a cero

        if (esImpar) {
            System.out.println("La primera cifra del numero es impar");
        } else {
            System.out.println("La primera cifra del numero es par");
        }


        // 11. Comprobar si la primera cifra de un número entero N de 4 cifras es par

        int numero2;
        System.out.println("Ingresa el numero : ");
        numero2 = leer.nextInt();

        numero2 = numero2 / 1000;
        boolean esPar = numero2 % 2 == 0 ;
        System.out.println(esPar?"el numero es par":"el numero es impar");
        /*12. Comprobar si una variable A de tipo carácter contiene una letra mayúscula

        char letra = 'c';
        String letra1 = String.valueOf(letra);
        boolean boolean1 = letra1.toLowerCase().equals(letra1);
        System.out.println(boolean1?"minuscula":"mayuscula");







        //13. Comprobar si una variable A de tipo carácter contiene una letra mayúscula o minúscula







        //14. Comprobar si una variable A de tipo carácter no contiene una letra mayúscula

        char letra3 = 'a';
        String letra4 = String.valueOf(letra3);
        boolean boolean2 = letra4.toLowerCase().equals(letra4);
        System.out.println(boolean2?"Minuscula":"mayuscula");
        */
        /*15. Comprobar si una variable A de tipo carácter no contiene una letra mayúscula o minúscula





        //16. Comprobar si el contenido de la variable N termina en 0 ó en 7
        int numero3;//declaración
        System.out.println("Introduce un nº");
        numero3 = leer.nextInt();//asignación con valor introducido por consola
        numero3 %= 10;//tomamos el módulo del nº entre 10 que nos da el resto, que sería el último nº
        boolean resultado = (numero3 == 0) || (numero3 == 7); //cogemos el último y comprobamos si es 0 o 7
        System.out.println(resultado?"Termina en 0 o en 7":"No termina ni en 0 ni en 7");

        /*17. Comprobar si el contenido de la variable precio es igual o mayor que 10€ y menor que 50€
        int precio;
        System.out.println("Introduce un precio");
        precio = leer.nextInt();
        boolean precio1 = precio>=10 && precio<50;
        System.out.println(precio1?"Es mayor o igual a 10 y menor a 50":"Es menor a 10 o mayor o igual 50");

        //18. Sumar el dígito más a la derecha de N al propio valor de N.
        // Por ejemplo, si N contiene el valor 463 después de la operación contendrá el valor 466 ( 463 + 3 )
        int numero4;
        System.out.println("Introduzca un nº");
        numero4 = leer.nextInt();
        int numero5 = numero4%10;
        int numero6 = numero4+numero5;
        System.out.println(numero4+" + "+numero5+" = "+ numero6);*/

        //19. Comprobar si un número entero N de cuatro cifras es capicúa.
        // Un número es capicúa si se puede leer igual de derecha a izquierda que de izquierda a derecha.
        //numero = ABCD     A = millar, B = centena, C = decena y D = unidad
        System.out.println("Introduce un nº de 4 cifras");
        int numeroCapicua = leer.nextInt();
        int unidad = numeroCapicua%10;//4
        int decena = numeroCapicua%100/10;//3
        int centena = numeroCapicua%1000/100;//2
        int millar = numeroCapicua/1000;//1  1234/1000=1.234
        boolean comprobacion = unidad==millar && decena==centena;
        System.out.println(comprobacion?"Es capicua":"No es capicua");

        //20. Una variable entera M contiene un número de mes. Comprobar si corresponde a un mes de 30 días.
        //21. Quitarle a un número entero N su última cifra. Supondremos que N tiene más de una cifra. Por ejemplo si N contiene el valor 123 después de la operación contendrá el valor 12.
        //22. Quitarle a un número entero N de 5 cifras su primera cifra. Por ejemplo si N contiene el valor 12345, después de la operación contendrá el valor 2345.
        //23. Comprobar si una variable C de tipo char contiene un dígito. (Carácter entre 0 y 9)
        //24. Dada dos variables enteras N y M de cuatro cifras, sumar las cifras de N y guardar la suma en la variable X, sumar las cifras de M y guardar la suma en la variable Y. Finalmente guarda en la variable Z la suma de X e Y.
        //25. Con DN, MN, AN  día, mes y año de nacimiento de una persona y DA, MA, AA día, mes y año actual, escribe la expresión algorítmica que compruebe si tiene 18 años cumplidos.*/

    }
}



