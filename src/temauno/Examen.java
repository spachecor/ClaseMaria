package temauno;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Examen {
    public static void main(String[] args) {
        /*

Ejercicio 8 - Analiza el siguiente trozo de código y explica cada línea añadiendo comentarios de
código (2,5 puntos: h):
byte b = 42;
char c = 'a';
short s = 1024;
int i = 50000;
float f = 5.67f;
double d = .1234;
double result = (f * b) + (i / c) - (d * s);
System.out.println("resultado = " + result);
- Responde a las siguientes preguntas y pon un ejemplo:
¿Cuándo se produce un desbordamiento de una variable? ¿Qué ocurre?
¿Es lo mismo desbordamiento que truncamiento?
Ejercicio 9 - Utiliza un operador unario sobre el mes de una fecha introducida por consola
(formato yyyy-MM-dd hh:mm,
donde M=mes y m=minuto). Explica el uso de dicho operador en todas sus variantes. Relaciona,
si es posible,
el operador unario elegido con funciones de alguno de los tipos de datos utilizados en la fechahora. Después,
muestra el número de días, minutos y segundos transcurridos desde la fecha introducida y tu
fecha de cumpleaños
(2,5 puntos: g)
Ejercicio 10 - Comenta todo el código resultante de responder a las siguientes preguntas (1
punto, i)*/
        /*Ejercicio 6 - Sumar el dígito más a la izquierda de un número entero al propio valor de dicho
        número. Por ejemplo, si el número contiene el valor 463 después de la operación contendrá el
        valor 467 ( 463 + 4 ). El número introducido debe tener como mínimo 3 dígitos y como máximo
        6. Si se introduce un número que no tiene el tamaño anterior no se hará ninguna operación y se
        mostrará en consola 'El número introducido debe tener entre 3 y 6 dígitos' (1,5 puntos: e)*/

        int numero;//declaramos el numero
        numero = 467;
        int numeroIzquierda = numero/100;
        System.out.println("el resultado sería "+(numero+numeroIzquierda));

        /*Ejercicio 7 - Solicita la fecha de nacimiento de una persona (2,5 puntos: f). Muestra lo siguiente:
        - En caso de no tener 18 años, mostrar los años, meses y días que le faltan
        - En caso de tener 18 años o más, mostrar los años, meses y días transcurridos desde que
        cumplió los 18 años
        a la fecha actua.*/
        LocalDate nacimiento, ahora, cumple;
        Period periodo;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu fecha de nacimiento (yyyy-mm-dd)");
        nacimiento = LocalDate.parse(sc.next());
        ahora = LocalDate.now();
        cumple = nacimiento.plusYears(18);
        periodo = Period.between(cumple, ahora);
        System.out.println("En total, hace: "+periodo.getDays()+" días, "+ periodo.getMonths()+" meses, "+periodo.getYears()+" años.");
        if(ChronoUnit.YEARS.between(nacimiento, ahora)>=18){
            System.out.println("Mayor de edad");
        }else System.out.println("Menor de edad");



    }
}
