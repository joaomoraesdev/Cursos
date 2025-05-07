package map;

import java.time.LocalDate;
import java.util.*;

public class Agencia {
    private Map<LocalDate, Evento> eventoMap;

    public Agencia() {
        this.eventoMap = new HashMap<>();
    }
    
    public static void main(String[] args) {
        Agencia agenda = new Agencia();
        agenda.adicionarEvento(LocalDate.of(2025, 12, 25), new Evento("Natal", 200));
        agenda.adicionarEvento(LocalDate.of(2025, 9, 13), new Evento("Aniversário", 50));
        agenda.adicionarEvento(LocalDate.of(2025, 12, 19), new Evento("Formatura", 200));

        agenda.listarEventoPorQtdPessoas();
    }

    public void adicionarEvento(LocalDate data, Evento evento) {
        eventoMap.put(data, new Evento(evento.getNome(), evento.getQtdPessoas()));
    }

    // Não precisa do Comparable/Comprator - o TreeMap já tem isso baseado no Key do Map
    public void listarEventoPorQtdPessoas() {
        Map<LocalDate, Evento> eventoPorQtdPessoasMap = new TreeMap<>(eventoMap);
        System.out.println(eventoPorQtdPessoasMap);
    }
}
