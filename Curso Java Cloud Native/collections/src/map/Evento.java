package map;

public class Evento {
    private String nome;
    private int qtdPessoas;

    public Evento(String nome, int qtdPessoas) {
        this.nome = nome;
        this.qtdPessoas = qtdPessoas;
    }

    public String getNome() {
        return nome;
    }

    public int getQtdPessoas() {
        return qtdPessoas;
    }

    @Override
    public String toString() {
        return String.format("{ %s, %s }", nome, qtdPessoas);
    }
}
