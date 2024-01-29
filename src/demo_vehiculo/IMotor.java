package demo_vehiculo;
    public interface IMotor {

        public static boolean esMasRapido(IMotor vehiculoMotor, IMotor vehiculoMotor2) {
            if (vehiculoMotor.getMaxVel() > vehiculoMotor2.getMaxVel()) {
                return Boolean.TRUE;
            } else {
                return Boolean.FALSE;
            }
        }

        float getMaxVel();

        public default void arrancar(){

        }

        void detener();

    }

