package banco;

public class Main {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente(new Cliente("João"));
        Conta cp = new ContaPoupanca(new Cliente("R9"));

        cc.depositar(100);
        cc.transferir(50, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

        System.out.println("");

        cc.listarContasExistentes();
    }
}
