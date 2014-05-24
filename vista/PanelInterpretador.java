package ajedrez;

import javax.swing.*;
import java.awt.*;

class PanelInterpretador extends JPanel {
    
    private JTable tirosDados;
    private JTextField entradaTexto;
    private JScrollPane panelScroll;
    private final String[] nombresColumnas = {"movida","blancas","negras"};

    public PanelInterpretador(Tablero _tabla){
        super(new BorderLayout());
        tirosDados = new JTable( new Object[3][4] , nombresColumnas );
        entradaTexto = new JTextField();
        panelScroll = new JScrollPane(tirosDados);
        this.add(panelScroll,BorderLayout.CENTER);
        this.add(entradaTexto,BorderLayout.SOUTH);
    }
}
