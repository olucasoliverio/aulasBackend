package aula_05.heranca_veiculo;

public class Carro extends Veiculo {
    private int portas;

    public Carro(String modelo, int ano, int portas) {
        super(modelo, ano);
        this.portas = portas;
    }

    public void abrirPortas(){
        System.out.println("Abrindo " + this.portas + " portas do carro " + modelo);
    }
}