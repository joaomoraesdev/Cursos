package com.dio.repeticao;

public class ExemploForArray {
    public static void main(String[] args) {
        String[] alunos = { "felipe", "jonas", "thiago", "joão" };
        for (int i = 0; i < alunos.length; i++) {
            System.out.println("Aluno " + alunos[i]);
        }

        //foreach em JAVA
        for (String aluno : alunos) {
            System.out.println("Aluno " + aluno);
        }
    }
}
