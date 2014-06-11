package ajedrez;

class Torre extends Pieza {
    public Torre(boolean _color) {
        super(_color);
    }

    public boolean validarMovimiento(Coordenada origen,
           Coordenada destino, Tablero tablero) {
        if(posicion1.getX().equals(posicion2.getX())
            return  tablero.validar_recorrido_vertical();
        if(posicion1.getY() == posicion2.getY()) {
            return tablero.validar_recorrido_horizontal();    
        }
        return false;
    }
}
