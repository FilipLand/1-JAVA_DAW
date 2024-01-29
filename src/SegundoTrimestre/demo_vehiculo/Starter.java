package SegundoTrimestre.demo_vehiculo;

public class Starter implements  {
    public static void startEngine(IVehiculoMotor IVehiculoMotor) {
        IVehiculoMotor.arrancar();
        Starter starter = new Starter();
        startEngine();
    }
}
