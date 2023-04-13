package net.juego.comunicacion.menudejuego;

import net.juego.mapa.Mapa;
import net.juego.personaje.Personaje;

public class MenuDelJuego {
    private Personaje jugador;
    private Mapa mapa;

    public MenuDelJuego(Mapa mapa, Personaje jugador) {
        this.jugador = jugador;
        this.mapa = mapa;
    }

    public void montarBicicleta() {
        String msg = "El personaje ya se encuentra en la bicicleta.";
        if (!jugador.setMontarBicicleta()) {
            jugador.setMontarBicicleta(true);
            jugador.setVelocidad(2);
        } else {
            System.out.println(msg);
        }
    }

    public void caminando() {
        String msg = "El personaje ya estabacaminando.";
        if (jugador.setMontarBicicleta()) {
            jugador.setMontarBicicleta(false);
            jugador.setVelocidad(1);
        } else {
            System.out.println(msg);
        }
    }

    public void desplazarPersonaje(String movimiento) {
        String msg = "";
        String[][] mapaAnterior = mapa.getMapaGenerado();
        int posicion;

        // TODO: quitar el condicional y ponerlo cuando imprima al jugador
        switch (movimiento.toLowerCase()) {
            case "w":
                jugador.moverArriba();
                break;

            case "s":
                jugador.moverAbajo();
                break;

            case "a":
                jugador.moverIzquierda();
                break;

            case "d":
                jugador.moverDercha();
                break;

            default:
                msg = "No se puede mover el jugador :V";
                break;
        }
    }

    public void mostrarMapaActualizado() {
        String[][] mapaParaActualizar = mapa.getMapaGenerado();
        String msg = "";
        if (mapa.esTransitable(jugador)) {
            for (int i = 0; i < mapaParaActualizar.length; i++) {
                for (int j = 0; j < mapaParaActualizar.length; j++) {
                    if (jugador.getCordenadaX() + 1 == j && jugador.getCordenadaY() + 1 == i) {
                        msg += "O  ";
                    } else {
                        msg += mapaParaActualizar[i][j] + "  ";
                    }
                }
                msg += "\n";
            }
        } else {
            for (int i = 0; i < mapaParaActualizar.length; i++) {
                for (int j = 0; j < mapaParaActualizar.length; j++) {
                    if (jugador.getCordenadaX() == j && jugador.getCordenadaY() == i) {
                        msg += "O  ";
                    } else {
                        msg += mapaParaActualizar[i][j] + "  ";
                    }
                }
                msg += "\n";
            }
        }
        System.out.println(msg);
    }

}
