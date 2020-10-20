package Cap16.Conjuntos;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetTeste {
    
    public static void main(String[] args) {
        
        //cria e exibe uma List<String>
        String[] cores = {"azul","verde","amarelo","vermelho","preto","branco","laranja","roxo","rosa","azul"};
        List<String> lista = Arrays.asList(cores);
        System.out.printf("lista: %s", lista);
        System.out.println();

        // elimina duplicatas, então imprime os valores únicos
        mostrarDuplicatas(lista);
        
    }

    private static void mostrarDuplicatas(Collection<String> valores) {
        Set<String> set = new HashSet<>(valores);

        System.out.printf("%nNonduplicates are: ");

        for (String valor : set) {
            System.out.printf("%s ", valor);
        }

        System.out.println();
    }
}