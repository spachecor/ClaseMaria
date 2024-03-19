package temados.porvaloryporreferencia;

import temados.objetoseinstancias.Coche;

public class DiferenciaValorReferencia {
    public static void main(String[] args){
        int numero1 = 5;
        int numero2 = 7;
        int numero3;

        Coche coche1 = new Coche(1, "rojo", 4, 5);
        Coche coche2 = new Coche(2, "rojo", 4, 5);
        Coche coche3;

        String cadena1 = "hola";
        String cadena2 = "mundo";
        String cadena3 = "soy cadena";

        //POR VALOR - datos primitivos y clases inmutables
        numero1 = numero2;
        System.out.println(numero1);
        numero1 = 4;
        System.out.println(numero2);

        cadena1 = cadena2;
        System.out.println(cadena1);
        cadena1 = "holis mundo";
        System.out.println(cadena2);//NO ES POR REFERENCIA PORQUE STRING ES INMUTABLE

        //TODOS LOS ENVOLTORIOS SON INMUTABLES

        //POR REFERENCIA - el resto de objetos
        coche1 = coche2;//ambos ahora apuntan a la misma dirección en memoria, si cambia algo en coche1, también cambia en coche2
        System.out.println(coche2.color);
        coche1.color="amarillo";
        System.out.println(coche2.color);
    }
}
