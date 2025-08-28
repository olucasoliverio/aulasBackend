package aula_05.pratica;

public class Motor {
    private int potencia;
    private String tipo;

    public Motor (int potencia, String tipo){
        this.potencia = potencia;
        this.tipo = tipo;
    }

    public void ligar(){
        System.out.println("O motor está ligado");
    }

    public void desligar(){
        System.out.println("O motor está desligado");
    }

}
