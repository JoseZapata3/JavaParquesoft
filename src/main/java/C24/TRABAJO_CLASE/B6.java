package C24.TRABAJO_CLASE;

import C24B6.Coche;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class B6 {
    public static void main(String[] args) {

        //Ejectcio propuesto 1.
        System.out.println("\n-----------------------------Ejercicio Intefaces-----------------------------\n");
        Coche miC = new Coche();

        miC.acelerar(20);
        miC.frenar();

        System.out.println("\n-----------------------------Ejercicios fechas-----------------------------\n");

        //Mi fecha de nacimiento es el 03 de febrero del 2000
        LocalDate fNacimiento = LocalDate.of(2000,2,3);
        LocalDateTime fActual = LocalDateTime.now();

        System.out.println("Edad: "+(fActual.getYear()-fNacimiento.getYear())+" Años "+(fActual.getMonthValue()-fNacimiento.getMonthValue())+" Meses "+(fActual.getDayOfMonth()-fNacimiento.getDayOfMonth())+" Días");
    }
}
