package Cap7.ClasseArray;

import java.util.ArrayList;

public class ArrayListCollection {
    public static void main(String[] args) {
        
        //cria um novo ArrayList de Strings com um capacidade inicial de 10
        ArrayList item = new ArrayList<>();

        item.add("Vermelho");//anexa um item no fim da lista
        item.add(0,"amarelo");//insere amarelo no indice 0

        //cabeçalho
        System.out.print("Display das cores usando for normal:\n");

        //exibe as cores na lista
        for(int i = 0; i < item.size();i++){
            System.out.printf(" %s", item.get(i));
        }

        //exibe as cores usando um for aprimorado no metodo mostrar
        mostrar(item, "\ndisplay das cores usando um for aprimorado:\n");

        item.add("green");//add green ao final da lista
        item.add("amarelo");//add amarelo no fim da lista
        mostrar(item, "lista com duas novas cores:");

        item.remove("amarelo");//remove o primeiro "amarelo"
        mostrar(item, "lista com um amarelo removido");
        
        item.remove(1);//remove o elemento no indice 1
        mostrar(item, "remove o segundo elemento da lista (green)");

        // verifica se um valor está na Lista
        System.out.printf("\"Vermelho\" %sestá na lista%n", item.contains("Vermelho") ? "": "not ");

        //exibe o numero de elementos da lista
        System.out.printf("O tamanho da lista é: %%n", item.size());

    }
    public static void mostrar(ArrayList<String> lista, String frase) {
        System.out.printf(frase);//exibe o cabeçalho

        //exibe cada elemento em itens
        for (String item : lista) {
            System.out.printf(" %s", item);
        }
        System.out.println();
    }
}