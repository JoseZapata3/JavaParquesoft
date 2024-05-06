package C24.TRABAJO_CLASE;

import java.util.Scanner;

public class B2 {
    public static void main(String[] args) {
        //EJERCICIO 1
        System.out.println("\n-----------------------------Ejercicios Scanner-----------------------------\n");
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cúal es tu estudio mas reciente?");
        String estudio = sc.next();
        System.out.println("Wow, que interesante estudiar "+estudio);

        System.out.println("¿Cúal es tu número de telefono?");
        String teleffono = sc.next();
        System.out.println("Ok, te confirmo, tu número es "+teleffono);

        sc.close();

        //PRIMER OBJETO PROPIO - PRIMER OBJETO QUE VI EN MI ESCRITORIO
        System.out.println("\n-----------------------------Actividad crear una clase y a partir de ella un Objeto-----------------------------\n");
        Mouse mouse = new Mouse();
    }
}
