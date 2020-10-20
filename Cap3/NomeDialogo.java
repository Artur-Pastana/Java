package Cap3;

import javax.swing.JOptionPane;

public class NomeDialogo {
    public static void main(String[] args) {
        //pede para o usuário inserir um nome
        String nome = JOptionPane.showInputDialog("digite seu nome\n");

        //cria a mensagem
        String mensagem = String.format("bem vindo %s, ao visual studio%n", nome);

        //exibe a mensagem para cumprimentar o usuário pelo nome
        JOptionPane.showMessageDialog(null, mensagem);
    }
    
}