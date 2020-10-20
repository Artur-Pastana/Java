package Cap7.Arrays;

import java.security.SecureRandom;

public class RollDie {
    public static void main(String[] args) {
        SecureRandom numRand = new SecureRandom();
        int[] frequencia = new int[7];//array de contadores de frequencia

        //lanca o dado 6.000.000 vezes ; usa o valor do dado com indice de frequncia
        for(int roll = 1; roll < 6000000; roll++){
            ++frequencia[1 + numRand.nextInt(6)];
        }
        System.out.printf("%s%10s%n","Face","Frequencia");

        //gera a saida de cada elemento do array
        for(int face = 0; face < frequencia.length; face++){
            System.out.printf("%4d%10d%n", face, frequencia[face]);
        }
    }
}