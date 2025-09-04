package aula_06.pratica3exemplo;

import java.util.HashMap;

public class ExemploHashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> estoque = new HashMap<>();

        estoque.put("Maça", 50);
        estoque.put("Banana", 30);
        estoque.put("Laranja", 20);

        System.out.println("Estoque inicial: " + estoque);

        System.out.println("Quantidade de Maçãs: " + estoque.get("Maçã"));

        estoque.put("Banana", 45);
        System.out.println("Após atualizar Bananas: " + estoque);

        estoque.remove("Laranja");
        System.out.println("Após remover Laranjas: " + estoque);

        if (estoque.containsKey("Maçã")){
            System.out.println("Tem maçãs no estoque!");
        }

        System.out.println("Estoque Final");
        for ( String fruta : estoque.keySet()){
            System.out.println(fruta + estoque.get(fruta));
        }
    }
}
