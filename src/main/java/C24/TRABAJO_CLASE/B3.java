package C24.TRABAJO_CLASE;

import java.util.Scanner;

public class B3 {
    public static void main(String [] args) {
        //Que número es mayor
        System.out.println("\n-----------------------------Ejercicios IF - ELSEIF - ELSE----------------------------\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = sc.nextInt();

        if( num1 > num2 ) {
            System.out.println(num1 + " es mayor que " + num2);
        }else if( num1 == num2 ){
            System.out.println( num1 + " es igual a " + num2 );
        }else{
            System.out.println( num2 + " es mayor que " + num1 );
        }

        //Pedir información estudiantes
        System.out.println("\n-----------------------------Ejercicios Arreglos-----------------------------\n");
        int[] edadesEstudiantes = new int[5];
        double promedio;
        System.out.println("Ingrese la edad del primer estudiante:");
        edadesEstudiantes[0] = sc.nextInt();
        System.out.println("Ingrese la edad del segundo estudiante:");
        edadesEstudiantes[1] = sc.nextInt();
        System.out.println("Ingrese la edad del tercer estudiante:");
        edadesEstudiantes[2] = sc.nextInt();
        System.out.println("Ingrese la edad del cuarto estudiante:");
        edadesEstudiantes[3] = sc.nextInt();
        System.out.println("Ingrese la edad del quinto estudiante:");
        edadesEstudiantes[4] = sc.nextInt();

        promedio = (edadesEstudiantes[0]+edadesEstudiantes[1]+edadesEstudiantes[2]+edadesEstudiantes[3]+edadesEstudiantes[4])/edadesEstudiantes.length;
        System.out.println("El promedio de edades es de: " + promedio);
    }
}
