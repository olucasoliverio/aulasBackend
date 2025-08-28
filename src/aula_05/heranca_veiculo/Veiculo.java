package aula_05.heranca_veiculo;

public class Veiculo {
    protected String modelo;
    protected int ano;

    public Veiculo(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    public void ligar() {
        System.out.println("O veiculo" + modelo + " está ligado.");
    }
}
