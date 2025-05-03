package list;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String tarefa) {
        
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : tarefaList) {
            if (t.getDescricao().equals(tarefa)) {
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    public void obterDescricoesTarefas() {
        for (Tarefa t : tarefaList) {
            System.out.println(t.getDescricao());
        }
    }

    public static void main(String[] args) {
        ListaTarefa lista = new ListaTarefa();

        lista.adicionarTarefa("Estudar Java");
        lista.adicionarTarefa("Fazer exercícios de programação");

        lista.obterDescricoesTarefas(); // Exibe as tarefas
        System.out.println(lista.obterNumeroTotalTarefas()); // Exibe o número total de tarefa)
    }
}