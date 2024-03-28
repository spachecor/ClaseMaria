package temattres.loggerexplicacion;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerExplicacion {
    public static void main(String[] args) {
        int numero1 = 5, numero2 = 8, numero3;
        Logger logger = Logger.getLogger(LoggerExplicacion.class.getName());


        logger.warning("Error terrible");

        if(numero1>0&&numero2>0){
            numero3=numero1+numero2;
            logger.info("Se ha realizado la suma entre "+numero1+" y "+numero2+" y ha tenido el siguiente resultado: "+numero3);
        }

        logger.log(Level.INFO, "Hola");

    }
}
