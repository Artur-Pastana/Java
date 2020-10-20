package Cap16.Colecoes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PesquisaBinaria {
    public static void main(String[] args) {
        
        String[] cores = {"vermelho","Azul","verde","Rosa","Amarelo","Preto","Branco","laranja"};
        
        List<String> lista = new ArrayList<>(Arrays.asList(cores));
        Collections.sort(lista);
        System.out.printf("Lista Ordena: %s%n",lista);
        
        //pesquisa vários valores na lista
        mostrarPesquisa(lista, "vermelho");
        mostrarPesquisa(lista, "Vermelho");
        mostrarPesquisa(lista, "Azul");
        mostrarPesquisa(lista, "verde");


    }

    private static void mostrarPesquisa(List<String> lista, String chave) {
        
        int resultado = 0;
        System.out.printf("%nProcurando por: %s%n", chave);
        resultado = Collections.binarySearch(lista, chave);

        if (resultado >= 0) {
            System.out.printf("Found at index %d%n", resultado);
        }
        else{
            System.out.printf("Not Found (%d)%n",resultado);
        }
    }
}