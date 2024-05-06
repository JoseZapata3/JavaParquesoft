package C24B4;

public class Funciones {
    //Nota: Los elementos estaticos estan enlazados directametne a la clase, mas no al objeto
    public static void main(String[] args) {
        Funciones misF = new Funciones();
        System.out.println(misF.sumar(2,3));
    }

    private int sumar(int num1, int num2) {
        return num1 + num2;
    }

    private int resta(int num1, int num2) {
        return num1 - num2;
    }
}
