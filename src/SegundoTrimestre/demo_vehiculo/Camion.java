package SegundoTrimestre.demo_vehiculo;

public class Camion extends Vehiculo implements IRadio, IVehiculoMotor {

    public Camion(int nRuedas, int nAsientos) {
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
    public void arrancar() {
        IVehiculoMotor.super.arrancar();
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
