package ajedrez;

import javax.swing.*;
import java.awt.*;

class PanelInterpretador extends JPanel {
    
    private JTable tirosDados;
    private JTextField inText;
    private JScrollPane panelScroll;
    private JPanel panelCommand;
    private final String[] nombresColumnas = {"movida","blancas","negras"};
    private Object[][] data = {{1,"d5","a4"},
        {2,"Dh6","b4"},
        {3,"Ch1","Ad2"},
        {4,"Rh3","Ad1"},
        {5,"Dh1","Th3"}};

    public PanelInterpretador(Tablero _tabla){
        super(new BorderLayout());
        tirosDados = new JTable( data , nombresColumnas );
        tirosDados.setPreferredScrollableViewportSize(new Dimension(500, 60));
        tirosDados.setFillsViewportHeight(true);
        inText = new JTextField("Command..");
        panelScroll = new JScrollPane(tirosDados);
        //panelScroll.setPreferredSize(new Dimension(560,80));
        this.add(panelScroll,BorderLayout.NORTH);
        this.add(inText,BorderLayout.SOUTH);
    } 
}
