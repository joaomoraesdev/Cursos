package pilares;

public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("123");
        jeep.ligar();

        Moto royal = new Moto();
        royal.setChassi("321");
        royal.ligar();

        Veiculo coringa = royal;
        coringa.ligar();
    }
}
