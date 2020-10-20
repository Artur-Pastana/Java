package Cap3;

import javax.swing.JOptionPane;

public class Adicao {
    public static void main(String[] args) {
        int a;
        int b;
        int soma;

        a = Integer.parseInt(JOptionPane.showInputDialog("digite um valor\n"));
        b = Integer.parseInt(JOptionPane.showInputDialog("digite outro numero\n"));
        soma = a + b;
        JOptionPane.showMessageDialog(null,"a soma é : "+soma);
        
    }
}