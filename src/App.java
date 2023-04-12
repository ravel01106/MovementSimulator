import net.juego.comunicacion.menudejuego.MenuDelJuego;
import net.juego.mapa.Mapa;
import net.juego.personaje.Personaje;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Mapa nuevoMapa = new Mapa(10);
        Personaje jugador = new Personaje("Saul");
        MenuDelJuego menu = new MenuDelJuego(nuevoMapa, jugador);
       /*  menu.desplazarPersonaje("w");
        menu.desplazarPersonaje("w");
        menu.desplazarPersonaje("s");
        menu.desplazarPersonaje("s");
        menu.desplazarPersonaje("a");
        menu.desplazarPersonaje("a");
        menu.desplazarPersonaje("d");
        menu.desplazarPersonaje("d");
        menu.desplazarPersonaje("d");
        System.out.println("-----------------------------------");
        menu.montarBicicleta();
        menu.desplazarPersonaje("w");
        menu.desplazarPersonaje("w");
        menu.desplazarPersonaje("s");
        menu.desplazarPersonaje("s");
        menu.desplazarPersonaje("a");
        menu.desplazarPersonaje("a");
        menu.desplazarPersonaje("d");
        menu.desplazarPersonaje("d");
        menu.desplazarPersonaje("d");*/
    }
}
