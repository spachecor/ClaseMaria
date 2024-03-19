package temauno;

import java.util.Scanner;

public class FlujoEntradaSalida {
    public static void main(String[] args){
        //FLUJO DE SALIDA - Ejemplo (System.out en salida)
        System.out.println("Hola mundo");
        //FLUJO DE ENTRADA
        Scanner sc = new Scanner(System.in);//abrimos flujo de entrada
        //ejemplo pido tu nombre y te saludo
        String nombre;
        System.out.println("Buenas, dime tu nombre");
        nombre = sc.nextLine();
        System.out.println("Hola "+nombre);
        sc.close();//cerramos flujo de entrada

        //CARACTERES ESPECIALES DEL System.out.print
        System.out.println("Hola\nhola");//salto de linea
        System.out.println("hola\thola");//tabulacion
        System.out.println("Hol\ba");//se come la letra de delante
        System.out.println("hola\rhola");//retorno carro
        System.out.println("hola\\hola");//para introducir la barra invertida
        System.out.println("hola \'c\'aracola");
        System.out.println("Hola \"c\"aracola");



    }
}
