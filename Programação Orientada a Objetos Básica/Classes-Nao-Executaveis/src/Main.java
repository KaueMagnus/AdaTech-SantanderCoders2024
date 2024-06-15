import Animais.Cachorro;

public class Main {
    public static void main(String[] args) {


        Cachorro cachorro1 = new Cachorro("Puppy", "Marrom", 25, 7.8, 5, "nada");

        System.out.println(cachorro1.getNumeroDeCachorros());


        Cachorro cachorro2 = new Cachorro("Rex", "Marrom", 25, 7.8, 5, "nada");
        System.out.println(cachorro2.getNumeroDeCachorros());
        System.out.println(cachorro1.getNumeroDeCachorros());


    }
}
