package temattres.loggerexplicacion;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ManejadoresPropios {
    public static void main(String[] args) {
        //inicializar el trazador
        Logger logger = Logger.getLogger(ManejadoresPropios.class.getName());
        //deshabilitamos el manejador de serie
        logger.warning("hola");
        logger.setUseParentHandlers(false);
        logger.warning("hola");//no sale porque no hay manejador

        //Declaramos los nuevos manejadores
        FileHandler fileHandler;
        ConsoleHandler consoleHandler;
        try{
            //inicializo
            fileHandler = new FileHandler("logs.txt");//le asignamos nombre al fichero que guardará los logs
            consoleHandler = new ConsoleHandler();

            //configuramos los nuevos manejadores
            consoleHandler.setLevel(Level.SEVERE);
            //añadimos el nuevo manejador al logger
            logger.addHandler(consoleHandler);
            //configuramos el manejador de ficheros
            fileHandler.setLevel(Level.ALL);
            //añadimos el nuevo manejador de fichero al logger
            logger.addHandler(fileHandler);
        }catch (IOException e){
            e.printStackTrace();
        }
        logger.info("Soy un logger info");
        logger.severe("Soy severe");
    }
}
