package edu.joao.primeirasemana;

public class BoletimEscolar {
    public static void main (String[] args) {
        Double nota = 6.0;
        if(nota > 6)
            System.out.println("PASSOU!");
        else if (nota == 6)
            System.out.println("PROVA DE MINERVA");
        else
            System.out.println("REPROVOU");
    }
}
