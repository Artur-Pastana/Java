package Cap6;

import java.security.SecureRandom;

public class NumeroAleat {
    public static void main(String[] args) {
        
        SecureRandom numRando = new SecureRandom();

        for(int i = 0; i <= 10; i++){
            int valor = numRando.nextInt(100);
            System.out.printf("%d ",valor);
            System.out.println();
        }
    }
}