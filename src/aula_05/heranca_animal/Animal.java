package aula_05.heranca_animal;

public class Animal {
    protected String nome;

    public Animal (String nome) {
        this.nome = nome;
    }

    class Gato extends Animal {
        public Gato (String nome) {
            super(nome);
        }
    }

    public void mostrarNome(){
        System.out.println("O nome do gato é " + nome);
    }

    public class GatoTest {
        public void main(String[] args) {
            Gato gato = new Gato("Garfield");
            gato.mostrarNome();
        }
    }
}
