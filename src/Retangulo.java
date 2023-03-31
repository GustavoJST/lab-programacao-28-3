public class Retangulo {
    public double base;
    public double altura;

    Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    double calcularArea() {
        return base * altura;
    }
}
