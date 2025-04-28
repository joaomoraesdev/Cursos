package pilares;

public abstract class Veiculo {
    private String chassi;


    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    // Exemplo de abstração - implementação obrigatória de métodos generalizados
    public abstract void ligar();
}
