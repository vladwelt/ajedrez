package ajedrez;

import javax.swing.*;
import java.awt.*;

class Ajedrez extends JFrame {

    private PanelTabla tabla;
    private PanelInterpretador instructor;
    private Tablero tablero;

    public Ajedrez() {
       tablero = new Tablero();
       instructor = new PanelInterpretador(tablero);
       tabla = new PanelTabla(tablero);
       this.add(tabla,"North");
       this.add(instructor,"Center");
       this.setTitle("Ajedrez simplificado v1.0");
       this.setSize(800,800);
       setLocationRelativeTo(null);
       setVisible(true);
    }
}
