package ajedrez;

class Rey extends Pieza {

    public boolean validarMovimiento(Coordenada origen,
            Coordenada destino) {
        if (getDiferencia(poscion1,posicion2) == 1)
            return true;
        else
            return false;
    }

    private byte getDiferencia(Coordenada posicion1,
           Coordenada posicion2) {
        int diferencia = valor_absoluto(posicion1.getX().getValue() - 
            posicion2.getX().getValue());
        diferencia += valor_absoluto(posicion1.getY()-posicion2.getY());
        return diferencia;
    }
}
