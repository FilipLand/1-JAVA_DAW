package SegundoTrimestre.demo_vehiculo;

public class Coche extends Vehiculo implements IRadio, IVehiculoMotor {

    public Coche(int nRuedas, int nAsientos) {
        super(nRuedas, nAsientos);
    }

    @Override
    public float getMaxVel() {
        return 0;
    }

    @Override
    public void arrancar() {

    }

    @Override
    public void detener() {

    }

    @Override
    public void startRadio() {

    }

    @Override
    public void stopRadio() {

    }

    @Override
    public void activarAntena() {

    }

    @Override
    public void cambiarMarcha(int marcha) {

    }

    @Override
    public void cambiarMarcha() {

    }

    @Override
    public void acelerar() {
        IVehiculoMotor.super.acelerar();
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
