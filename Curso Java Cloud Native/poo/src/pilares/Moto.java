package pilares;

public class Moto extends Veiculo {

    // Exemplo de polimorfismo - implementação obrigatória do método abstrato porém de uma maneira diferente do carro
    @Override
    public void ligar() {
        System.out.println("Moto ligada");
    }
    
}
