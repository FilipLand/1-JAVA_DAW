package SegundoTrimestre.demo_vehiculo;

public class Starter implements  {
    public static void startEngine(@org.jetbrains.annotations.NotNull IVehiculoMotor IVehiculoMotor) {
        IVehiculoMotor.arrancar();
        Starter starter = new Starter();
        startEngine();
    }
}
