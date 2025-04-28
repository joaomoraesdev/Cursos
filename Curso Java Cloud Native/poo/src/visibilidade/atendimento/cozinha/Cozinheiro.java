package visibilidade.atendimento.cozinha;

import visibilidade.atendimento.Atendente;

public class Cozinheiro {
    public void adicionarLancheNoBalcao() {
        System.out.println("ADICIONANDO LANCHE NO BALCAO");
        // preparar novo lanche
        Almoxarife almoxarife = new Almoxarife();
        pedirIngredientes(almoxarife);
    }

    public void pedirIngredientes(Almoxarife almoxarife) {
        almoxarife.pegarIngredientes();
    }
}