public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String musica;
    private boolean tocando;
    private String numero;
    private boolean atendido;
    private String url;

    public void selecionarMusica(String musica) {
        this.musica = musica;
        System.out.println("MÚSICA SELECIONADA: " + musica);
    }

    public void tocar() {
        this.tocando = true;
        System.out.println("TOCANDO MÚSICA");
    }

    public void pausar() {
        this.tocando = false;
        System.out.println("MÚSICA PAUSADA");
    }

    public void ligar(String numero) {
        this.numero = numero;
        System.out.println("LIGANDO PARA " + numero);
    }

    public void atender() {
        this.atendido = true;
        System.out.println("LIGAÇÃO ATENDIDA");
    }

    public void iniciarCorreioVoz() {
        this.atendido = false;
        System.out.println("CHAMADA CAINDO EM CAIXA POSTAL");
    }

    public void exibirPagina(String url) {
        this.url = url;
        System.out.println("PÁGINA ABERTA: " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("NOVA ABA ADICIONADA");
    }

    public void atualizarPagina() {
        System.out.println("PÁGINA ATUALIZADA");
    }

    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        
        System.out.println("=== REPRODUTOR MUSICAL ===");
        iphone.selecionarMusica("Scar Tissue");
        iphone.tocar();
        iphone.pausar();
        System.out.println();

        System.out.println("=== APARELHO TELEFÔNICO ===");
        iphone.ligar("11912345678");
        iphone.atender();
        iphone.iniciarCorreioVoz();
        System.out.println();

        System.out.println("=== NAVEGADOR INTERNET ===");
        iphone.adicionarNovaAba();
        iphone.exibirPagina("www.youtube.com");
        iphone.atualizarPagina();
    }
}
