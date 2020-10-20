package Cap11;

import java.util.Scanner;

public class Assert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("entre com um numero entre 0 e 10");
        int num = sc.nextInt();

        //afirma que o valor é >=0 e <= 10
        assert(num >= 0 && num <= 10): "bad numero: "+num;

        System.out.printf("Vc digitou %d%n", num);
    }
}