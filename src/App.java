import net.juego.comunicacion.menudejuego.MenuDelJuego;
import net.juego.mapa.Mapa;
import net.juego.personaje.Personaje;

public class App {
        public static void main(String[] args) throws Exception {
                System.out.println("Hello, World!");
                Mapa nuevoMapa = new Mapa(7);
                Personaje jugador = new Personaje("Saul");
                MenuDelJuego menu = new MenuDelJuego(nuevoMapa, jugador);

                System.out.println("posicion inicial");
                menu.mostrar(); // debe estar en la posicion (1,1)
                menu.montarBicicleta();
                menu.desplazarPersonaje("d");

                menu.mostrar();
                menu.desplazarPersonaje("d");

                menu.mostrar();
                menu.desplazarPersonaje("d");

                menu.mostrar();
                menu.desplazarPersonaje("a");

                menu.mostrar();
                menu.desplazarPersonaje("a");

                menu.mostrar();
                menu.desplazarPersonaje("a");

                menu.mostrar();

                menu.desplazarPersonaje("s");

                menu.mostrar();
                menu.desplazarPersonaje("s");

                menu.mostrar();
                menu.desplazarPersonaje("s");

                menu.mostrar();
                menu.desplazarPersonaje("d");

                menu.mostrar();
                menu.desplazarPersonaje("d");

                menu.mostrar();
                menu.desplazarPersonaje("d");

                menu.mostrar();
                menu.desplazarPersonaje("a");

                menu.mostrar();
                menu.desplazarPersonaje("a");

                menu.mostrar();
                menu.desplazarPersonaje("a");

                menu.mostrar();
                System.out.println(menu.leyendaJuego());
                menu.desplazarPersonaje("f");

        }
}
