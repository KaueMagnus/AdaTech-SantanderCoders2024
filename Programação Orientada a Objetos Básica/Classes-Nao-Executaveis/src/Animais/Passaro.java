package Animais;

public class Passaro extends Animal {

    // Attributes
    static int numeroDePassaros;

    // Constructor
    public Passaro(String nome, String cor, double peso) {
        super(nome, cor, peso);
    }

    // Methods
    @Override
    public void soar() {
        System.out.println("PIU PIU");
    }
}
