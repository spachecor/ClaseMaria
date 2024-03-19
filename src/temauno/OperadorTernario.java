package temauno;

public class OperadorTernario {
    public static void main(String[] args){
        //(condicion)?(opcion verdadero o true):(opcion falso o false)
        int contador = 9;
        String cadena = (contador>10)?"El contador es mayor a 10":"El contador es menor o igual a 10";
        System.out.println(cadena);
        String cadenaNegada = (!(contador>10))?"El contador es mayor a 10":"El contador es menor o igual a 10"; //El ! convierte en false en true y en true el false
        System.out.println(cadenaNegada);
    }
}
