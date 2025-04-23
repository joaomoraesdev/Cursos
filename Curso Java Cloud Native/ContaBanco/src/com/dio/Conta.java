package com.dio;

public class Conta {
    int numero;
    String agencia;
    String nomeCliente;
    char primeiroDeposito;
    Double saldo = null;

    @Override
    public String toString() {
        return String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo de R$%s já está disponível para saque.",
                            nomeCliente, agencia, numero, saldo);
    }
}
