package getset;

public class Escola {
    public static void main(String[] args) {
        Aluno alunoNovo = new Aluno();
        alunoNovo.setNome("Mário");
        alunoNovo.setIdade(14);
        System.out.println(alunoNovo.getNome() + alunoNovo.getIdade());
    }
}
