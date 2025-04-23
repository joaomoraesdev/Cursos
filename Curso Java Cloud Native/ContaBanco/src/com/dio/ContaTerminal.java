package com.dio;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {      
        Conta conta = new Conta();
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("=== BANCO DIO ===");
        System.out.println("Crie sua conta conosco!");

        System.out.print("Número: ");
        conta.numero = Integer.parseInt(scanner.nextLine());

        System.out.print("Agência: ");
        conta.agencia = scanner.nextLine();

        System.out.print("Nome: ");
        conta.nomeCliente = scanner.nextLine();

        do {
            System.out.print("Deseja fazer seu primeiro depósito (s/n): ");
            conta.primeiroDeposito = scanner.nextLine().toLowerCase().charAt(0);
        } while(conta.primeiroDeposito != 's' && conta.primeiroDeposito != 'n');
        
        if(conta.primeiroDeposito == 's') {
            System.out.print("Depósito: R$");
            conta.saldo = Double.parseDouble(scanner.nextLine());
        }
        else
            conta.saldo = 0.0;

        System.out.println(conta.toString());
    }
}
