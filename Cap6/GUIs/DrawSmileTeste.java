package Cap6.GUIs;

import javax.swing.JFrame;

public class DrawSmileTeste {
    public static void main(String[] args) {
        
        DrawSmile panel = new DrawSmile();
        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(920 , 460);
        application.setVisible(true);
    }
}