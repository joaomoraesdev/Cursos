package construtores;

public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("12345678945", "Layla");
        pessoa.setEndereco("Rua Teste, 123");
        System.out.println(pessoa.getNome() + pessoa.getCpf() + pessoa.getEndereco());
    }
}
