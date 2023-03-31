public class Main {
    public static void main(String[] args) {
        // Carro
        Carro carro = new Carro("Ford", "Mustang", 2012);
        carro.acelerar();
        carro.frear();

        // Retangulo
        Retangulo retangulo = new Retangulo(5, 5);
        retangulo.calcularArea();

        // ContaBancaria
        ContaBancaria conta1 = new ContaBancaria(212616, 1500, "João da Silva");
        ContaBancaria conta2 = new ContaBancaria(199386, 2700, "Gustavo Santos");

        conta1.sacar(250);
        conta1.depositar(250, conta1);
        System.out.printf("\nSaldo da Conta do %s antes da trnsferência: %.2f.\n", conta2.titular, conta2.saldo);
        conta1.transferir(375, conta1);
        System.out.printf("\nSaldo da Conta do %s após a transferência: %.2f.\n", conta2.titular, conta2.saldo);
        conta1.sacar(10000000);
        conta1.transferir(10000000, conta2);

        // Calculadora
        Calculadora calculadora = new Calculadora(5, 5, '-');
        double resultado = calculadora.calcular();
        System.out.printf("""
                \nResultado da operação:
                %.2f %c %.2f = %.2f
                """,
                calculadora.num1,
                calculadora.operacao,
                calculadora.num2,
                resultado);
    }
}