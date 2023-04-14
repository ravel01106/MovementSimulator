package net.juego.comunicacion.menudejuego;

import net.juego.mapa.Mapa;
import net.juego.personaje.Personaje;

public class MenuDelJuego {
    private Personaje jugador;
    private Mapa mapa;
    private int posicionXEnMapa = 1;
    private int posicionYEnMapa = 1;
    private String[][] mapaGenerado;

    public MenuDelJuego(Mapa mapa, Personaje jugador) {
        this.jugador = jugador;
        this.mapa = mapa;
        this.mapaGenerado = this.mapa.getMapaGenerado();
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
        int posicion = 1;
        boolean esTransitable = false;

        switch (movimiento.toLowerCase()) {
            case "w":
                posicion = jugador.moverArriba();
                esTransitable = comprobarPosicionArriba(posicion);
                msg = "El personaje se ha movido hacia arriba";
                break;

            case "s":
                posicion = jugador.moverAbajo();
                esTransitable = comprobarPosicionAbajo(posicion);
                msg = "El personaje se ha movido hacia abajo";
                break;

            case "a":
                posicion = jugador.moverIzquierda();
                esTransitable = comprobarPosicionIzquierda(posicion);
                msg = "El personaje se ha movido hacia la izquierda";
                break;

            case "d":
                posicion = jugador.moverDerecha();
                esTransitable = comprobarPosicionDerecha(posicion);
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

    private boolean comprobarPosicionArriba(int posicion) {
        posicionYEnMapa = posicion + 1;
        posicionXEnMapa = jugador.getCordenadaX() + 1;

        // si la posicion se sale del array
        if (posicion >= -1 && posicion <= mapaGenerado.length - 2) {

            // Si el personaje esta montado en bicicleta y la posicion en la que se quiera
            // mover es un muro
            // Debido a que siempre se mueve dos casillas y en este caso se deberia mover
            // una
            if (jugador.getMontarBicicleta() && mapaGenerado[posicionYEnMapa][posicionXEnMapa] == "#") {
                posicion += 1;
            }

            // Aqui vemos que el jugador, independiente mente si va caminando o en bici no
            // se da contra el muro
            if (posicion >= 0 && posicion <= mapaGenerado.length - 3) {
                jugador.setCordenadaY(posicion);
                return true;
            }
        }

        return false;
    }

    private boolean comprobarPosicionAbajo(int posicion) {
        posicionYEnMapa = posicion + 1;
        posicionXEnMapa = jugador.getCordenadaX() + 1;

        if (posicion >= -1 && posicion <= mapaGenerado.length - 2) {

            if (jugador.getMontarBicicleta() && mapaGenerado[posicionYEnMapa][posicionXEnMapa] == "#") {
                posicion -= 1;
            }

            if (posicion >= 0 && posicion <= mapaGenerado.length - 3) {
                jugador.setCordenadaY(posicion);
                return true;
            }
        }

        return false;
    }

    private boolean comprobarPosicionIzquierda(int posicion) {
        posicionYEnMapa = jugador.getCordenadaY() + 1;
        posicionXEnMapa = posicion + 1;

        if (posicion >= -1 && posicion <= mapaGenerado.length - 2) {
            if (jugador.getMontarBicicleta() && mapaGenerado[posicionYEnMapa][posicionXEnMapa] == "#") {
                posicion += 1;
            }

            if (posicion >= 0 && posicion <= mapaGenerado.length - 3) {
                jugador.setCordenadaX(posicion);
                return true;
            }
        }

        return false;
    }

    private boolean comprobarPosicionDerecha(int posicion) {
        posicionYEnMapa = jugador.getCordenadaY() + 1;
        posicionXEnMapa = posicion + 1;

        if (posicion >= -1 && posicion <= mapaGenerado.length - 2) {

            if (jugador.getMontarBicicleta() && mapaGenerado[posicionYEnMapa][posicionXEnMapa] == "#") {
                posicion -= 1;
            }

            if (posicion >= 0 && posicion <= mapaGenerado.length - 3) {
                jugador.setCordenadaX(posicion);
                return true;
            }
        }

        return false;

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
