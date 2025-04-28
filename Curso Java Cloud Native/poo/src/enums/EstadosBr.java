package enums;

public enum EstadosBr {
    SAO_PAULO ("São Paulo", "SP"),
    RIO_DE_JANEIRO ("Rio de Janeiro", "RJ"),
    MINAS_GERAIS ("Minas Gerais", "MG");

    private String nome;
    private String sigla;

    private EstadosBr(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

}
