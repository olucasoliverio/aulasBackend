package aula_05.pratica2;

public class FuncionarioComum {
    protected String nome;
    protected double salario;

    public FuncionarioComum (String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    void calcularBonus(){
        System.out.println(nome + ": O bonus é de: " + this.salario*0.05);
    }
}
