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
       this.add(tabla,"Center");
       this.add(instructor,"South");
       this.add(new JPanel(),"East");
       this.add(new JPanel(),"West");
       this.setTitle("Ajedrez simplificado v1.0");
       this.setSize(600,600);
       setLocationRelativeTo(null);
       setVisible(true);
    }
}
