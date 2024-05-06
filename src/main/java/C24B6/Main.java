package C24B6;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //PRUEBAS
        DiaSemana diaSemana = DiaSemana.LUNES;
        System.out.println("Hoy es: " + diaSemana);

        //Ejectcio propuesto 1.
        System.out.println("\n-----------------------------Ejercicio Intefaces-----------------------------\n");
        Coche miC = new Coche();

        miC.acerlerar(20);
        miC.frenar();


        //FECHAS
        System.out.println("\n-----------------------------Fechas-----------------------------\n");

        Calendar calendar = Calendar.getInstance();
        Date date = new Date();
        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println("Calendar: "+calendar);
        System.out.println("Date: "+date);
        System.out.println("localDate: "+localDate);
        System.out.println("localDateTime: "+localDateTime);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String dateFormatter = localDateTime.format(formatter);

        System.out.println("dateFormatter: "+dateFormatter);

        System.out.println("\n-----------------------------Ejercicios fechas-----------------------------\n");

        //Mi fecha de nacimiento es el 03 de febrero del 2000
        LocalDate fNacimiento = LocalDate.of(2000,2,3);
        LocalDateTime fActual = LocalDateTime.now();

        System.out.println("Edad: "+(fActual.getYear()-fNacimiento.getYear())+" Años "+(fActual.getMonthValue()-fNacimiento.getMonthValue())+" Meses "+(fActual.getDayOfMonth()-fNacimiento.getDayOfMonth())+" Días");


    }
}
