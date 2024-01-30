package SegundoTrimestre.formas_geometricas;
public class Triangulo extends FiguraAbstracta {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        super("Triángulo");
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
    @Override
    public String toString() {
        return "Triangulo{" +
                "base=" + base +
                ", altura=" + altura +
                ", area=" + area() +
                '}';
    }
}

