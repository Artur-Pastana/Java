package Cap7.ArraysBidimencionais;

public class ArrayBid {
   private static final String OS_VALORES_DO_ARRAY1 = "Os valores do array1:";

public static void main(final String[] args) {
       // declarando um array
       final int[][] b = { { 1, 2 }, { 1, 2, 3 } };// inicializando um array bidimencional

       // criando apartir de expressão de criação
       final int[][] array = new int[3][4];// cria uma matriz 3 por 4
       /*
        * Nesse caso, utilizamos os valores literais 3 e 4 para especificar o número de
        * linhas e o número de colunas, respectivamente, mas isso não é necessário.
        * Programas também podem utilizar variáveis para especificar as dimensões do
        * array, porque new cria arrays em tempo de execução, não em tempo de
        * compilação. Os elementos de um array multidimensional são inicializados
        * quando o objeto array é criado.
        */

       final int[][] matriz = new int[2][];// cria duas linhas
       matriz[0] = new int[5];// cria na linha 1, 5 colunas
       matriz[1] = new int[3];// cria na linha 2, 3 colunas

       // Exemplo de array bidimensional: exibindo valores de elemento
       final int[][] array1 = { { 1, 2, 3 }, { 4, 5, 6 } };
       final int[][] array2 = { { 1, 2 }, { 3 }, { 4, 5, 6 } };

       System.out.println(OS_VALORES_DO_ARRAY1);
       imprimirMatriz(array1);

       System.out.println("\nOs Valores do array2:");
       imprimirMatriz(array2);

   }

   public static void imprimirMatriz(final int[][] matriz) {
       //faz um loop pelas linhas da matriz
       for(int i = 0; i < matriz.length; i++){

           //faz um loop pelas colunas da matriz
           for(int j = 0; j < matriz[i].length; j++){
               System.out.printf("%d ", matriz[i][j]);
           }
           System.out.println();
       }
   }
}