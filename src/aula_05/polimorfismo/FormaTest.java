package aula_05.polimorfismo;

public class FormaTest {
    public static void main(String[] args) {
        Forma forma =  new Forma();
        Circulo circulo = new Circulo();
        Quadrado quadrado = new Quadrado();

        forma.desenhar();
        circulo.desenhar();
        quadrado.desenhar();
    }
}
