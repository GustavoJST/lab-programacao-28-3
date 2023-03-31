public class ContaBancaria {
    public int numeroDaConta;
    public double saldo;
    public String titular;

    ContaBancaria(int numeroDaConta, double saldo, String titular) {
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
        this.titular = titular;
    }
    public void sacar(double quantidade) {
        if (this.saldo >= quantidade) {
            System.out.printf("\nSaque de %.2f efetuado com sucesso. Seu saldo atual é de %.2f.\n", quantidade, this.saldo);
        }
        else {
            System.out.printf("\nSaldo insuficiente para efetuar o saque. Seu saldo atualmente é de %.2f.\n", this.saldo);
        }
    }

    public void depositar(double quantidade, ContaBancaria conta) {
        if (this.saldo >= quantidade) {
            System.out.printf("\nDepósito de %.2f para a conta de número %d, titular %s, realizada com sucesso. " +
                            "Seu saldo atual é de %.2f.\n",
                    quantidade, conta.numeroDaConta, conta.titular, this.saldo);
        }
        else {
            System.out.printf("\nSaldo insuficiente para o depósito, seu saldo atualmente é de %.2f.\n", this.saldo);
        }
    }

    public void transferir(double quantidade, ContaBancaria conta) {
        if (this.saldo >= quantidade) {
            System.out.printf("\nTransferência de %.2f para a conta de número %d, titular %s, realizada com sucesso. " +
                            "Seu saldo atual é de %.2f.\n",
                    quantidade, conta.numeroDaConta, conta.titular, this.saldo);
        }
        else {
            System.out.printf("\nSaldo insuficiente para a transferência, seu saldo atualmente é de %.2f.\n", this.saldo);
        }
    }
}
