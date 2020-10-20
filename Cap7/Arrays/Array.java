package Cap7.Arrays;

public class Array {
    public static void main(String[] args) {
        
        //declara uma variável array e inicializa com um objeto array
        int[] vetor = new int[10];
        int[] array = {10,25,65,65,54,58,69,87,652,451,254,62,1};//inicializando um array

        final int ARRAY_LENGHT = 10;
        int[] vet = new int[ARRAY_LENGHT];

        System.out.printf("%s%8s%n","index", "Valor");//titulos de coluna

        //gera a saida do valor de cada elemento do array
        for(int i = 0; i < vet.length; i++){
            vet[i] = 2+2*i;
            System.out.printf("%5d%8d%n",i,vet[i]);
        }


        System.out.printf("%s%8s%n","index", "Valor");//titulos de coluna

        //gera a saida do valor de cada elemento do array
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = i+1;
            System.out.printf("%5d%8d%n",i,vetor[i]);
        }

        System.out.printf("%s%8s%n","index", "Valor");//titulos de coluna

        //gera a saida do valor de cada elemento do array
        for(int i = 0; i < array.length; i++){

            System.out.printf("%5d%8d%n",i,array[i]);
        }

        int total = 0;
        for (int valor : array) {
            total += valor;
        }
        System.out.printf("Total da soma dos elementos do Array : %d%n", total);

    }
}