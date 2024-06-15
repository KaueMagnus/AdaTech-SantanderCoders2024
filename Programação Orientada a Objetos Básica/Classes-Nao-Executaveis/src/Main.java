import Animais.Cachorro;

public class Main {
    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro();

        cachorro1.nome = "Puppy";
        cachorro1.cor = "Marrom";
        cachorro1.altura = 50;
        cachorro1.peso = 7.8;
        cachorro1.tamanhoDoRabo = 5;

        cachorro1.latir();
        System.out.println(cachorro1.pegar());

        System.out.println("O cachorro está " + cachorro1.interagir("vai dormir!"));

    }
}
