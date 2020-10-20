package Cap4.repeticao;

import java.util.Scanner;

public class Enquanto2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        //inicialização
        int totNotas = 0;
        int cont = 0;
        //fase do processamento
        System.out.printf("entre com nota %dº ou -1 pra sair%n",cont+1);
        int notas = sc.nextInt();
        //faz um loop até ler o valor de sentinela inserido pelo usuário
        while (notas != -1) {
            totNotas += notas;
            cont += 1;

            //solicita a entrada e lê a proxima nota fornecida pelo usuário
            System.out.printf("entre com %dº nota ou -1 pra sair%n",cont+1);
            notas = sc.nextInt();
        }
        //fase de termino
        //se usuário pelo menos um nota 
        if (cont != 0) {
            //usa o numero com ponto decimal para calcular a media
            double media = (double)totNotas/cont;
            //exibe o total e a media com dois digitos de precisão
            System.out.printf("%nTotal de %d notas foram inseridas é :%d%n",cont,totNotas);
            System.out.printf("Media da turma é : %.2f%n",media);
        }else{
            System.out.println("nenhuma nota foi inserida");
        }
    }
}//fim da classe 