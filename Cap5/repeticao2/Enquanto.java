package Cap5.repeticao2;

import java.util.Scanner;

//repetição controlada por um contador com a instrução while

public class Enquanto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cont = 1;//declara e inicializa a variável de controle do loop

        while (cont <= 100 ) {
            System.out.printf("%d ", cont);
            //++cont;
            cont++;
        }
        System.out.println("\n");

        cont = 0;

        while (cont != 90) {
            System.out.printf("%d ", cont);
            cont++;
        }
        System.out.println("\n");

        cont = 0;
        String resp = "s";
        while (resp == "s") {
            System.out.println("digite uma valor:");
            cont += sc.nextInt();
            System.out.println("deseja continuar [s -sim | n - não]");
            resp = sc.next();
        }
    }
}