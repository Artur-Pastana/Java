package Cap5.Guis;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TesteShapes {

    public static void main(String[] args) {
        
        //obtém a escolha do usuario
        int choice = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 - para retangulos"+
        "2 - ovais"));

        //cria o painel de entrada do usuário
        Shapes panel = new Shapes(choice);

        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(920,460);
        application.setVisible(true);
    }
}