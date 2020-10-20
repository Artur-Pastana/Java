package Cap16.Colecoes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Algo1 {
    
    public static void main(String[] args) {
        String[] cores = {"rosa","amarelo","verde","vermelho"};
        List<String> lista = Arrays.asList(cores);
        ArrayList<String> lista1 = new ArrayList<>();

        lista1.add("preto");//add ao final da lista
        lista1.add("cinza");
        lista1.add("rosa");

        System.out.println("Add todos, a lista1");

        for (String s : lista1) {
            System.out.printf("%s ",s);
        }
        System.out.println();

        Collections.addAll(lista1, cores);

        System.out.printf("%nAfter addAll, list2 contains: ");
        //exibe os elementos da lista1

        for (String el  : lista1) {
            System.out.printf("%s ",el);
        }
        System.out.println();

        //obtém a frequencia de rosa
        int frequencia = Collections.frequency(lista1, "rosa");
        System.out.printf("%nfrequencia de rosa na lista1 = %d%n", frequencia);

        //verifica se as lista tem elementos em comum
        boolean comum = Collections.disjoint(lista, lista1);
        System.out.printf("lista e lista1 %s elementos em comum%n", comum ?"não possui":"possui");
    }
}