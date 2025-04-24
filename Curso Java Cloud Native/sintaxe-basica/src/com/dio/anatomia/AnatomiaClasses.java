package com.dio.anatomia;

public class AnatomiaClasses {
    public static void main (String[] args) {
        String GT = "Gotham"; //indica que a variavel é const = final (boa prática é ser maiúsculo mesmo)
        String n1 = "nota";
        String _PAIS_EUA = "EUA";
        String $teste = "teste";
        String primeiroNome = "Bruce";
        String ultimoNome = "Wayne";
        System.out.println(_PAIS_EUA + " - " + GT);
        System.out.println(nomeCompleto(primeiroNome, ultimoNome));
    }

    public static String nomeCompleto(String primeiroNome, String ultimoNome) {
        return "Nome Completo: " + primeiroNome.concat(" " + ultimoNome);
    }
}
