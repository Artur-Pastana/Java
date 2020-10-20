package Cap18.EstudoDeCaso;

import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Dimension;
//import javax.swing.plaf.DimensionUIResource;

public class FractalJPanel extends JPanel {

    private Color cor; //armazena cor utilizada para desenhar o fractal
    private int level;//armazena o nivel atual do fractal

    private static final int LARGURA = 400;
    private static final int ALTURA = 400;

    // configura o nível do fractal inicial com o valor especificado
    // e configura as especificações do JPanel
    public FractalJPanel(int currentLevel){

        cor = Color.BLUE;// inicializa a cor do desenho como azul
        level = currentLevel;// configura o nível do fractal inicial
        setBackground(Color.WHITE);
        setPreferredSize(new Dimension(LARGURA, ALTURA));
    }

    // desenha o fractal recursivamente
    public void drawFractal(int level, int xA, int yA, int xB, int yB, Graphics g) {

        // caso básico: desenha uma linha conectando dois pontos dados
        if (level == 0) {
            g.drawLine(xA, yA, xB, yB);
        }
        else{// passo de recursão: determina novos pontos, desenha próximo nível

            // calcula ponto intermediário entre (xA, yA) e (xB, yB)
            int xC = (xA + xB)/2;
            int yC = (yA + yB)/2;

            // calcula o quarto ponto (xD, yD) que forma um
            // triângulo isósceles entre (xA, yA) e (xC, yC)
            // onde o ângulo direito está a (xD, yD)
            int xD = xA + (xC - xA) / 2 - (yC - yA) / 2;
            int yD = yA + (yC - yA) / 2 + (xC - xA) / 2;

            // desenha recursivamente o Fractal
            drawFractal(level - 1, xD, yD, xA, yA, g);
            drawFractal(level - 1, xD, yD, xC, yC, g);
            drawFractal(level - 1, xD, yD, xB, yB, g);
        }
    }

    // começa a desenhar o fractal
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        //desenha o padrão fractal
        g.setColor(cor);
        drawFractal(level, 100, 90, 290, 200, g);
    }

    // configura o novo nível de recursão
    public void setLevel(int currentlevel) {
        this.level = currentlevel;
    }
    public int getLevel() {
        return level;
    }
}