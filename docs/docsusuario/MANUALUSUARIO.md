# Manual del usuario

## Descripción

Al ejecutar el programa nos saldrá una calida bienvenida además de pedirnos el tamaño del mapa y el nombre del personaje.

Una vez hecho eso nos mostrara un menu con lo siguiente:

1. **Desplazar al jugador en las cuatro direcciones**: En este caso si elejimos esta opción tendremos otro menu diciendonos en que direcciones debemos movernos:
    - **W**: para ir hacia arriba. 
    - **S**: para ir hacia abajo. 
    - **A**: para ir hacia la izquierda. 
    - **D**: para ir hacia la derecha.

2. **Montar o desmontar al jugador de la bicicleta**: Si elegimos esta opción nos saldrá un menu para elegir si queremos:
    - **g**: para montar en la bicileta.
    - **t**: para desmontarse de la bicicleta.

3. **Mostrar el mapa incluyendo al jugador**: Mostramos al personaje en el mapa, representado con una X o 8.

4. **Mostrar la leyenda del mapa del juego**: Nos mostrara la leyenda del mapa por si el usuario se pierde al entender que parte son el muro, que parte es el suelo y cual es el personaje montado y desmontado de la bicicleta.

5. **Cerrar el juego**: en este caso cerramos el programa despidiendose del usuario.

### CABE DESTACAR
Que durante todo el proceso se va a repetir el menu una vez finalizada cualquier acción **excepto** cuando le damos a la opción 5 donde cierra el juego. Si te equivocas al elegir una opción en cualquiera de los menus te pasará por mensaje que tienes que poner una opción correcta y repetira el menu de nuevo.

### Movimiento del jugador
Cuando se entra en el menu, si elijes primero la opción 3 para mostrar el mapa podrás comprobar que el personaje comienza en la esquina superior izquierda. Si al moverte, chocas con una pared se te indicara con mensaje de que vas a chocarte con el muro.
Además de cuando decidas que el personaje vaya en bicicleta se mostrará con otro signo (Que podrás ver al seleccionar la leyenda) y se moverá de dos en dos, excepto cuando solo haya un espacio entre el y el muro, en ese caso solo se movera una casilla.