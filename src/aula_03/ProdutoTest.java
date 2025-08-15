package aula_03;

public class ProdutoTest {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        Produto produto2 = new Produto("Coca-Cola 2l", 10.90f);
        Produto produto3 = new Produto("Mouse", 100, 20);

        produto1.exibirInfo();
        System.out.println("____________________________");
        produto2.exibirInfo();
        System.out.println("____________________________");
        produto3.exibirInfo();
    }
}
