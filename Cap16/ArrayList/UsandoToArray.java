package Cap16.ArrayList;

import java.util.Arrays;
import java.util.LinkedList;

public class UsandoToArray {
    public static void main(String[] args) {
        //cria uma linkedList , add elementos e converete em array

        String[] cores = {"Preto","Azul","Vermelho"};
        LinkedList<String> links = new LinkedList<>(Arrays.asList(cores));

        links.addLast("Verde");
        links.add("Rosa");
        links.add(3, "Roxo");
        links.addFirst("Amarelo");

        cores = links.toArray(new String[links.size()]);

        System.err.println("Cores: ");

        for (String cor  : cores) {
            System.out.printf("%s ", cor);
        }
        System.out.println();
    }
}