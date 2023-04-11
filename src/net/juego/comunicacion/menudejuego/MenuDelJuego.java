package net.juego.comunicacion.menudejuego;

import net.juego.mapa.Mapa;
import net.juego.personaje.Personaje;

public class MenuDelJuego {
    private Personaje jugador;
    private Mapa mapa;

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
    
}
