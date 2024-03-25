package temattres.bucles;

import java.util.Scanner;

public class BucleFor {
    public static void main(String[] args) {
        int inicio, fin;
        Scanner sc = new Scanner(System.in);
        System.out.println("En que nº empieza?");
        inicio = sc.nextInt();
        System.out.println("En que nº termina?");
        fin = sc.nextInt();
        //EL BUCLE FOR SE USA CUANDO SE SABE EL Nº DE VUELTAS QUE VAMOS A DAR(si el enunciado me dice n vueltas, tmb sé el nº)
        //1º declaración de variable auxiliar, 2º evaluación de la condición para entrar en el bucle,
        //3º incremento o decremento de la variable auxiliar
        for(int i = inicio;i<=fin;i++){
            System.out.println("Vamos por el..."+i);
        }
        System.out.println("Ya se ha realizado la impresion entre "+inicio+" y "+fin);
    }
}
