import net.juego.comunicacion.menudejuego.MenuDelJuego;
import net.juego.mapa.Mapa;
import net.juego.personaje.Personaje;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Mapa nuevoMapa = new Mapa(5);
        Personaje jugador = new Personaje("Saul");
        MenuDelJuego menu = new MenuDelJuego(nuevoMapa, jugador);

        System.out.println("posicion inicial");
        menu.mostrar(); // debe estar en la posicion (1,1)
        menu.desplazarPersonaje("s");
        System.out.println("posicion y: " + jugador.getCordenadaY() +
                ", posicion x: " + jugador.getCordenadaX());
        menu.mostrar();// posicion (2,1)
        menu.desplazarPersonaje("w");
        System.out.println("posicion y: " + jugador.getCordenadaY() +
                ", posicion x: " + jugador.getCordenadaX());
        menu.mostrar();// posicion (1,1)
        menu.desplazarPersonaje("w");
        menu.mostrar();// Deberia no dejar moverse, ya que no se settea
        System.out.println("posicion y: " + jugador.getCordenadaY() +
                ", posicion x: " + jugador.getCordenadaX());
        // ---------------------------------------------------------
        menu.desplazarPersonaje("s");
        System.out.println("posicion y: " + jugador.getCordenadaY() +
                ", posicion x: " + jugador.getCordenadaX());
        menu.mostrar();// posicion (2,1)
        menu.desplazarPersonaje("s");
        System.out.println("posicion y: " + jugador.getCordenadaY() +
                ", posicion x: " + jugador.getCordenadaX());
        menu.mostrar();// posicion (3,1)
        menu.desplazarPersonaje("s");
        System.out.println("posicion y: " + jugador.getCordenadaY() +
                ", posicion x: " + jugador.getCordenadaX());
        menu.mostrar();// Deberia no dejar moverse

        // ------------------------------------------------------
        menu.desplazarPersonaje("d");
        menu.mostrar();// posicion (3,2)
        menu.desplazarPersonaje("d");
        menu.mostrar();// posicion (3,3)
        menu.desplazarPersonaje("d");
        menu.mostrar();// Deberia no dejar moverse
        menu.desplazarPersonaje("a");
        menu.mostrar();// posicion (3,2)
        menu.desplazarPersonaje("a");
        menu.mostrar();// posicion (3,1)
        menu.desplazarPersonaje("a");
        menu.mostrar();// Deberia no dejar moverse

        // ---------------------------------------------------------

        // String msg = "posicion x: " + jugador.getCordenadaX() + " posicion y: " +
        // jugador.getCordenadaY();
        // System.out.println(msg);
    }
}
