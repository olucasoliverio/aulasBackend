package aula_03;

public class Conversor {

    public void converter(double celsius) {
        double fahrenheit = (celsius * 9.0 / 5.0) + 32;
        System.out.println("O resultado é: " + fahrenheit + " graus Fahrenheit");
    }

    public void converter(int horas, int minutos) {
        int totalMinutos = (horas * 60) + minutos;
        System.out.println("O resultado é de: " + totalMinutos + " minutos");
    }
}
