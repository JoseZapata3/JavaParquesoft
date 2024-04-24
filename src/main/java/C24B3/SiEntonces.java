package C24B3;

import java.util.Scanner;

public class SiEntonces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad = sc.nextInt();

        if ( edad > 18 ) {
            if( edad < 120 ){
                System.out.println("Está vivo.");
            }else{
                System.out.println("No es humano.");
            }
        }else if( edad< 0){
            System.out.println("Este no nacio.");
        }
        else {
            System.out.println("Es menor de 18.");
        }

        //Switch
        int dia = sc.nextInt();

        switch ( dia ){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Número no valido");
                break;
        }
    }
}
