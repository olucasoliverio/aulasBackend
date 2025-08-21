package aula_04;

public class EstruturasControle {

    public static void main(String[] args) {
        float media = 6;
        int faltas = 2;
        int numero = 7;

        if (media >= 6) {
            System.out.println("Aprovado!");
        }

        if (media >= 6 && faltas <= 20) {
            System.out.println("Aprovado!");
        }

        if (media <6 || faltas > 20) {
            System.out.println("Reprovado!");
        }

        if (media >= 6 && faltas <= 20) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }

        if (media <6 || faltas > 20) {
            System.out.println("Reprovado!");
        }

        String resultado = (numero %2 == 0) ? "Par" : "Ímpar";

        System.out.println("O número " + numero + " é " + resultado);
    }
}
