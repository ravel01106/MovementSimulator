package net.juego.comunicacion.menudejuego;

import net.juego.mapa.Mapa;
import net.juego.personaje.Personaje;
import net.juego.utils.generadormapa.GeneradorDeMapas;

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
        String msg = "El personaje ya se encuentra en la bicicleta.\n";
        if (!jugador.getMontarBicicleta()) {
            jugador.setMontarBicicleta(true);
            jugador.setVelocidad(2);
            msg = "El jugador se ha montado en la bicicleta.\n";
        }
        System.out.println(msg);
    }

    public void caminando() {
        String msg = "El personaje ya estaba caminando.\n";
        if (jugador.getMontarBicicleta()) {
            jugador.setMontarBicicleta(false);
            jugador.setVelocidad(1);
            msg = "El jugador se ha desmontado de la bicicleta.\n";
        }
        System.out.println(msg);
    }

    public void desplazarPersonaje(String movimiento) {
        String msg = "";
        int posicion = 1;
        boolean esTransitable = false;

        switch (movimiento.toLowerCase()) {
            case "w":
                posicion = jugador.moverArriba();
                esTransitable = comprobarPosicionArriba(posicion);
                msg = "El personaje se ha movido correctamente hacia arriba.\n";
                break;

            case "s":
                posicion = jugador.moverAbajo();
                esTransitable = comprobarPosicionAbajo(posicion);
                msg = "El personaje se ha movido correctamente hacia abajo.\n";
                break;

            case "a":
                posicion = jugador.moverIzquierda();
                esTransitable = comprobarPosicionIzquierda(posicion);
                msg = "El personaje se ha movido correctamente hacia la izquierda.\n";
                break;

            case "d":
                posicion = jugador.moverDerecha();
                esTransitable = comprobarPosicionDerecha(posicion);
                msg = "El personaje se ha movido correctamente hacia la derecha.\n";
                break;

            default:
                msg = "No se puede mover el personaje debido a";
                msg += " que no ha elegido una opción correcta.\n";
                esTransitable = true;
                break;
        }
        if (!esTransitable) {
            msg = "El personaje no puede avanzar a la posición deseada";
            msg += " debido a que va a chocar contra un muro.\n";
        }
        System.out.println(msg);
    }

    private boolean comprobarPosicionArriba(int posicion) {
        posicionYEnMapa = posicion + 1;
        posicionXEnMapa = jugador.getCordenadaX() + 1;

        if (posicion >= -1 && posicion <= mapaGenerado.length - 2) {

            if (jugador.getMontarBicicleta() && mapaGenerado[posicionYEnMapa][posicionXEnMapa] == "#") {
                posicion += 1;
            }

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
        StringBuilder msgBuilder = new StringBuilder("Mostrando mapa:\n");
        String[][] mapaMostrado = mapa.getMapaGenerado();
        int posicionX = jugador.getCordenadaX();
        int posicionY = jugador.getCordenadaY();

        for (int i = 0; i < mapaMostrado.length; i++) {

            for (int j = 0; j < mapaMostrado.length; j++) {

                if ((posicionY + 1) == i && (posicionX + 1) == j) {

                    if (jugador.getMontarBicicleta()) {
                        msgBuilder.append("8  ");

                    } else {
                        msgBuilder.append("O  ");
                    }

                } else {
                    msgBuilder.append(mapaMostrado[i][j]).append("  ");

                }
            }

            msgBuilder.append("\n");
        }

        System.out.println(msgBuilder);
    }

    public String leyendaJuego() {
        String msg = GeneradorDeMapas.leyenda() + "\n";
        msg += "O -> Posición del personaje (caminando)\n";
        msg += "8 -> Posición del personaje (en bicicleta)\n";
        return msg;

    }

}
