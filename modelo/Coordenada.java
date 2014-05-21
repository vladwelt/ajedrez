package ajedrez;

class Coordenada {

    private byte X;
    private byte Y;
    Pieza ficha;

    public Coordenada(char _x, byte _y) {
        setX(_x);
        Y = _y;
    }

    public char getX() {
        switch(X) {
            case 0:
                return 'A';
            case 1:
                return 'B';
            case 2:
                return 'C';
            case 3:
                return 'D';
            case 4:
                return 'E';
            case 5:
                return 'F';
            case 6:
                return 'G';
            case 7:
                return 'H';
            default:
                break;
        }
    }

    public void setX(char _x) {
        switch(_x) {
            case 'A':
                X = 0;
                break;
            case 'B':
                X = 1;
                break;
            case 'C':
                X = 2;
                break;
            case 'D':
                X = 3;
                break;
            case 'E':
                X = 4;
                break;
            case 'F':
                X = 5;
                break;
            case 'G':
                X = 6;
                break;
            case 'H':
                X = 7;
                break;
            default:
                break;
        }
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

    public Ficha getFicha() {
        return ficha;
    }

    public void setFicha(Ficha _ficha) {
        ficha = _ficha;
    }
}
