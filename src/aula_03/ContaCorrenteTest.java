package aula_03;

public class ContaCorrenteTest {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente("Rodrigo", 1);
        conta1.mostrarInfo();

        conta1.depositar(1000);
        conta1.sacar(300);
    }
}
