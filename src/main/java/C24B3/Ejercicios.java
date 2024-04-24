package C24B3;

import java.util.Scanner;

public class Ejercicios {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = sc.nextInt();

        if( num1 > num2 ) {
            System.out.println(num1 + " es mayor que" + num2);
        }else if( num1 == num2 ){
            System.out.println( num1 + "es igaul " + num2 );
        }else{
            System.out.println( num2 + " es mayor que" + num1 );
        }
    }
}
