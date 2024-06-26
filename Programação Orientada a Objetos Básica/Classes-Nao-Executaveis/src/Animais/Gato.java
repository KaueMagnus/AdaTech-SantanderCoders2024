package Animais;

public class Gato extends Animal {

    // Attributes
    static int numeroDeGatos;

    // Constructor
    public Gato(String nome, String cor, double peso) {
        super(nome, cor, peso);
    }

    // Methods
    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                '}';
    }

    @Override
    public void soar() {
        System.out.println("MIAU MIAU");
    }
}
