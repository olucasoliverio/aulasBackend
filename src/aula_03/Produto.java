package aula_03;

public class Produto {
    String nome;
    float preco;
    int quantidade;

    public Produto() {
        this.nome = "Desconhecido";
        this.preco = 0;
        this.quantidade = 0;
    }

    public Produto(String nome, float preco) {
        this.nome = nome;
        this.preco = 0;
        this.quantidade = 0;
    }

    public Produto(String nome, float preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Preco: " + preco);
        System.out.println("Quantidade " + quantidade);
    }
}