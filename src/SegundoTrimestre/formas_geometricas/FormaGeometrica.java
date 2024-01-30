package SegundoTrimestre.formas_geometricas;

public abstract class FormaGeometrica {
    protected String tipo;
    public FormaGeometrica(String tipo) {
        this.tipo = tipo;
    }
    public abstract double calcularArea();

    public String mostrarDatos() {
        return "Forma geometrica: " + tipo + "\nArea: " + calcularArea();
    }
}

