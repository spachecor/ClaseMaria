package expresiones;

import java.util.Scanner;

public class expresiones {
    public static void main(String[] args) {
        // Escribe un programa Java que resuelva las expresiones equivalentes para cada uno de los siguientes enunciados:
        //10. Comprobar si la primera cifra de un número entero N de 3 cifras es impar

        int numero;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa el numero: ");
        numero = leer.nextInt();


        boolean esImpar = numero % 2 != 0;

        if (esImpar) {
            System.out.println("La primera cifra del numero es impar");
        } else {
            System.out.println("La primera cifra del numero es par");
        }


        // 11. Comprobar si la primera cifra de un número entero N de 4 cifras es par


        /*12. Comprobar si una variable A de tipo carácter contiene una letra mayúscula
        13. Comprobar si una variable A de tipo carácter contiene una letra mayúscula o minúscula
        14. Comprobar si una variable A de tipo carácter no contiene una letra mayúscula
        15. Comprobar si una variable A de tipo carácter no contiene una letra mayúscula o minúscula
        16. Comprobar si el contenido de la variable N termina en 0 ó en 7
        17. Comprobar si el contenido de la variable precio es igual o mayor que 10€ y menor que 50€
        18. Sumar el dígito más a la derecha de N al propio valor de N. Por ejemplo, si N contiene el valor 463 después de la operación contendrá el valor 466 ( 463 + 3 )
        19. Comprobar si un número entero N de cuatro cifras es capicúa. Un número es capicúa si se puede leer igual de derecha a izquierda que de izquierda a derecha.
        20. Una variable entera M contiene un número de mes. Comprobar si corresponde a un mes de 30 días.
        21. Quitarle a un número entero N su última cifra. Supondremos que N tiene más de una cifra. Por ejemplo si N contiene el valor 123 después de la operación contendrá el valor 12.
        22. Quitarle a un número entero N de 5 cifras su primera cifra. Por ejemplo si N contiene el valor 12345, después de la operación contendrá el valor 2345.
        23. Comprobar si una variable C de tipo char contiene un dígito. (Carácter entre 0 y 9)
        24. Dada dos variables enteras N y M de cuatro cifras, sumar las cifras de N y guardar la suma en la variable X, sumar las cifras de M y guardar la suma en la variable Y. Finalmente guarda en la variable Z la suma de X e Y.
        25. Con DN, MN, AN  día, mes y año de nacimiento de una persona y DA, MA, AA día, mes y año actual, escribe la expresión algorítmica que compruebe si tiene 18 años cumplidos.*/

    }
}



