package set;

import java.util.*;

public class Escola {
    private Set<Aluno> setAlunos;

    public Escola() {
        this.setAlunos = new TreeSet<>();
    }

    public static void main(String[] args) {
        Escola escola = new Escola();
        escola.adicionarAluno("Thiaguinho", 13, false);
        escola.adicionarAluno("R9", 9, true);
        escola.adicionarAluno("Ferrugem", 1, false);

        System.out.println(escola.listarAlunosPorMatricula());
        System.out.println(escola.listarAlunosPorStatus());
        System.out.println(new TreeSet<>(Arrays.asList("verde", "amarelo", "azul", "branco")));
    }

    public void adicionarAluno(String nome, long matricula, boolean ativo) {
        setAlunos.add(new Aluno(nome, matricula, ativo));
    }

    public Set<Aluno> listarAlunosPorMatricula() {
        Set<Aluno> setAlunosPorMatricula = new TreeSet<>(setAlunos);
        return setAlunosPorMatricula;
    }

    public Set<Aluno> listarAlunosPorStatus() {
        Set<Aluno> setAlunosPorStatus = new TreeSet<>(new ComparatorPorStatus());
        setAlunosPorStatus.addAll(setAlunos);
        return setAlunosPorStatus;
    }
}
