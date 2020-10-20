package Cap14;

import java.util.Scanner;

public class Tokens {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("digite um sentença");
        String senteca = sc.nextLine();

        String[] tokens = senteca.split("");

        System.out.printf("numeros de elementos: %d%n de tokens é:%n",tokens.length);

        for (String tk : tokens) {
            System.out.println(tk);
        }
    }
}