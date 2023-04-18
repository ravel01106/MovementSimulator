# Clase MenuDelJuego

## Descripción

En esta clase Vamos a realizar la parte más compleja. En este caso vamos a tener dos atributos, el personaje y el mapa. Y tendremos varios metodos:

- El primer y segundo método es para comprobar y / o poner al personaje en la bicicleta o no. En el cual modificamos con los métodos de acceso los atributos velocidad y montarBicicleta del personaje.

- El tercer método es el más complejo donde realizamos el movimiento del personaje teniendo como parametro los siguientes: 
    - W: para ir hacia arriba. 
    - S: para ir hacia abajo. 
    - A: para ir hacia la izquierda. 
    - D: para ir hacia la derecha.
Para ello usamos una variable local donde dependiendo del parametro modificamos el posicionamiento del personaje para luego realizar una serie de comprobaciones antes de modifcar el posicionamiento del personaje (para verse mejor se crearon métodos privados para las comprobaciones): 
    - Si al modificarlo NO se sale del mapa. Si se sale, no se modifica la posición. 
    - Si al modificarlo NO se choca con una pared. Si se cocha, no se modifica la posición 
    - Si va montado el bicicleta y cuando se mueva no se choca con una pares, si pasa eso cambia su velocidad a 1, para evitaar chocarse.

- Por último, tendremos un metodo de leyenda donde llamamos a la leyenda de la clase mapa, y la aumentamos con 2 nuevas lineas siendo como se ve el personaje caminando y como se ve el personaje montado en la bicicleta.
