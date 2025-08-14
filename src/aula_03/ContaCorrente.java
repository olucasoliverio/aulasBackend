package aula_03;

public class ContaCorrente {
    private String titular;
    private int numeroConta;
    private double saldo = 0;
    private double limite = 0;

    public ContaCorrente(String titular, int numeroConta){
        this.titular = titular;
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void mostrarInfo(){
        System.out.println("Titular: " + getTitular());
        System.out.println("Número Conta: " + getNumeroConta());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Limite: " + getLimite());
    }

    public void emitirSaldo(){
        System.out.println("Saldo: " + getSaldo());
    }

    public void sacar(double valor){
        if (valor < 0){
            System.out.println("Valor inválido");
        return;
        }
        if (valor > saldo + limite) {
            System.out.println("Saldo insuficiente");
        } else {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + "realizado com sucesso");
            emitirSaldo();
        }

    }

    public void depositar(double valor){
        if (valor < 0) {
            System.out.println("Valor inválido");
            return;
        }

        saldo += valor;
        System.out.println("Depósito de R$ " + valor + "realizado com sucesso");
        emitirSaldo();
    }
}
