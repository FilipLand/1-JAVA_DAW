package SegundoTrimestre.formas_geometricas;

public abstract class FiguraAbstracta {
        private final String nombre;

        public FiguraAbstracta(String nombreFigura) {
            this.nombre = nombreFigura;
        }

        abstract public double area();

        final public boolean mayorQue(FiguraAbstracta otra) {
            return this.area() > otra.area();
        }

    public abstract double calcularArea();

    public String toString() {
            return this.nombre + " con area " + this.area();
        }
}
