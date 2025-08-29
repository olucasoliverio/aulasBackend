package aula_05.pratica2;

public class Main {
    public static void main(String[] args) {
        FuncionarioComum funcionarioComum = new FuncionarioComum("Dias", 15000);
        Gerente gerente = new Gerente("André", 20000);
        Vendedor vendedor = new Vendedor("João", 1000);

        vendedor.calcularBonus();
        gerente.calcularBonus();
        funcionarioComum.calcularBonus();
    }

}
