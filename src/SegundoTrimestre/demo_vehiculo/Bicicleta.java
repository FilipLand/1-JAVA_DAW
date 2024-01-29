package SegundoTrimestre.demo_vehiculo;

public class Bicicleta extends Vehiculo implements ICambioMarcha {
    public Bicicleta(int nRuedas, int nAsientos) {
        super(nRuedas, nAsientos);
    }

    @Override
    public void cambiarMarcha(int marcha) {

    }

    @Override
    public void cambiarMarcha() {
    }
}


