package temauno;

public class Envoltorios {
    public static void main(String[] args){
        //Pasando de int a String usando metodo valueof
        int edad = 29;
        String edadSonia = String.valueOf(edad);
        //Pasando de String a int usando Integer(envoltorio de int)
        String edadMarta = "35";
        int edadMarta1 = Integer.parseInt(edadMarta);
        //Pasando de String a boolean usando Boolean(envoltorio de boolean)
        String verdadero = "true";
        boolean valorNecesitado = Boolean.valueOf(verdadero);

        System.out.println(edadMarta1);

    }
}
