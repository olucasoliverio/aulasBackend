package aula_04;

import java.util.Arrays;

public class VetorOrdenado {
    private int[] vetor;
    private int tamanho;

    public VetorOrdenado(int capacidade) {
        vetor = new int [capacidade];
        tamanho = 0;
    }

    public void inserir(int valor) {
        if (tamanho == vetor.length) {
            System.out.println("Vetor cheio, não é possível inserir");
            return;
        }

    int i;
    for (i = tamanho - 1; i >= 0 && vetor [i] > valor; i--) {
        vetor [i+1] = vetor [1];
    }
    vetor[i+1] = valor;
    tamanho++;
    }
    public int buscar(int valor) {
        int inicio = 0;
        int fim = tamanho - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            if (vetor[meio] == valor) {
                return meio;
            } else if (vetor[meio] < valor) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
    return -1;
    }
    public void exibir() {
        System.out.println(Arrays.toString(Arrays.copyOf(vetor, tamanho)));
    }

    public static void main(String[] args) {
        VetorOrdenado vo = new VetorOrdenado(10);

        vo.inserir(30);
        vo.inserir(10);
        vo.inserir(20);
        vo.inserir(40);

        vo.exibir();

        System.out.println("Buscar 20: " + vo.buscar(20));
        System.out.println("Buscar 50: " + vo.buscar(50));
    }
}
