package net.juego.mapa;

import net.juego.personaje.Personaje;
import net.juego.utils.generadormapa.GeneradorDeMapas;

public class Mapa {
    private int tamanioMapa;
    private String[][] mapaGenerado;

    public Mapa(int tamanioMapa) {
        this.tamanioMapa = tamanioMapa;
        this.mapaGenerado = GeneradorDeMapas.generador(tamanioMapa);
    }

    public String[][] getMapaGenerado() {
        return mapaGenerado;
    }

    public void setMapaGenerado(String[][] mapaGenerado) {
        this.mapaGenerado = mapaGenerado;
    }

    public boolean esTransitable(Personaje jugador) {
        int posicionX = jugador.getCordenadaX() + 1;
        int posicionY = jugador.getCordenadaY() + 1;
        if (posicionX > 1 || posicionX < this.mapaGenerado.length - 2 || posicionY > 1
                || posicionY < this.mapaGenerado.length - 2) {
            return true;
        }
        return false;
    }
}
