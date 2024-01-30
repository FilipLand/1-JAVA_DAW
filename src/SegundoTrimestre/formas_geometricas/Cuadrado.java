package SegundoTrimestre.formas_geometricas;

public class Cuadrado extends FormaGeometrica {
    private double lado;

    public Cuadrado(String tipo, double lado) {
        super(tipo);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return Math.pow(lado, 2);
    }
}

