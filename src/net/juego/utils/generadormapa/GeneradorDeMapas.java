package net.juego.utils.generadormapa;

public class GeneradorDeMapas {
    private static final int TAMANIO_POR_DEFECTO = 10;

    public static String[][] generador (int tamanioMapa){
        String msg;
        String[][] mapaGenerado;
        if(tamanioMapa < 3){
            msg = "Lo siento, el mapa que quiere generar es muy pequeño. ";
            msg+= "En su lugar pondremos el valor por defecto 10";
            System.out.println(msg);
            mapaGenerado = new String[TAMANIO_POR_DEFECTO][TAMANIO_POR_DEFECTO];
        }else{
            mapaGenerado = new String[tamanioMapa][tamanioMapa];
        }
        msg = "";
        for (int i = 0; i < mapaGenerado.length; i++) {
            for (int j = 0; j < mapaGenerado.length; j++) {
                if(i == 0 | i == mapaGenerado.length - 1 | j == 0 | j == mapaGenerado.length - 1){
                    mapaGenerado[i][j] = "#";
                }else{
                    mapaGenerado[i][j] = "X";
                }
                msg += mapaGenerado[i][j] + "  ";
            }
            msg += "\n";
        }
        System.out.println(msg);
        return mapaGenerado;
    }
    public static void leyenda(){
        String msg = "Leyenda del mapa:\n";
        msg += "# -> Borde del mapa (no accesible)\n";
        msg += "X -> Suelo del mapa (accesible)";
        System.out.println(msg);
    }
}
