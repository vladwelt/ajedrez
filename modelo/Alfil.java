package ajedrez;

import static java.lang.Math.abs;

class Alfil extends Pieza {
    public Alfil(boolean _color) {
        super(_color);
    }
    
    public boolean validarMovimiento(Coordenada origen,
           Coordenada destino, Tablero tablero) {
        if(Math.abs( posicion1.getX().getValue()-
                    posicion2.getX().getValue() ) == 
                Math.abs( posicion1.getY()-
                    posicion2.getY() ) ) {
                return tablero.validar_recorrido_diagonal(origen, destino);
            }
        return false;
    }
}
