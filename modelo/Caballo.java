package ajedrez;

import static java.lang.Math.abs;

class Caballo extends Pieza {

    public boolean validarMovimiento(Coordenada origen,
            Coordenada destino) {
        if(posicion1.getX().equals(posicion2.getX()))
            return false;
        if(posicion1.getY == posicion2.getY())
            return false;
        if(getDiferencia(posicion1,posicion2) == 3)
            return true;
        else
            return false;
    }
    
    private byte getDiferencia(Coordenada posicion1,
           Coordenada posicion2) {
        int diferencia = Math.abs(posicion1.getX().getValue() - 
            posicion2.getX().getValue());
        diferencia += Math.abs(posicion1.getY()-posicion2.getY());
        return diferencia;
    }
}
