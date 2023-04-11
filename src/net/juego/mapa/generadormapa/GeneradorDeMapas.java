package net.juego.mapa.generadormapa;

public class GeneradorDeMapas {

    public static String[][] generador (int tamanioMapa){
        return new String[tamanioMapa][tamanioMapa];
    }
    public static void leyenda(){
        String msg = "Leyenda del mapa:\n";
        msg += "# -> Borde del mapa (no accesible)\n";
        msg += "X -> Suelo del mapa (accesible)";
        System.out.println(msg);
    }
}
