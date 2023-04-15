package net.juego;

import java.util.Scanner;

import net.juego.comunicacion.menudejuego.MenuDelJuego;
import net.juego.mapa.Mapa;
import net.juego.personaje.Personaje;

public class Juego {
    static final Scanner TECLADO = new Scanner(System.in);
    static String msg = "Bienvenido usuario!\n";

    public static int pedirTamañoMapa() {
        msg = "Introduzca el tamaño del mapa: ";
        System.out.println(msg);
        try {
            return Integer.parseInt(TECLADO.nextLine());
        } catch (NumberFormatException e) {
            msg = "Me ha introducido mal el número, ";
            msg += "por lo que, le pondremos el numero 10 por defecto";
            System.out.println(msg);
            return 10;
        }
    }

    public static String pedirNombreJugador() {
        msg = "Introduzca el nombre que quiere que tenga el personaje";
        System.out.println(msg);
        return TECLADO.nextLine();
    }

    public static void msgMenu() {
        msg = "Menu del juego:\n";
        msg += "1 - Desplazar al jugador en las cuatro direcciones.\n";
        msg += "2 - Montar o desmontar al jugador de la bicicleta.\n";
        msg += "3 - Mostrar el mapa incluyendo al jugador.\n";
        msg += "4 - Mostrar la leyenda del mapa de juego.\n";
        msg += "5 - Cerrar el juego despidiéndose del usuario.\n";
        System.out.println(msg);
    }

    public static void msgMenuDesplazamiento() {
        msg = "Menu de desplazamiento del personaje:\n";
        msg += "w - Para desplazarse hacia arriba.\n";
        msg += "s - Para desplazarse hacia abajo.\n";
        msg += "a - Para desplazarse hacia izquierda.\n";
        msg += "d - Para desplazarse hacia derecha.\n";
        System.out.println(msg);
    }

    public static void msgMenuBicicleta() {
        msg = "Menu de Montar o desmontar bicicleta:\n";
        msg += "g - Para montar en la bicileta.\n";
        msg += "t - Para desmontarse de la bicicleta.\n";
        System.out.println(msg);
    }

    private static String eleccionMontarDesmontarBicicleta() {
        return TECLADO.nextLine();
    }

    public static void MontarDesmontarBicicleta(MenuDelJuego menu) {
        boolean eleccionCorrectaBicicleta = false;
        String eleccionMontarDesmontar;
        while (!eleccionCorrectaBicicleta) {
            msgMenuBicicleta();
            eleccionMontarDesmontar = eleccionMontarDesmontarBicicleta();
            switch (eleccionMontarDesmontar) {
                case "g":
                    menu.montarBicicleta();
                    eleccionCorrectaBicicleta = true;
                    break;
                case "t":
                    menu.caminando();
                    eleccionCorrectaBicicleta = true;
                    break;

                default:
                    msg = "Lo siento, elija una opcion correcta";
                    System.out.println(msg);
                    break;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(msg);
        Personaje jugador = new Personaje(pedirNombreJugador());
        Mapa mapa = new Mapa(pedirTamañoMapa());
        MenuDelJuego menu = new MenuDelJuego(mapa, jugador);
        String desicion = "";
        String movimiento = "";

        while (!desicion.equals("5")) {
            msgMenu();
            desicion = TECLADO.nextLine();

            switch (desicion) {
                case "1":
                    msgMenuDesplazamiento();
                    movimiento = TECLADO.nextLine();
                    menu.desplazarPersonaje(movimiento);

                    break;
                case "2":
                    MontarDesmontarBicicleta(menu);

                    break;
                case "3":
                    menu.mostrar();

                    break;
                case "4":
                    System.out.println(menu.leyendaJuego());

                    break;
                case "5":
                    msg = "Cerrando juego...";
                    System.out.println(msg);

                    break;

                default:
                    msg = "Elija una de las opciones mostradas por pantalla.";
                    System.out.println(msg);

                    break;
            }

        }

    }
}
