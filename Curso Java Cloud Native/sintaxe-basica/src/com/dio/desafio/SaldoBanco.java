package com.dio.desafio;

import java.util.Scanner;

public class SaldoBanco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
          // Entrada do saldo inicial
          double saldoInicial = Double.parseDouble(scanner.nextLine());
          String[] depositos = scanner.nextLine().split(" ");
          //double deposito2 = Double.parseDouble(scanner.nextLine());
          //double deposito3 = Double.parseDouble(scanner.nextLine());
          double saldoFinal = saldoInicial + Double.parseDouble(depositos[0]) + Double.parseDouble(depositos[1]) + Double.parseDouble(depositos[2]);
          // Saldo final
          System.out.printf("%.2f\n", saldoFinal);
        } catch (Exception e) {
          System.out.println("Insira apenas numeros!");
        } finally {
          scanner.close();
        }
    }
}
