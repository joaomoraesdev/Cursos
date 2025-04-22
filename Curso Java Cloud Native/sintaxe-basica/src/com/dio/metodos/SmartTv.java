package com.dio.metodos;

public class SmartTv {
    boolean status = true;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        status = true;
    }

    public void desligar() {
        status = false;
    }

    public void aumentarVolume() {
        volume++;
    }

    public void diminuirVolume() {
        volume--;
    }

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }
}
