package com.dio.desafio;

import java.util.Scanner;

public class ClassificadorSaldo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            double saldo = Double.parseDouble(scanner.nextLine());
            if(saldo < 0)
                System.out.println("Negativado");
            else if (saldo >= 0 && saldo <= 500)
                System.out.println("Baixo");
            else
                System.out.println("Confortável");
        } catch (Exception e) {
            System.out.println("Insira apenas numeros!");
        } finally {
            scanner.close();
        }
    }
}
