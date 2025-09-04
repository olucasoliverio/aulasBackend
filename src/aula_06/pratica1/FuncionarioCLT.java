package aula_06.pratica1;

public class FuncionarioCLT extends Funcionario {

    public FuncionarioCLT(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalarioFinal() {
        final double salarioFinal = this.salarioBase*0.9;
        System.out.println(nome + ": O salário com desconto é de: " + salarioFinal);
        return salarioFinal;
    }
}

