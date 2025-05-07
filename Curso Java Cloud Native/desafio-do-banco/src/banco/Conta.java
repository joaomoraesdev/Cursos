package banco;

import java.util.*;

public abstract class Conta implements IConta {
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENTIAL = 1;
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    private static List<Conta> contasExistentes = new ArrayList();

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENTIAL++;
        this.cliente = cliente;
        contasExistentes.add(this);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.saldo -= valor;
        contaDestino.depositar(valor);
    }

    protected void imprimirInfoComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %s", this.agencia));
        System.out.println(String.format("Numero: %s", this.numero));
        System.out.println(String.format("Saldo: %s", this.saldo));
    }

    protected void listarContasExistentes() {
        contasExistentes.stream().forEach(System.out::println);
    }

    @Override
    public String toString() {
        return String.format("=== Conta: %s - Agência: %s - Número: %s - Titular: %s", 
                            this.getClass(), this.agencia, this.numero, this.cliente.getNome());
    }
}
