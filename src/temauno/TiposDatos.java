package temauno;

public class TiposDatos {
    public static void main(String[] args){
        int numero = 9;
        //java es case sensitive, cadena y Cadena son diferentes
        String cadena = "hola mundo";
        String Cadena = "aqui toy";
        //lowerCamelCase
        String cadenaDeEjemplo; //1º letra de la 1º palabra en minúsculas, 1º letra de demás palabras en mayúsuculas

        //declaracion
        int edad; //no le doy valor, pero la declaro
        //asignación
        edad = 24; //ya estaba declarada, y le doy un valor
        //inicialización
        int edadJuan = 35; //la declaro y la asigno de una

        //constantes
        final int ANIO_COVID = 2020; //se excriben en mayúsculas y si hay varias palabras separadas por guión bajo
        //ANIO_COVID = 2021; ERROR TERRIBLE, NO SE PUEDE


        //tipos de datos
        long chipAnimal;//declaro
        chipAnimal = 223344556677889L; //asigno
        float numeroDecimal = 1.34F;

        //inicializar cadena mediante un objeto de tipo cadena
        String cadenaEjemploNew = new String("Hola mundo cruel");
        //inicializar cadena sin new
        String cadenaEjemploNoNew = "Hola mundo";




    }
}
