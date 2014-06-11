package ajedrez;

abstract class Pieza {
    
    boolean color;

    public Pieza(boolean _color) {
        color = _color;
    }
    
    public void setColor(boolean _color) {
        color = _color;
    }

    public boolean getColor() {
        return color;
    }

    abstract public boolean validarMovimiento(Coordenada origen, Coordenada destino);
}
