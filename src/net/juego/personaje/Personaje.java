package net.juego.personaje;

public class Personaje {

    private String nombre;
    private int cordenadaX;
    private int cordenadaY;
    private int velocidad;
    private boolean montarBicicleta;

    public Personaje(String nombre) {
        this.nombre = nombre;
        this.cordenadaX = 0;
        this.cordenadaY = 0;
        this.velocidad = 1;
        this.montarBicicleta = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCordenadaX() {
        return cordenadaX;
    }

    public void setCordenadaX(int cordenadaX) {
        this.cordenadaX = cordenadaX;
    }

    public int getCordenadaY() {
        return cordenadaY;
    }

    public void setCordenadaY(int cordenadaY) {
        this.cordenadaY = cordenadaY;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public boolean getMontarBicicleta() {
        return montarBicicleta;
    }

    public void setMontarBicicleta(boolean montarBicicleta) {
        this.montarBicicleta = montarBicicleta;
    }

    public int moverArriba() {
        int posicion = this.cordenadaY - this.velocidad;
        return posicion;
    }

    public int moverAbajo() {
        int posicion = this.cordenadaY + this.velocidad;
        return posicion;
    }

    public int moverIzquierda() {
        int posicion = this.cordenadaX - this.velocidad;
        return posicion;
    }

    public int moverDerecha() {
        int posicion = this.cordenadaX + this.velocidad;
        return posicion;
    }

}
