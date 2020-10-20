package Cap16.Conjuntos;

import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class SorteSet {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String[] cores = {"yellow", "green", "black", "tan", "grey",
        "white", "orange", "red", "green"};
       /* System.out.println("entre com as cores na matriz");
        for(int i = 0; i < cores.length; i++ ){
            System.out.printf("Digite a %dº Cor%n",(i+1));
            cores[i] = input.nextLine();
        }*/
        SortedSet<String> arvore = new TreeSet<>(Arrays.asList(cores));
        System.out.printf("sorted set:%n");
        mostrarSet(arvore);

        // obtém headSet com base em "orange"
        System.out.printf("headSet (\"orange\"):  ");
        mostrarSet(arvore.headSet("orange"));

        //ontém tailSet baseado em orange
        System.out.printf("tailSet(\"orange\"):  ");
        mostrarSet(arvore.tailSet("orange"));

        // obtém primeiro e último elementos
        System.out.printf("first: %s%n", arvore.first() );
        System.out.printf("last : %s%n", arvore.last() );
    }
    // envia SortedSet para a saída usando a instrução for aprimorada
    private static void mostrarSet(SortedSet<String> set) {
        for (String valor : set) {
            System.out.printf("%s ", valor);
        }
        System.out.println();
    }
}