package Cap16.ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Colecoes {
    
    public static void main(String[] args) {
        
        //adiciona os elementos do array cores em lista
        String[] cores = {"Azul","Vermelho","Branco","Verde","Amarelo","Rosa"};
        List<String> lista = new ArrayList<>();

        for (String cor : cores) {
            lista.add(cor);
        }

        //adiciona os elementos do array coresRemovidas em listaRemovidos
        String[] coresRemovidas = {"Azul","Verde","Rosa"};
        List<String> listaRemovidos = new ArrayList<>();

        for (String cor : coresRemovidas) {
            listaRemovidos.add(cor);
        }

        //gera a saida do conteudo da lista
        System.out.println("ArrayList: ");

        for (int i = 0; i < lista.size(); i++) {
            System.out.printf("%s ",lista.get(i));
        }
        System.out.println();
        for (int i = 0; i < listaRemovidos.size(); i++) {
            System.out.printf("%s ",listaRemovidos.get(i));
        }
        System.out.println();

        //remove da lista as cores contidas em removelista
        removerCores(lista, listaRemovidos);

        //gera a saida do conteudo da lista
        System.out.println("ArrayLista depois de remover as cores");
        
        for (String cor  : lista) {
            System.out.printf("%s ",cor);
            //System.out.println(cor);
        }
        System.out.println();
    }

    private static void removerCores(Collection<String> collection1, Collection<String> collection2) {
        //obtem o iterador
        Iterator<String> iterador = collection1.iterator();

        //um loop enquanto a coleção tiver itens
        while (iterador.hasNext()) {
            if (collection2.contains(iterador.next())) {
                iterador.remove();//remove o elemento atual
            }
        }
    }
}