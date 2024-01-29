package demo_vehiculo;
public class VehiculoMotor extends Vehiculo implements Intermitente, CabioMarcha, IMotor  {
    public VehiculoMotor(int nRuedas, int nAsientos) {
        super(nRuedas, nAsientos);
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

    }

    @Override
    public void detener() {

    }
}

