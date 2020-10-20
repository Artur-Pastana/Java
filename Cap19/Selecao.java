package Cap19;

import java.security.SecureRandom;
import java.util.Arrays;

public class Selecao {
    public static void main(String[] args) {

        SecureRandom radom = new SecureRandom();

        int[] lista = new int[10];

        for (int i = 0; i < lista.length; i++) {
            lista[i] = 10 + radom.nextInt(90);
        }

        System.out.printf("lista original: %n%s%n", Arrays.toString(lista));
        selectionSort(lista);
        System.out.printf("lista original: %n%s%n", Arrays.toString(lista));
        
    }

    // classifica o array utilizando a classificação por seleção
    public static void selectionSort(int[] array) {
        
        //faz um loop sobre array.lenght - 1 elementos
        for (int i = 0; i < array.length - 1; i++) {
            
            int smallest = i;//primeiro indice do array remanescente
            
            // faz um loop para localizar o índice do menor elemento
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[smallest]) {
                    smallest = j;
                }
            }
            trocar(array, i, smallest);
            imprimirPassagem(array ,i + 1, smallest);
        }
    }

    private static void trocar(int[] array, int primeiro, int segundo) {
            
        int temp = array[primeiro];     //armazena o primeiro em temp
        array[primeiro] = array[segundo];//substitui o primeiro pelo segundo
        array[segundo] = temp;          //coloca o temp no segundo
        
    }

    private static void imprimirPassagem(int[] array, int pass, int index) {
        System.out.printf("after pass %2d", pass);

        //saida de elementos ate o item selecionado
        for (int i = 0; i < index; i++) {
            System.out.printf("%d ", array[i]);
        }
        System.out.printf("%d* ", array[index]);//indica a troca

        //termina de gerar  a aida do array
        for (int i = index + 1; i < array.length; i++) {
            System.out.printf("%d ", array[i]);
        }

        System.out.printf("%n                 ");//para alinhamento

        //indica a qtd do array que é classificado
        for (int i = 0; i < pass; i++) {
            System.out.printf("--  ");
        }
        System.out.println();
    }
}