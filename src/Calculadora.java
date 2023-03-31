public class Calculadora {
    public double num1;
    public double num2;
    public char operacao;

    Calculadora(double num1, double num2, char operacao) {
        this.num1 = num1;
        this.num2 = num2;
        this.operacao = operacao;
    }

    double calcular() {
        double resultado = 0;
        switch (operacao) {
            case '+' -> resultado = num1 + num2;
            case '-' -> resultado = num1 - num2;
            case '*' -> resultado = num1 * num2;
            case '/' -> resultado = num1 / num2;
            default -> {
                System.out.println("operador não válido");
                System.exit(1);
            }
        }
        return resultado;
    }
}
