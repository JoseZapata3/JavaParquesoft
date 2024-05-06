package C24B4;

import java.util.Arrays;

public class Ciclos {

    public static void main(String[] args){

        int contador = 0;

        while (contador < 5){
            System.out.println("Contador: "+contador);
            contador++;
        }

        do {
            System.out.println("Contador: "+contador);
            contador++;
        }while (contador <5 );

        String[] miArreglo = {"Hola ","mundo","!"};
        for (int i = 0; i < miArreglo.length; i++){
            System.out.print(miArreglo[i]);
        }
        System.out.println("\n");

        //Programación funcional
//        Arrays.stream(miArreglo).forEach(System.out::println);
//        Arrays.stream(miArreglo).map(String::toUpperCase).forEach(System.out::println);
    }
}
