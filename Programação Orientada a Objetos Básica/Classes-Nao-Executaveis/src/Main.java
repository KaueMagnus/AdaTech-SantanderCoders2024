import Animais.Cachorro;
import Animais.Gato;
import Animais.Passaro;
import Lojas.Petshop;

public class Main {
    public static void main(String[] args) {

        // Creating the objects
        Cachorro cachorro1 = new Cachorro("Puppy", "Marrom", 25, 7.8, 5, "nada");
        Gato gato1 = new Gato("Felix", "Preto", 4.6);
        Passaro passaro1 = new Passaro("PiuPiu", "Verde", 0.7);

        // Animals sounding methods
        cachorro1.soar();
        gato1.soar();
        passaro1.soar();
    }
}
