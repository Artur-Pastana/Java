package Cap5.Guis;

import javax.swing.JPanel;

import java.awt.Graphics;

public class Shapes extends JPanel {
    private int choice; // escolha do usuário de qual forma desenhar
    // construtor configura a escolha do usuário
    public Shapes(int userChoice){
        choice = userChoice;
    }

    // desenha uma cascata de formas que iniciam do canto superior esquerdo
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        for (int i = 0; i < 20; i++){
        // seleciona a forma com base na escolha do usuário
            switch (choice){
                case 1: // desenha retângulos
                    g.drawRect(10 + i * 5, 10 + i * 10,
                    50 + i * 10, 50 + i * 10);
                    //g.fillArc(50, 50, 50, 50, 50, 50);
                    break;
                case 2: // desenha ovais
                    g.drawOval(10 + i * 5, 10 + i * 10,
                    50 + i * 10, 50 + i * 10);
                    break;
            }
        }
    }
}
