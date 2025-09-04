package aula_06.pratica3exemplo;

import java.util.ArrayList;

public class ExemploArrayList {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Ana");
        nomes.add("Carlos");
        nomes.add("Maria");


        System.out.println("Lista de nome: " + nomes);

        nomes.remove("Carlos");
        System.out.println("Após remover Carlos: " + nomes);

        if (nomes.contains("Maria")) {
            System.out.println("A lista contem Maria!");
        }
    }
}
