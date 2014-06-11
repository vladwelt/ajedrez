package ajedrez;

class Tablero {
    
    private Coordenada[][] tablero;

    public Tablero()
    {
        tablero = new Coordenada[8][8];
        for (Abscisa x : Abscisa.values()){
            for(int y=0; y<=7; y++){
                tablero[x.getValue()][y] = new Coordenada(x,y);
            }
        }
    }

    public boolean moverFicha(Coordenada origen,
            Coordenada destino) {

        if(!origen.hayFicha())
            return false;

        if(!validar_diferencia_posicion(origen, destino))
            return false;

        if(destino.hayFicha())
            if(!validar_diferencia_color(origen, destino))
                return false;

        if(!origen.getFicha().validarCoordenada(origen, destino,this))
            return false;

        return true;
    }

    public boolean validar_recorrido_diagonal(Coordenada origen,
            Coordenada destino) {
        byte x1 = origen.getX().getValue();
        byte x2 = destino.getX().getValue();
        byte y1 = origen.getY();
        byte y2 = destino.getY();
        byte incrementadorx = determinar_incrementador(x1,x2);
        byte incrementadory = determinar_incrementador(y1,y2);
        while(x1 != x2 && y1!=y2) {
            x1 += incrementador;
            y1 += incrementador;
            if(tablero[x1][y1].getFicha() != null) {
                if(tablero[x1][y1].getFicha().getColor == 
                        origen.getFicha().getColor())
                    return false;
                if(x1 == x2)
                    return true;
                else
                    return false;
            }
        }

    }

    public boolean validar_recorrido_vertical(byte y1, byte y2,
           byte x, boolean color) {
        byte incrementador = determinar_incrementador(y1,y2);

        while(y1 != y2) {
            y1 += incrementador;
            if(tablero[x][y1].getFicha() != null){
                if(tablero[x][y1].getFicha().getColor() == color)
                    return false;
                if(y1==y2)
                    return true;
                else
                    return false;
            }
        }
    }

    public boolean validar_recorrido_horizontal(byte x1, byte x2, byte y) {
        byte incrementador = determinar_incrementador(x1,x2);
        while(x1 != x2) {
            x1 += incrementador;
            if(tablero[x1][y].getFicha() != null){
                if(tablero[x1][y].getFicha().getColor() == color)
                    return false;
                if(x1==x2)
                    return true;
                else
                    return false;
            }
        }
    }

    private byte determinar_incrementador(byte x1, byte x2) {
        if(x1 > x2)
            return -1;
        else
            return 1;
    }

    public boolean validar_diferencia_posicion(Coordenada primera,
            Coordenada segunda) {
        if (primera.getX().equals(segunda.getX()) &&
                primera.getY == segunda.getY()){
            return false;
        } else {
            return true;
        }
    }

    public boolean validar_diferencia_color(Coordenada primera,
            Coordenada segunda) {
        return !(primera.getFicha().getColor() == segunda.getFicha().getColor());
    }
}

