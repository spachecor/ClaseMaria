package temauno;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class FechaHora {
    public static void main(String[] args){
        //Fechas
        LocalDate ahora = LocalDate.now();
        System.out.println(ahora);
        LocalDate miCumple = LocalDate.of(1999, 03, 20);
        LocalDate miCumple2 = LocalDate.parse("1999-03-20");
        System.out.println(miCumple);
        System.out.println(miCumple2);
        //Fecha y hora
        LocalDateTime fechaHora = LocalDateTime.now();
        System.out.println(fechaHora);
        System.out.println(fechaHora.toLocalTime());
        String ahorita = ahora.toString();
    }
}
