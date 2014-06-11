package ajedrez;

class Peon extends Pieza {
    
    boolean primera_vez;

    public Peon() {
    }

    public boolean validarMovimiento(Coordenada origen, Coordenada destino,
            Tablero tablero) {
        int diferenciax = origen.getY()-destino.getY();
        int diferenciay = origen.getX().getValue()-destino.getX().getValue();
        if(diferenciax == 0) {
            if((diferenciay == -1 && !color) || (diferenciay == 1 && color)) {
                if(destino.getFicha() != null)
                    return false;
                return true;
            }
        } else if(diferenciax == 1 || diferenciax == -1) {
            if(destino.getFicha() == null)
                return false;
            if(destino.getFicha().getColor() == color)
                return false;
            if(diferenciay == -1 && !color){
                return true;
            } else if (diferenciay == 1 && color) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }

        if(primera_vez) {
            if(!color && diferenciay == -2)
                if(tablero[destino.getX().getValue()]
                        [destino.getY()-1].getFicha() == null)
                    if(destino.getFicha() == null)
                        return true;
            else if(color && diferenciay == 2)
                if(tablero[destino.getX().getValue()]
                        [destino.getY()+1].getFicha() == null)
                    if(destino.getFicha() == null)
                        return true;
        }
    }

    public boolean capturarFicha(Coordenada coordenada_nueva) {
        if (coordenada_nueva.getX() == coordenada.getX() ) {
            if ((coordenada.getY()+(1*direccion)) == coordenada_nueva.getY())
                return true;
            else if (primera_vez) {
                if (coordenada.getY()+(2*direccion) == coordenada_nueva.getY())
                    return true;
            }

        }
        else if ( coordenada_nueva.estado() ) {
            if(coordenada_nueva.getX().getValue() == coordenada.getX().getValue()+1 || 
                    coordenada_nueva.getX().getValue() == coordenada.getX().getValue()-1)
                return false;
        }
        return false;
    }
}
