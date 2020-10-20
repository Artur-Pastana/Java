package Cap19;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

public class PesquisaBinaria {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        SecureRandom radom = new SecureRandom();

        int[] lista = new int[1048];//cria o array

        for (int i = 0; i < lista.length; i++) {
            lista[i] = 10 + radom.nextInt(900);
        }
        //mostrando lista original
        System.out.printf("Lista original: %s%n%n", Arrays.toString(lista));

        //mostrando lista ordenada
        Arrays.sort(lista);
        System.out.printf("lista ordenada: %s%n%n", Arrays.toString(lista));

        System.out.println("entre com o elemento ou digite (-1 para sair)");
        int elemento = input.nextInt();

        while (elemento != -1) {
            
            //realiza a pesquisa
            int loc = pesquisaBinaria(lista, elemento);

            if (loc == -1) {
                System.out.printf("%d não encontrado na lista%n", elemento);
            }
            else{
                System.out.printf("Valor: %d Econtrado na posição: %d%n", elemento,loc);
            }

            System.out.println("entre com o elemento ou digite (-1 para sair)");
            elemento = input.nextInt();
        }
        
    }

    public static int pesquisaBinaria(int[] lista, int chave) {
        
        int baixo = 0; //extremidade baixa da lista
        int alto = lista.length-1;//extremidade alta da lista
        int meio = (baixo + alto + 1)/2;//elemento do meio
        int location = -1;

        do {//faz um loop para procurar o elemento
            
            //metodo que imprime o array
            System.out.print(mostrarElementos(lista, baixo, alto));

            //gera espaços aninhandos
            for (int i = 0; i < meio; i++) {
                System.out.print("  ");
            }
            System.out.println(" * ");

            // se o elemento for localizado no me
            if (chave == lista[meio]) {
                location = meio;//a localização é o meio atual
            }
            else if (chave < lista[meio]) {//elemento é menor que o elemento do meio
                alto = meio - 1;//elimina a metade mais alta
            }
            else{//elemento é maior que o meio
                baixo = meio + 1;//elimina a metade menor
            }
            meio = (baixo + alto +1)/2;

        } while ((baixo <= alto) && (location == -1));
        
        return location;//retorna a localização da chave de pesquisa
    }

    private static String mostrarElementos(int[] lista, int baixo, int alto) {
        
        StringBuilder temp = new StringBuilder();
        
        //acrescenta espaços para alinhamento
        for (int i = 0; i < baixo; i++) {
            temp.append("   ");
        }

        for (int i = 0; i <= alto; i++) {
            temp.append(lista[i]+ " ");
        }
        return String.format("%s%n", temp);
    }


}