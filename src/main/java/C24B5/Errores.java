package C24B5;

public class Errores {
    public static void main(String[] args) {
        try {
//            double division = 0/0;
//            System.out.println(division);
            int numero = 0;
            if (numero == 0) {
                throw new RuntimeException("El valor es 0");
            }
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (NullPointerException e) {
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }finally {
            System.out.println("Continua el programa");
        }
    }

//    public static double dividir(int a, int b) {
//        return a / b;
//    }
}
