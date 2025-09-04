package aula_06.pratica1;

public class AppEmpresa {
    public static void main(String[] args) {
        FuncionarioCLT funcionarioCLT = new FuncionarioCLT("Luiz", 1200);
        FuncionarioPJ funcionarioPJ = new FuncionarioPJ("Gaspar", 3000);

        funcionarioCLT.calcularSalarioFinal();
        funcionarioPJ.calcularSalarioFinal();
    }

}
