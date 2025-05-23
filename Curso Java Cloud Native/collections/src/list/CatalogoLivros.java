package list;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livrosList;

    public CatalogoLivros() {
        this.livrosList = new ArrayList<>();
    }

    public static void main(String[] args) {
        CatalogoLivros catalogo = new CatalogoLivros();
        catalogo.adicionarLivro("1984", "George Orwell", 1984);
        catalogo.adicionarLivro("12 Regra Para a Vida", "Jordan Peterson", 2010);

        System.out.println(catalogo.pesquisarPorAutor("George Orwell"));
        System.out.println(catalogo.pesquisarPorIntervaloAnos(1900, 2025));
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livrosList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livrosList.isEmpty()) {
            for (Livro l : livrosList) {
                if (l.getAutor().equalsIgnoreCase(autor))
                    livrosPorAutor.add(l);
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!livrosList.isEmpty()) {
            for (Livro l : livrosList) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal)
                    livrosPorIntervaloAnos.add(l);
            }
        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!livrosList.isEmpty()) {
            for (Livro l : livrosList) {
                if (l.getTitulo().equalsIgnoreCase(titulo))
                    livroPorTitulo = l;
                    break;
            }
        }
        return livroPorTitulo;
    }
}
