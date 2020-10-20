package Cap4.repeticao.GUIs;

import javax.swing.JFrame;
import javax.swing.text.AttributeSet.ColorAttribute;

public class Teste {
    
    public static void main(String[] args) {
        //cria um objeto que contém nosso desenho
        DrawPanel panel = new DrawPanel();

        //cria um novo quadro para armazenar nosso quadro
        JFrame application = new JFrame();

        //configura o frame para ser encerrado quando ele é fechado
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        application.add(panel);//add o painel ao frame
        application.setSize(920,460);
        application.setVisible(true);
        application.getColorModel();
    }
}