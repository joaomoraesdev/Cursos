package pilares;

// Exemplo de Herança - Carro herda as propriedades do veículo
public class Carro extends Veiculo {
    // Exemplo de encapsulamento - nem todo método precisa estar visível na aplicação principal, seu processamento pode ser feito dentro desse publico
    // Exemplo de polimorfismo - implementação obrigatória do método abstrato porém de uma maneira diferente da moto
    public void ligar() {
        confereCambio();
        confereCombustivel();
        System.out.println("Carro ligado");
    }

    private void confereCombustivel() {
        System.out.println("Conferindo combustivel");
    }

    private void confereCambio() {
        System.out.println("Conferindo câmbio em P");
    }
}
