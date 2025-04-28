package visibilidade;

import visibilidade.atendimento.Atendente;
import visibilidade.atendimento.cozinha.Cozinheiro;
import visibilidade.cliente.Cliente;

public class Estabelecimento {
    public static void main(String[] args) {
        Cozinheiro cozinheiro = new Cozinheiro();
        Atendente atendente = new Atendente();
        Cliente cliente = new Cliente();
        
        cozinheiro.adicionarLancheNoBalcao();
        atendente.servirMesa();
        cliente.comerLanche();
    }
}
