package SegundoTrimestre.demo_vehiculo;
public class Main {
        public static void main(String[] args) {
            Coche mio = new Coche(4, 5);

            Starter.startEngine(mio);

            Camion camion = new Camion(4,6);

            camion.acelerar();
            mio.acelerar();
            /* No se si esta bien ni que estoy haciendo  */

        }
    }

