package Cap7.Arrays;

public class StundePoll {
    public static void main(String[] args) {
        
        //array de respostas dos alunos
        int[] respostas = { 1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 2, 3, 5, 2, 10 };

        int[] fq = new int[6];//vetor de contadores de frequencia

        for(int i = 0; i < respostas.length; i++){
            try {
                ++fq[respostas[i]];
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println(ex); // invoca o metodo tostring
                System.out.printf("  resporstas[%d] = %d%n%n",i, respostas[i]);
            }
        }

        System.out.printf("%s%10s%n","Ratting ","Frequencia");

        //gera a saida do valor de cada elemento do array
        for(int rating = 1; rating < fq.length; rating++){
            System.out.printf("%6d%10d%n",rating,fq[rating]);
        }

    }
}