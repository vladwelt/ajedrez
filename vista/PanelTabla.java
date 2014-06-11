package ajedrez;

import javax.swing.*;
import java.awt.*;

class PanelTabla extends JPanel {

    private JButton[][] tabla;
    private Tablero tablero;

    public PanelTabla(Tablero _tabla) {
        tablero = _tabla;
        super(new GridLayout(8,8));
        tabla = new JButton[8][8];
        for(Abscisa posicion : Abscisa.values()){
            for(int y=0; y<=7; y++) {
                int x = posicion.getValue();
                tabla[x][y] = new JButton();
                this.add(tabla[x][y]);
            }
        }
        pintarTabla();
    }

    private void pintarTabla() {
        boolean tipoColor = false;
        for(Abscisa posicion : Abscisa.values()){
            for(int y=0; y<=7; y++){
                if(tipoColor)
                    tabla[posicion.getValue()][y].setBackground(Color.WHITE);
                else
                    tabla[posicion.getValue()][y].setBackground(Color.DARK_GRAY);
                tipoColor = !tipoColor;
            }
            tipoColor = !tipoColor;
        }
    }
}
