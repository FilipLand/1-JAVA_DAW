package SegundoTrimestre.demo_vehiculo;

public class Starter implements  {
    public void startEngine(IVehiculoMotor IVehiculoMotor) {
        IVehiculoMotor.arrancar();
        Starter starter = new Starter();
        starter.startEngine();
    }
}
