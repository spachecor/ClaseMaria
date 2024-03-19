package temauno;

public class TiposConversion {
    public static void main(String[] args){
        //NUMÉRICOS
        //conversión explicita con resultado incorrecto/inesperado
        long numero1 = 1234555555555555555L;
        int numero2 = (int)numero1; //hacemos CASTING
        System.out.println(numero2);
        //conversión explícita con resultado correcto/esperado
        int numero3 = 12;
        byte numero4 = (byte)numero3;
        System.out.println(numero4);

        //conversion implicita
        byte numero7 = 54;
        long numero8 = numero7;

        //CARACTERES
        //conversion explicita de char a int
        int numero5 = 81;
        char caracter1 = (char)numero5;
        System.out.println(caracter1);
        char caracter2 = 'a';
        //Conversion implicita de int a char
        int numero6 = caracter2;

        //De coma flotante o decimal a entero
        float numero9 = 1.2F;
        int numero10 = (int) numero9;
        System.out.println(numero10);
        //de entero a coma flotante
        long numero11 = 234L;
        float numero12 = numero11;
        System.out.println(numero12);
    }
}
