package SegundoTrimestre.demo_vehiculo;
public interface IVehiculoMotor extends Intermitente, ICambioMarcha, IMotor {
    public default void acelerar(){
        //implementamos acelerar dessactivo freno de mano
    }


}

