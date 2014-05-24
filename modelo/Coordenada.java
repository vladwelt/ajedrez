package ajedrez;

class Coordenada {

    private Abscisa X;
    private byte Y;
    Pieza ficha;

    public Coordenada(Abscisa _x, byte _y) {
        X = _x;
        Y = _y;
    }

    public Abscisa getX() {
        return X;
    }

    public void setX(Abscisa _x) {
        X = _x;
    }

    public byte getY() {
        return Y;
    }

    public void setY(byte _y) {
        Y = _y;
    }

    public boolean estado() {
        if(ficha == null)
            return false;
        else
            return true;
    }

    public Pieza getFicha() {
        return ficha;
    }

    public void setFicha(Pieza _ficha) {
        ficha = _ficha;
    }
}
