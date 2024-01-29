package SegundoTrimestre.demo_vehiculo;

public class Moto extends Vehiculo implements IVehiculoMotor {
    public Moto(int nRuedas, int nAsientos) {
        super(nRuedas, nAsientos);
    }

    @Override
    public void cambiarMarcha(int marcha) {

    }

    @Override
    public void cambiarMarcha() {

    }

    @Override
    public float getMaxVel() {
        return 0;
    }

    @Override
    public void detener() {

    }

    @Override
    public void encenderDerecha() {

    }

    @Override
    public void encenderIzquierda() {

    }

    @Override
    public void encederTodos() {

    }

    @Override
    public void avagar() {

    }
}
