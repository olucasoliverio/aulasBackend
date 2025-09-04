package aula_06.pratica1;

public class FuncionarioPJ extends Funcionario {

    public FuncionarioPJ(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalarioFinal() {
        final double salarioFinal = this.salarioBase*1.2;
        System.out.println(nome + ": O salário com bonus é de: " + salarioFinal);
        return salarioFinal;
    }
}
