package com.dio.terminal;

public class MinhaClasse {
    public static void main(String[] args) {
        String nome = args[0];
        String sobrenome = args[1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);

        System.out.println(String.format("Oi, meu nome é %s %s!", nome, sobrenome));
        System.out.println(String.format("Tenho %s anos e meço %sm", idade, altura));
    }   
}
