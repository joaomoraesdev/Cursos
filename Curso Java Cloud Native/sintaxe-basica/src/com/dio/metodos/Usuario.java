package com.dio.metodos;
public class Usuario {
    public static void main(String[] args) {
        SmartTv tv = new SmartTv();

        tv.diminuirVolume();
        tv.diminuirVolume();
        tv.aumentarVolume();

        System.out.println("Status TV: " + tv.status);
        System.out.println("Canal atual: " + tv.canal);
        System.out.println("Volume atual: " + tv.volume);

        tv.desligar();
        System.out.println("Status TV: " + tv.status);

        tv.mudarCanal(13);
        System.out.println("Canal atual: " + tv.canal);
    }
}
