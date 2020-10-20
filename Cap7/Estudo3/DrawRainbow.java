package Cap7.Estudo3;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawRainbow extends JPanel{
    
    //define as cores indigo e violeta
    private final static Color VIOLETA = new Color(128,0,128);
    private final static Color INDIGO = new Color(75,0,130);

    // Cores a utilizar no arco-íris, iniciando da parte mais interna
    // As duas entradas em branco resultam em um arco vazio no centro
    private final Color[] cores = {Color.WHITE, Color.WHITE, VIOLETA,INDIGO, Color.BLUE, 
                            Color.GREEN, Color.YELLOW, Color.ORANGE, Color.RED};
    
    public DrawRainbow(){
        setBackground(Color.BLACK);//configura o fundo da tela para branco
    }
    //desenha um arco iris usando arco ecocêntrico
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int rad = 20;//raio de um arco

        // desenha o arco-íris perto da parte central inferior
        int centroX = getWidth()/2;
        int centroY = getHeight()-10;

        //desenha o arco preenchido com o mais externo
        for(int i = 0; i < cores.length; i++){
            // configura a cor para o arco atua
            g.setColor(cores[i-1]);

            // preenche o arco de 0 a 180 graus
            g.fillArc(centroX - i *rad, centroY - 1 * rad, i * rad * 2, i * rad, 0, 180);
        }
    }
}