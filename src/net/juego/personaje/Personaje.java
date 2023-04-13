package net.juego.personaje;

public class Personaje {
    // ATRIBUTOS
    private String nombre;
    private int cordenadaX;
    private int cordenadaY;
    private int velocidad;
    private boolean montarBicicleta;

    // CONSTRUCTOR
    // TODO: poner los movimientos aqui
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

    public boolean setMontarBicicleta() {
        return montarBicicleta;
    }

    public void setMontarBicicleta(boolean montarBicicleta) {
        this.montarBicicleta = montarBicicleta;
    }

    public void moverDercha() {
        this.cordenadaX += this.velocidad;
    }

    public void moverIzquierda() {
        this.cordenadaX -= this.velocidad;
    }

    public void moverArriba() {
        this.cordenadaY -= this.velocidad;
    }

    public void moverAbajo() {
        this.cordenadaY += this.velocidad;
    }

}
