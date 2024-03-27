package temacuatro.teoria;

public class ModificadoresAcceso {//la clase siempre es public
    /*
    * - public: Mayor rango de accesibilidad
    * - protected: Accesible desde el mismo paquete y a clases que hereden de la clase donde se implemente
    * - private: Accesible únicamente desde la misma clase
    * - default(no poner ninguno): Accesible únicamente desde el mismo paquete
    * */
    //Ejemplo de aplicación:
    private String cadena;
    protected void getCadena(){}
}
