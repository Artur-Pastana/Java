package Cap16.Colecoes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort1 {
    public static void main(String[] args) {
        //cria e exibe uma lista contendo o naipes das cartas
        String[] cartas = {"Copas","Pauos","Ouro","Espadas"};

        List<String> lista = Arrays.asList(cartas);
        System.out.printf("Array não ordenado: %s%n",lista);

        Collections.sort(lista);
        System.out.printf("Lista ordenada: %s%n", lista);
        
    }
}