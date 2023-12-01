package exercicios_Basico_de_Orientacao_a_Objetos_em_Java;

// Crie uma classe 'ContaBancaria' com atributos como saldo e número da conta. Adicione métodos para depositar, sacar e exibir o saldo.

public class Ex04_ContaBancaria {
    private String numeroConta;
    private double saldo;

    public Ex04_ContaBancaria(String numeroConta, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido para saque.");
        }
    }

    public void exibirSaldo() {
        System.out.println("Saldo da conta " + numeroConta + ": R$" + saldo);
    }

    public static void main(String[] args) {
        Ex04_ContaBancaria minhaConta = new Ex04_ContaBancaria("123456", 1000.0);
        minhaConta.exibirSaldo();
        minhaConta.depositar(500.0);
        minhaConta.exibirSaldo();
        minhaConta.sacar(200.0);
        minhaConta.exibirSaldo();
    }
}
