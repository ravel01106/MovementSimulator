package net.juego.comunicacion.menudejuego;

import net.juego.mapa.Mapa;
import net.juego.personaje.Personaje;

public class MenuDelJuego {
    private Personaje jugador;
    private Mapa mapa;
    public MenuDelJuego(Mapa mapa, Personaje jugador){
        this.jugador = jugador;
        this.mapa = mapa;
    }

    public void montarBicicleta(){
        String msg = "El personaje ya se encuentra en la bicicleta.";
        if(!jugador.setMontarBicicleta()){
            jugador.setMontarBicicleta(true);
            jugador.setVelocidad(2);
        }else{
            System.out.println(msg);
        }
    }
    public void caminando(){
        String msg = "El personaje ya estabacaminando.";
        if(jugador.setMontarBicicleta()){
            jugador.setMontarBicicleta(false);
            jugador.setVelocidad(1);
        }else{
            System.out.println(msg);
        }
    }
    public void desplazarPersonaje(String movimiento){
        String msg = "";
        int cordenadaYDelJugador =jugador.getCordenadaY();
        int cordenadaXDelJugador =jugador.getCordenadaX();
        int velocidad = jugador.getVelocidad();
        String[][] mapaAnterior = mapa.getMapaGenerado();
        switch (movimiento.toLowerCase()) {
            case "w":
                jugador.setCordenadaY(cordenadaYDelJugador + velocidad);
                break;

            case "s":
            jugador.setCordenadaY(cordenadaYDelJugador - velocidad);
                break;

            case "a":
            jugador.setCordenadaX(cordenadaXDelJugador - velocidad);
                break;

            case "d":
            jugador.setCordenadaX(cordenadaXDelJugador + velocidad);
                break;

            default:
                msg = "No se puede mover el jugador :V";
                break;

        }
        /* 
        mapaAnterior[jugador.getCordenadaY()][jugador.getCordenadaX()] = "O";
        mapa.setMapaGenerado(mapaAnterior);
        msg = "posicion x: " + jugador.getCordenadaX() + ", posicion y: " + jugador.getCordenadaY();
        System.out.println(msg);
        String msg2 = "";
        for (int i = 0; i < mapaAnterior.length; i++) {
            for (int j = 0; j < mapaAnterior.length; j++) {
                msg2 += mapaAnterior[i][j] + "  ";
            }
            msg2 += "\n";
        }
        System.out.println(msg2);*/
    }
    
}
