package com.dio.excecao;

public class ExemploExcecao {
    public static void main(String[] args) {
        try {
            double num = Double.parseDouble("a1.75");
            System.out.println(num);
        } catch (Exception e) {

        }
    }
}
