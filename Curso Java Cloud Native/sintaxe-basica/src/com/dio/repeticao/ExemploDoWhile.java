package com.dio.repeticao;

import java.util.Random;

public class ExemploDoWhile {
    public static void main(String[] args) {
        System.out.println("Discando...");
        do {
            System.out.println("Tocando...");
        }
        while(tocando()); //true = continua no laço - repita enquanto a condição for verdadeira
        System.out.println("Alo!!!");
    }

    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3) == 1;
        System.out.println("Atendeu? " + atendeu);
        return !atendeu;
    }
}
