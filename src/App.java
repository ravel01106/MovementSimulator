import net.juego.comunicacion.menudejuego.MenuDelJuego;
import net.juego.mapa.Mapa;
import net.juego.personaje.Personaje;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Mapa nuevoMapa = new Mapa(10);
        Personaje jugador = new Personaje("Saul");
        MenuDelJuego menu = new MenuDelJuego(nuevoMapa, jugador);
        menu.desplazarPersonaje("s");
        menu.mostrarMapaActualizado();

        menu.desplazarPersonaje("w");
        menu.mostrarMapaActualizado();

        // String msg = "posicion x: " + jugador.getCordenadaX() + " posicion y: " +
        // jugador.getCordenadaY();
        // System.out.println(msg);
    }
}
