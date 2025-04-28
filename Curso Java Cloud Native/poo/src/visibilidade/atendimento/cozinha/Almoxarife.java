package visibilidade.atendimento.cozinha;

public class Almoxarife {
    //deixar sem nada antes do tipo do método, é a mesma coisa que colocar protected
    void controlarEntrada() {
        System.out.println("CONTROLANDO ENTRADA DO ALMOXARIFADO");
    }

    protected void pegarIngredientes() {
        separandoIngredientes();
    }

    private void separandoIngredientes() {
        System.out.println("PEGANDO INGREDIENTES");
    }
}
