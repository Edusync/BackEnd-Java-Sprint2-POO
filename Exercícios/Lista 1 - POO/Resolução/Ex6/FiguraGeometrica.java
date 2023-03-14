package Ex6;

public abstract class FiguraGeometrica {

    protected double lado;

    public FiguraGeometrica(double lado) {
        this.lado = lado;
    }

    public double calcularArea(){
        return this.lado * this.lado;
    }

    public double calcularPerimetro(){
        return this.lado * 4;
    }

}
