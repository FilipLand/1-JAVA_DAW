package demo_vehiculo;

public class Starter implements  {
    public void startEngine(VehiculoMotor vehiculoMotor) {
        vehiculoMotor.arrancar();
        Starter starter = new Starter();
        starter.startEngine();
    }
}
