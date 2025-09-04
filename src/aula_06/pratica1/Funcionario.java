package aula_06.pratica1;

public abstract class Funcionario {
    public String nome;
    public double salarioBase;


    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    };

    void exibirDados(){
        System.out.println("O nome do Funcionário é " + nome + " e o salário base é " + salarioBase);
    }

    public abstract double calcularSalarioFinal();
}
