package aula_05.heranca_veiculo;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Civic",2000,4);
        Moto moto = new Moto("CG 125", 2000, true);

        carro.ligar();
        moto.empinar();
        carro.abrirPortas();

    }
}
