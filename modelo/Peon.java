package ajedrez;

class Peon implements Pieza {
    
    boolean color;
    Coordenada coordenada;
    byte direccion;
    boolean primera_vez;
    public Peon() {
    }

    public void setCoordenada(Coordenada x) {
        coordenada = x;
    }

    public Coordenada getCoordenada() {
        return coordenada;
    }

    public void setColor(boolean _color) {
        color = _color;
    }

    public boolean getColor() {
        return color;
    }

    public void setDireccion(byte _direccion) {
        direccion = _direccion;
    }

    public byte getDireccion() {
        return direccion;
    }

    public boolean validarMovimiento(Coordenada coordenada_nueva) {
        //Sin declaracion
    }

    public boolean capturarFicha(Coordenada coordenada_nueva) {
        if (coordenada_nueva.getX() == coordenada.getX() ) {
            if (coordenada.getY()+(1*direccion) == coordenada_nueva.getY())
                return true;
            else if (primera_vez) {
                if (coordenada.getY+(2*direccion) == coordenada_nueva.getY())
                    return true;
            }

        }
        else if ( coordenada_nueva.estado() ) {
            if(coordenada_nueva.getX() == coordenada.getX()+1 || 
                    coordenada_nueva.getX() == coordenada.getX()-1)
                return false;
        }
    }
}
