package Lojas;

import Animais.Animal;
import Animais.Cachorro;

public class Petshop {

    // Petshop Methods
    public void darBanho(Animal animal){
        animal.setEstadoDeEspirito("Limpo");
    }

    public void tosar(Cachorro cachorro) {
        cachorro.setEstadoDeEspirito("Tosado");
    }

    public void deixarNoHotel(Animal animal) {
        animal.setEstadoDeEspirito("Com saudades");
    }

}
