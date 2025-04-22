package com.dio.metodos;

/**
 * <h1>SmarTv<h1>
 * Contém funções para controlar uma TV Smart
 * <p>
 * <b>Note:</b> Leia atentamente a documentação desta classe para desfrutar dos recursos ofercidos pelo autor
 * 
 * @author João Moraes
 * @version 1.0
 * @since 22/04/25
 */
public class SmartTv {
    boolean status = true;
    int canal = 1;
    int volume = 25;

    /**
     * Este método é utilizado para ligar a TV
     * @param N/A não há parâmetro
     * @return não há retorno
     */
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
