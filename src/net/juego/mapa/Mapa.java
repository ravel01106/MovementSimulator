package net.juego.mapa;

import net.juego.mapa.generadormapa.GeneradorDeMapas;

public class Mapa {
    private int tamanioMapa;
    private String[][] mapaGenerado;

    public Mapa(int tamanioMapa){
        this.tamanioMapa = tamanioMapa;
        this.mapaGenerado = GeneradorDeMapas.generador(tamanioMapa);
    }
    
}
