package temados.librerias;

import java.util.Locale;

public class ClaseStringBuffer {
    public static void main(String[] args) {
        //Los objetos String son INMUTABLES, SU ESTADO NO PUEDE CAMBIAR
        //Nosotros podremos intentarlo to lo que queramos, pero la original JAMAS cambiará
        String strNormal = "Hola mundo";
        strNormal.toUpperCase();
        System.out.println(strNormal.toUpperCase());
        System.out.println(strNormal);
        //Con un objeto del tipo StringBuffer sí que podemos modificar la cadena en el objeto original
        StringBuffer stringBuffer = new StringBuffer(strNormal);
        stringBuffer.reverse();//le da la vuelva y se queda pa siempre así
        System.out.println(stringBuffer);

        //CONSTRUCTORES DE STRINGBUFFER
        StringBuffer buffer1 = new StringBuffer(); //tamaño potencial automaticamente asignado de 16 caracteres
        StringBuffer buffer2 = new StringBuffer(20); //capacidad marcada por parámetro
        StringBuffer buffer3 = new StringBuffer("Armonica");

        //length es la longitud real, lo que ocupa realmente y capacity es la capacidad reservada
        System.out.println(buffer3.length());
        System.out.println(buffer3.capacity());
        buffer3.trimToSize();//reduce el espacio reservado al realmente usado
        System.out.println(buffer3.length());
        System.out.println(buffer3.capacity());
        buffer3.ensureCapacity(25);
        System.out.println(buffer3.length());
        System.out.println(buffer3.capacity());



        //1º .append(la variable que quieras añadir al final)
        stringBuffer.append(12);
        stringBuffer.append("hoja");

        //2º .charAt(int posicion)
        char caracter1 = stringBuffer.charAt(2);

        //3º .delete(int comienzo, int final), y deleteCharAt(int posicion)
        System.out.println(stringBuffer);
        stringBuffer.delete(2, 5);//se borran el 2, el 3 y el 4. 5 NO INCLUIDO
        System.out.println(stringBuffer);
        stringBuffer.deleteCharAt(6);
        System.out.println(stringBuffer);

        //4º .insert(int posicion, variable a insertar) Igual que append solo que le dices la posicion donde quieres insertar
        stringBuffer.insert(5, "holiwis");//en la posición 5 lo inserta, y desplaza to pa la derecha
        System.out.println(stringBuffer);

        //5º .replace(int comienzo, int final, String reemplazo)
        stringBuffer.replace(2, 5, "caracola");//reemplaza lo que haya en las posiciones por el string dado
        System.out.println(stringBuffer);

        //6º .reverse() le da la vuelta al stringbuffer
        stringBuffer.reverse();
        System.out.println(stringBuffer);

        //7º .substring(int comienzo, int final) Me devuelve el String contenido entre las posiciones dadas
        String cadena = stringBuffer.substring(2,5);
        System.out.println(cadena);

        //8º .toString() Toma el StringBuffer y lo pasa a String, VUELVE A SER INMUTABLE, pero con el valor modificado
        String stringFinal = stringBuffer.toString();
        System.out.println(stringFinal);


    }
}
