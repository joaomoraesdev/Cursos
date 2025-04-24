package com.dio.excecao;

import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        try {
            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Altura: ");
            double altura = Double.parseDouble(scanner.nextLine());
        } catch (Exception e) {
            System.err.println("Digite corretamente!");
        }

    }
}
