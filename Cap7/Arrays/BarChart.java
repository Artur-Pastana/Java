package Cap7.Arrays;

public class BarChart {
    public static void main(String[] args) {
        
        int[] vetor = {10,15,20,5,50,40,1,2,4,2,1};

        System.out.println("Distribuição de Notas");

        //para cada elemento de array, gera saida de uma barra do grafico
        for(int i = 0; i < vetor.length; i++){

            //gera a saida do rotulo de barra ("00-09",...., "90-99","100")
            if (i == 10) {
                System.out.printf("%5d: ",100);
            }
            else{
                System.out.printf("%02d-%02d: ", i*10, i*10+9);
            }

            //imprime a barra de asterisco
            for(int j = 0; j < vetor[i]; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}