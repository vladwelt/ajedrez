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

    public boolean moverFicha(Coordenada posicion_antigua,
            Coordenada posicion_nueva) {

        if(!posicion_antigua.hayFicha())
            return false;

        if(!validar_diferencia_posicion(posicion_antigua, posicion_nueva))
            return false;

        if(!posicion_antigua.getFicha().validarCoordenada(posicion_nueva))
            return false;

        if(posicion_nueva.hayFicha())
            if(!validar_diferencia_color(posicion_antigua,posicion_nueva))
                return false;

        if(validarRecorrido(coordenada_antigua)) {
        }
        
    }

    public boolean validar_recorrido_diagonal(Coordenada posicion1,
            Coordenada posicion2) {
        if(valor_absoluto( posicion1.getX().getValue()-
                    posicion2.getX().getValue() ) == 
                valor_absoluto( posicion1.getY()-
                    posicion2.getY() ) ) {
                return true;
            }
    }

    public boolean validar_recorrido_recto(Coordenada posicion1,
           Coordenada posicion2) {
        if(posicion1.getX().equals(posicion2.getX()) || 
                posicion1.getY() == posicion2.getY())
            return true;
    }

    public boolean validar_posicion_l(Coordenada posicion1,
           Coordenada posicion2) {
        if(posicion1.getX().equals(posicion2.getX()))
            return false;
        if(posicion1.getY == posicion2.getY())
            return false;

        int diferencia = valor_absoluto(posicion1.getX().getValue() - 
            posicion2.getX().getValue());
        diferencia += valor_absoluto(posicion1.getY()-posicion2.getY());
        
        if(diferencia == 3)
            return true;
        else
            return false;
    }

    public boolean validar_camina(Coordenada posicion1,
            Coordenada posicion2) {
        if (validar_diferencia())
            return false;

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

    public byte valor_absoluto(byte numero){
        if(numero < 0)
            return numero * -1;
        return numero;
    }
}

