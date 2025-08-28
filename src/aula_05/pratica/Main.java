package aula_05.pratica;

public class Main {
    public static void main(String[] args) {
        Motor motor = new Motor(1, "Gasolina");
        Carro carro = new Carro("Civic", motor);

        carro.ligarCarro();
        carro.desligarrCarro();
    }
}
