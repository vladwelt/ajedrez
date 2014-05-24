package ajedrez;

interface Pieza {
    void setCoordenada(Coordenada x);
    Coordenada getCoordenada();
    void setColor(boolean _color);
    boolean getColor();
    void setDireccion(byte _direccion);
    boolean validarMovimiento(Coordenada x);
}
