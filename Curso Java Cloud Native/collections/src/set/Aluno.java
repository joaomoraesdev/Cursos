package set;

import java.util.Comparator;

public class Aluno implements Comparable<Aluno> {
    private String nome;
    private long matricula;
    private boolean ativo;

    public Aluno(String nome, long matricula, boolean ativo) {
        this.nome = nome;
        this.matricula = matricula;
        this.ativo = ativo;
    }

    public String getNome() {
        return nome;
    }

    public long getMatricula() {
        return matricula;
    }

    public boolean isAtivo() {
        return ativo;
    }

    @Override
    public int compareTo(Aluno o) {
        return Long.compare(this.matricula, o.matricula);
    }

    @Override
    public String toString() {
        return String.format("{ %s, %s, %s }", nome, matricula, ativo);
    }
}

class ComparatorPorStatus implements Comparator<Aluno> {

    @Override
    public int compare(Aluno o1, Aluno o2) {
        return Boolean.compare(o1.isAtivo(), o2.isAtivo());
    }

}
