package contador;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Parâmetro 1: ");
            int p1 = Integer.parseInt(scanner.nextLine());

            System.out.print("Parâmetro 2: ");
            int p2 = Integer.parseInt(scanner.nextLine());

            contar(p1, p2);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    static void contar(int p1, int p2) throws ParametrosInvalidosException {
        if(p1 > p2)
            throw new ParametrosInvalidosException();

        int contador = p2 - p1;

        for(int i = 0; i < contador; i++) {
            System.out.println("Imprimindo o número " + (i+1));
        }
    }
}