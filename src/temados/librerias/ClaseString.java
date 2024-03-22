package temados.librerias;

public class ClaseString {
    public static void main(String[] args) {
        String cadena1 = "Hola mundo";
        //1º .charAt(int index)
        char character1 = cadena1.charAt(2);//imprime l

        //2º .equals(Object obj) - devuelve un boolean
        String cadena2 = "gato";
        boolean boolean1 = cadena2.equals("gatos");//false, comprueba si son iguales

        //3º .compareTo(String string) - devuelve un numero, 0 si son iguales, 1 si es mayor y -1 si es menor
        String cadena3 = "perro";
        int numero1 = cadena3.compareTo("perros");//da -1 porque perros es de mayor longitud que perro, si fuesen de la misma longitud,
        //devuelve la diferencia entre caracteres
        int numero2 = cadena3.compareToIgnoreCase("Perro");
        //4º .substring(int comienzo, int fin) - devuelve la subcadena, incluido el inicio pero no el fin (devuelve uno menos)
        String substring = cadena1.substring(1, 5);

        //5º .concat(String str) - Devuelve un String, la fusión de al que se aplica con el del parametro
        String cadena4 = cadena1.concat("María");

        //6º .replace(char antiguo, char nuevo) - Devuelve la cadena modificada, reemplaza los caracteres viejos por los nuevos
        String cadena5 = cadena1.replace('o', '0');

        //7º .indexOf(String str) - Devuelve la posición (int) en la que está lo que buscas la primera vez que lo encuentra (de izq a derecha)
        String cadenaEjemplo = "Hola mundo, me gusta el mundo y veo el mundo";
        int busqueda1 = cadenaEjemplo.indexOf("mundo");//primer mundo
        int busqueda2 = cadenaEjemplo.lastIndexOf("mundo");//ultimo mundo
        int busqueda3 = cadenaEjemplo.indexOf("mundo", 10);//el mundo del medio

        //8º .toUpperCase()/.toLowerCase
        String cadena6 = cadena1.toLowerCase();//te lo pone en minusculas
        String cadena7 = cadena1.toUpperCase();//te lo pone en mayúsculas

        //9º .replaceAll(String anterior, String nuevo) - Reemplaza las conincidencias por el nuevo string
        String cadena8 = cadenaEjemplo.replaceAll("mundo", "vivero");

        //10º .split(String separador) - Devuelve un array(lista) del contenido separado por el separador

        String[] array = cadenaEjemplo.split(" ");//nos separa por el espacio y nos genera una lista con lo que hay entre los espacios

        //11º .toCharArray() - Devuelve un array(lista) de caracteres
        char[] arrayChar = cadena1.toCharArray();

        //12º .length() - Devuelve la longitud del string
        int longitud = cadenaEjemplo.length();
        System.out.println(longitud);//mide 44 caracteres
    }
}
