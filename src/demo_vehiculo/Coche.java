package demo_vehiculo;

public class Coche extends Vehiculo implements IRadio, VehiculoMotor{

    public Coche(int nRuedas, int nAsientos, boolean tieneGps) {
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
}
