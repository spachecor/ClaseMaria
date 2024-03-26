package temattres;

public class SentenciasSalto {
    public static void main(String[] args) {
        //BREAK - rompe el bucle y termina, no se ejecuta nada más
        int numero = 0;
        while(numero<=10){
            //si el numero es 5 sale del bucle, NO VUELVE A REVISAR LA CONDICIÓN, SALE DEL BUCLE DIRECTAMENTE
            if(numero==5){
                break;
            }
            //la impresión no está afectado por el break, el break está dentro del if.
            System.out.println(numero);
            numero++;
        }

        //CONTINUE - impide que las siguientes lineas se ejecuten y vuelve a comprobar la condicion, si se cumple, seguirá en el bucle
        int numero2 = 0;
        while(numero2<=10){
            //si es 5, se suma 1 para que se haga bucle infinito y vuelve a comprobar la condición SIN EJECUTAR LAS LINEAS DETRÁS DEL CONTINUE
            if(numero2==5){
                numero2++;
                continue;
            }
            System.out.println(numero2);
            numero2++;
        }

    }

}
