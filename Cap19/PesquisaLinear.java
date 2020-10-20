package Cap19;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

public class PesquisaLinear {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SecureRandom radom = new SecureRandom();

        int[] data = new int[1023];
        
        for (int i = 0; i < data.length; i++) {
            data[i] = 10 + radom.nextInt(900);
        }

        System.out.printf("%s%n%n", Arrays.toString(data));

        System.out.print("Please enter an integer value (-1 to quit): ");
        int valor = sc.nextInt();

        // insere repetidamente um inteiro; -1 termina o programa
        while (valor != -1) {
            int pos = pesquisaLinear(data, valor);

            if (pos == -1) {
                System.out.printf("%d não encontrado na lista%n", valor);
            }
            else{
                System.out.printf("%d encontrado na posição %dº%n", valor,(pos+1));
            }

            //obtém a entrada do usuário
            System.out.printf("entre com outro valor ou digite (-1 pra sair)");
            valor = sc.nextInt();
        }
    }

    public static int pesquisaLinear(int data[], int chave) {
        
        //faz um loop pelo array sequencialmente
        for(int i = 0; i < data.length; i++){
            if (data[i] == chave) {
                return i;
            }
        }
        return -1;
    }
}