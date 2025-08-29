package aula_05.pratica2;

public class Gerente extends FuncionarioComum {

    public Gerente (String nome, double salario) {
        super(nome, salario);
    }

    @Override
    void calcularBonus(){
        System.out.println(nome + ": O bonus é de: " + this.salario*0.2);
    }
}

