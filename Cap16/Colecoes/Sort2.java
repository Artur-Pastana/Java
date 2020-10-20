package Cap16.Colecoes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort2 {
    public static void main(String[] args) {
        
        String[] nomes = {"Artur","Aslan","Iris","Anne","Andreza","Maria"};
        List<String> lista = Arrays.asList(nomes);

        System.out.printf("Lista normal: %s%n", lista);

        Collections.sort(lista);
        System.out.printf("Lista ordenada: %s%n", lista);

        Collections.sort(lista, Collections.reverseOrder());
        System.out.printf("Lista lista ordenada reversamente: %s%n", lista);
    }
}