package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    private List<Pessoa> pessoasList;

    public OrdenacaoPessoa() {
        this.pessoasList = new ArrayList<>();
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacao = new OrdenacaoPessoa();
        ordenacao.adicionarPessoa("Nome 1", 21, 1.70);
        ordenacao.adicionarPessoa("Nome 2", 55, 1.50);
        ordenacao.adicionarPessoa("Nome 3", 19, 1.80);

        System.out.println(ordenacao.ordenarPorIdade());
        System.out.println(ordenacao.pessoasList.get(0).getNome().toLowerCase().contains("f"));
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoasList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoasList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoasList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }
}
