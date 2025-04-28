package interfaces.equipamentos.multifuncional;

import interfaces.equipamentos.copiadora.Copiadora;
import interfaces.equipamentos.digitalizadora.Digitalizadora;
import interfaces.equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {

    // A ideia aqui é usar a implementação para fazer com que uma classe herde métodos de diversas classes
    // A extensão permite apenas uma classe por herança (public abstract, na classe pai) - já o implements permite vários, colocando a classe pai como interface

    @Override
    public void imprimir() {
        System.out.println("Imprimindo no equip multifuncional");
    }

    @Override
    public void digitalizar() {
        System.out.println("Digitalizando no equip multifuncional");
    }

    @Override
    public void copiando() {
        System.out.println("Copiando no equip multifuncional");
    }
}
