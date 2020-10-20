package Cap18.EstudoDeCaso;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Fractal extends JFrame {
    
    private static final int LARGURA = 400;
    private static final int ALTURA = 480;
    private static final int MIN_LEVEL = 0;
    private static final int MAX_LEVEL = 15;

    //Configura a gui
    public Fractal(){
        super("Fractal");

        // configura levelJLabel para adicionar ao controlJPanel
        final JLabel leveJLabel = new JLabel("Level: 0");
        final FractalJPanel drawSpace = new FractalJPanel(0);

        // configura o painel de controle
        
    }

}