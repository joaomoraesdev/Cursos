package com.dio.operadores;
public class Operadores {
    public static void main(String[] args) {
        double soma = 10.5 + 15.7;
        int subtracao = 113 - 13;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        //double resultado = (10 * 7) + (20/4);
        //System.out.println(resultado);

        int a, b;
        a = 5;
        b = 6;
        
        String resultado = a == b ? "True" : "False";
        System.out.println(resultado);

        boolean x = a == b;
        System.out.println(x); 
    }
}
