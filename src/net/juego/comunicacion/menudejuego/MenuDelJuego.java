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
        if (!jugador.getMontarBicicleta()) {
            jugador.setMontarBicicleta(true);
            jugador.setVelocidad(2);
        } else {
            System.out.println(msg);
        }
    }

    public void caminando() {
        String msg = "El personaje ya estabacaminando.";
        if (jugador.getMontarBicicleta()) {
            jugador.setMontarBicicleta(false);
            jugador.setVelocidad(1);
        } else {
            System.out.println(msg);
        }
    }

    public void desplazarPersonaje(String movimiento) {
        String msg = "";
        String[][] mapaAnterior = mapa.getMapaGenerado();
        int posicion = 1;
        int posicionXEnMapa = 1;
        int posicionYEnMapa = 1;
        boolean esTransitable = false;

        switch (movimiento.toLowerCase()) {
            case "w":
                posicion = jugador.moverArriba();
                posicionYEnMapa = posicion + 1;
                posicionXEnMapa = jugador.getCordenadaX() + 1;
                try {
                    if (jugador.getMontarBicicleta() && mapaAnterior[posicionYEnMapa][posicionXEnMapa] == "#") {
                        posicion += 1;
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                }
                if (posicion >= 0 && posicion <= mapaAnterior.length - 3) {
                    jugador.setCordenadaY(posicion);
                    esTransitable = true;
                }
                msg = "El personaje se ha movido hacia arriba";
                break;

            case "s":
                posicion = jugador.moverAbajo();
                posicionYEnMapa = posicion + 1;
                posicionXEnMapa = jugador.getCordenadaX() + 1;
                try {
                    if (jugador.getMontarBicicleta() && mapaAnterior[posicionYEnMapa][posicionXEnMapa] == "#") {
                        posicion -= 1;
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                }

                if (posicion >= 0 && posicion <= mapaAnterior.length - 3) {
                    jugador.setCordenadaY(posicion);
                    esTransitable = true;
                }

                msg = "El personaje se ha movido hacia abajo";
                break;

            case "a":
                posicion = jugador.moverIzquierda();
                posicionYEnMapa = jugador.getCordenadaY() + 1;
                posicionXEnMapa = posicion + 1;
                try {
                    if (jugador.getMontarBicicleta() && mapaAnterior[posicionYEnMapa][posicionXEnMapa] == "#") {
                        posicion += 1;
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                }
                if (posicion >= 0 && posicion <= mapaAnterior.length - 3) {
                    jugador.setCordenadaX(posicion);
                    esTransitable = true;
                }
                msg = "El personaje se ha movido hacia la izquierda";
                break;

            case "d":
                posicion = jugador.moverDerecha();
                posicionYEnMapa = jugador.getCordenadaY() + 1;
                posicionXEnMapa = posicion + 1;
                try {
                    if (jugador.getMontarBicicleta() && mapaAnterior[posicionYEnMapa][posicionXEnMapa] == "#") {
                        posicion -= 1;
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                }
                if (posicion >= 0 && posicion <= mapaAnterior.length - 3) {
                    jugador.setCordenadaX(posicion);
                    esTransitable = true;
                }
                msg = "El personaje se ha movido hacia la derecha";
                break;

            default:
                msg = "No se puede mover el jugador :V";
                break;
        }
        if (!esTransitable) {
            msg = "TE VAS A COMER EL MURO MI NIÑO :V";
        }
        System.out.println(msg);
    }

    public void mostrar() {
        String msg = "";
        String[][] mapaMostrado = mapa.getMapaGenerado();
        int posicionX = jugador.getCordenadaX();
        int posicionY = jugador.getCordenadaY();
        for (int i = 0; i < mapaMostrado.length; i++) {
            for (int j = 0; j < mapaMostrado.length; j++) {
                if ((posicionY + 1) == i && (posicionX + 1) == j) {
                    if (jugador.getMontarBicicleta()) {
                        msg += "8  ";
                    } else {
                        msg += "O  ";
                    }
                } else {
                    msg += mapaMostrado[i][j] + "  ";
                }
            }
            msg += "\n";
        }
        System.out.println(msg);
    }

}
