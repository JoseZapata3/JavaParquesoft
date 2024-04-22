package C24B2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cúal es tu estudio mas reciente?");
        String estudio = sc.next();
        System.out.println("Wow, que interesante estudiar "+estudio);

        System.out.println("¿Cúal es tu número de telefono?");
        String teleffono = sc.next();
        System.out.println("Ok, te confirmo, tu número es "+teleffono);

        sc.close();

        Persona p = new Persona();
        //p.id = "10";

        Mouse mouse = new Mouse();

        //System.out.print(Integer.MAX_VALUE);
    }
}
