package net.juego.utils.generadormapa;

public class GeneradorDeMapas {

    public static String[][] generador (int tamanioMapa){
        String[][] mapaGenerado = new String[tamanioMapa][tamanioMapa];
        for (int i = 0; i < mapaGenerado.length; i++) {
            for (int j = 0; j < mapaGenerado.length; j++) {
                if(i == 0 | i == mapaGenerado.length - 1 | j == 0 | j == mapaGenerado.length - 1){
                    mapaGenerado[i][j] = "#";
                }else{
                    mapaGenerado[i][j] = "X";
                }
            }
        }
        return mapaGenerado;
    }
    public static void leyenda(){
        String msg = "Leyenda del mapa:\n";
        msg += "# -> Borde del mapa (no accesible)\n";
        msg += "X -> Suelo del mapa (accesible)";
        System.out.println(msg);
    }
}
