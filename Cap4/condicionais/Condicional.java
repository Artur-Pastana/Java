package Cap4.condicionais;

import javax.swing.JOptionPane;

public class Condicional {
    public static void main(String[] args) {
        int nota;

        nota = Integer.parseInt(JOptionPane.showInputDialog("digite uma nota"));

        System.out.println(nota >= 50 ? "aprovado":"reprovado");

        if (nota >= 60) {
            System.out.println("aprovado");
            JOptionPane.showMessageDialog(null, "aprovado!!!!");
        }else{
            System.out.println("reprovado");
            JOptionPane.showMessageDialog(null, "reprovado");
        }
        //instruções de if aninhados
        if (nota >= 90) {
            JOptionPane.showMessageDialog(null, "A");
        }else if (nota >= 80) {
            JOptionPane.showMessageDialog(null, "B");
        }else if (nota >= 70) {
            JOptionPane.showMessageDialog(null, "C");
        }else if (nota >= 60) {
            JOptionPane.showMessageDialog(null, "D");
        }else{
            JOptionPane.showMessageDialog(null, "F");
        }
    }
}