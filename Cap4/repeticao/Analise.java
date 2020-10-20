package Cap4.repeticao;

import java.util.Scanner;

public class Analise {
    public static void main(String[] args) {
        //cria um objeto scanner para lê dados do usuário
        Scanner sc = new Scanner(System.in);

        //inicializando as variaveis locais
        int aprovados = 0;
        int reprovados = 0;
        int cont = 1;

        //processa 10 vezes o loop while
        while (cont <= 10) {
            System.out.printf("%nEntre %dº resultado [1 - aprovado, 2 - reprovado] : ",cont);
            int resultado = sc.nextInt();

            if (resultado == 1) {
                aprovados += 1;
            }else{
                reprovados += 1;
            }
            cont += 1;
        }
        System.out.printf("Aprovados = %d%nReprovados = %d%n",aprovados, reprovados);

        if (aprovados >= 8) {
            System.out.println("Bonus devido ao professor!!!");
        }
    }
}