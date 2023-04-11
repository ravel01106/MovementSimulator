package net.juego.personaje;

public class Personaje {
    // ATRIBUTOS
    private String nombre;
    private int cordenadaX;
    private int cordenadaY;
    private int velocidad;

    // CONSTRUCTOR
    public Personaje(String nombre) {
        this.nombre = nombre;
        this.cordenadaX = 0;
        this.cordenadaY = 0;
        this.velocidad = 1;
    }

    // METODOS ACCESO
    public String nombre() {
        return nombre;
    }

    public int cordenadaX() {
        return cordenadaX;
    }

    public int cordenadaY() {
        return cordenadaY;
    }

    public int velocidad() {
        return velocidad;
    }

    public void nombre(String nombre) {
        this.nombre = nombre;
    }

    public void cordenadaX(int cordenadaX) {
        this.cordenadaX = cordenadaX;
    }

    public void cordenadaY(int cordenadaY) {
        this.cordenadaY = cordenadaY;
    }

    public void velocidad(int velocidad) {
        this.velocidad = velocidad;
    }

}

