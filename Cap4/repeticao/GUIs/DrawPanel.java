package Cap4.repeticao.GUIs;

import javax.swing.JPanel;
import java.awt.Graphics;

public class DrawPanel extends JPanel {
    
    //desenha um x apartir dos cantos do painel
    public void paintComponent(Graphics g) {
        //chama pintarComponente para assegurar que é o painel é exibido corretamente
        super.paintComponents(g);

        int wigth = getWidth();//largura total
        int heigth = getHeight();//altura total

        //desenha uma linha a apartir do canto superior esq até inferior direito
        //g.drawLine(0, 0, wigth, heigth);

        //desenha uma linha a partir do canto inferior esq até o superior direito
        //g.drawLine(0, heigth, wigth, 0);

        for(int i = 0; i <= 15; i++){
            g.drawLine(i*i, i*i, wigth, heigth);
            g.drawLine(i*i, heigth, wigth, i*i);
            g.drawLine(wigth, 0, 0, heigth);
        }
    }

}