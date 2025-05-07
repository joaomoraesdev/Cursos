package list;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa> {
    private String nome;
    private int idade;
    private double altura;

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    @Override
    public int compareTo(Pessoa o) {
        int comparacao = Integer.compare(this.idade, o.getIdade());
        return comparacao;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return String.format("{ %s, %s, %s }", nome, idade, altura);
    }
}

class ComparatorPorAltura implements Comparator<Pessoa> {

    @Override
    public int compare(Pessoa o1, Pessoa o2) {
        int comparacao = Double.compare(o1.getAltura(), o2.getAltura());
        return comparacao;
    }

}
