package ajedrez;

import static java.lang.Math.abs;

class Dama extends Pieza {
    
    public boolean validarMovimiento(Coordenada origen,
            Coordenada destino, Tablero tablero) {
        if(validarDiagonal(origen, destino) || 
                validarHorizontal(origen, destino))
            return true;
        return false;
    }
    private boolean validarHorizontal(Coordenada origen,
            Coordenada destino, Tablero tablero) {
        if(posicion1.getX().equals(posicion2.getX()){
            return tablero.validar_recorrido_vertical(origen, destino);
        }
        if(posicion1.getY() == posicion2.getY()) {
            return tablero.validar_recorrido_vertical(origen, destino);
        }
        return false;
    }

    private boolean validarDiagonal(Coordenada origen,
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
