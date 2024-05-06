package C24B6;

public class Coche implements IVehiculo{

    @Override
    public void acelerar(int velocidad) {
        System.out.println("El coche tiene una velocidad de "+velocidad+"Km/h");
    }

    @Override
    public void frenar() {
        System.out.println("El coche freno");
    }
}
