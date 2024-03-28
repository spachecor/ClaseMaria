package temattres.excepciones.excepcionpropia;

public class TestExcepcionCreada {
    public static void main(String[] args) throws NoNullException {
        TestExcepcionCreada tec = new TestExcepcionCreada();
        String cadenaConcatenada = tec.concatenacionCadenas(null, " mundo");
        System.out.println(cadenaConcatenada);
    }
    private String concatenacionCadenas(String cadena1, String cadena2) throws NoNullException {
        if(cadena1==null||cadena2==null) throw new NoNullException("No puede ser null");
        return cadena1.concat(cadena2);
    }
}
