package aula_05.pratica;

public class Carro {
    private String modelo;
    private Motor motor;

    public Carro (String modelo, Motor motor) {
        this.modelo = modelo;
        this.motor = motor;
    }

    public void ligarCarro(){
        this.motor.ligar();
        System.out.println("Ligando o carro " + this.modelo);
    }

    public void desligarrCarro(){
        this.motor.desligar();
        System.out.println("Desligando o carro " + this.modelo);
    }
}
