package Cap16.ArrayList;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListaTest {
    public static void main(String[] args) {
        
        //add elementos cores a lista1
        String[] cores = {"preto","vermelho","branco","verde","Azul","Prata"};
        List<String> lista1 = new LinkedList<>();

        for (String cor  : cores) {
            lista1.add(cor);//add as cores na lista1
        }

        //add elementos cores2 à lista2
        String[] cores2 = {"Ouro","Marron","laranja","Roxo","Rosa","Nude"};
        List<String> lista2 = new LinkedList<>();

        for (String cor  : cores2) {
            lista2.add(cor);//add as cores na lista2
        }

        lista1.addAll(lista2);//concatena as lista
        lista2 = null;//libera espaço

        mostrarLista(lista1);//imprime os elementos da lista1

        converterEmMaiuscula(lista1);
        mostrarLista(lista1);

        System.out.printf("%nRemover os elementos de 4 a 6...");
        removerItens(lista1, 4, 7);
        mostrarLista(lista1);
        mostrarReverso(lista1);


    }

    //imprime o conteudo da lista
    private static void mostrarLista(List<String> lista) {
        System.out.printf("%nLista:%n");

        for (String cor : lista) {
            System.out.printf("%s ",cor);
        }
        System.out.println();
    }

    //localiza objetos strings e converte em letras maiusculas
    private static void  converterEmMaiuscula(List<String> lista){
        ListIterator<String> iterador = lista.listIterator();
        
        while (iterador.hasNext()) {
            
            String cor = iterador.next();//obtem o item
            iterador.set(cor.toUpperCase());//converte em letras maiusculas
        }
    }

    //obtém sublista e utiliza método clear para excluir itens da sublista
    private static void removerItens(List<String> lista, int inicio, int fim ) {
        lista.subList(inicio, fim).clear();//remove os itens
    }

    //imprime a lista invertida
    private static void  mostrarReverso(List<String> lista) {
        
        ListIterator<String> iterador = lista.listIterator(lista.size());

        System.out.printf("Lista Reversa%n");
        while (iterador.hasPrevious()) {
            System.out.printf("%s ",iterador.previous());
        }
    }
}