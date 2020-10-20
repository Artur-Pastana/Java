package Cap9.GUIs;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class LabelDemo {
    
    public static void main(String[] args) {
        
        //cria um rótulo com texto simples
        JLabel norteLabel =  new JLabel("Norte");

        //cria um icone de uma imagem para podemos colocar em um jlabel
        ImageIcon labelIcon = new ImageIcon("phi.jpg");

        //cria um rótulo com um icon em vez de texto
        JLabel centroLabel = new JLabel(labelIcon);

        //cria outro rótulo com um icon
        JLabel sulLabel = new JLabel(labelIcon);

        //configura o rótulo para exibir texto(bem como um icone)
        sulLabel.setText("Sul");

        //cria um quadro para armazenar os rótulos
        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.setBackground(Color.BLACK);

        // adiciona os rótulos ao frame; o segundo argumento especifica
        // onde adicionar o rótulo no frame
        application.add(norteLabel, BorderLayout.NORTH);;
        application.add(centroLabel, BorderLayout.CENTER);
        application.add(sulLabel, BorderLayout.SOUTH);

        application.setSize(960, 420);
        application.setVisible(true);
    }
}