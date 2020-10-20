package Cap4.repeticao;

import java.util.Scanner;

public class Enquanto {
    public static void main(String[] args) {
        //cria um objeto scanner para obter a entrada do usuário
        Scanner sc = new Scanner(System.in);

        //fase de inicialização das variaveis
        int total = 0;//inicializa a soma das notas inseridas pelo usuário
        int cont = 1;//inicializa o nº da nota a ser inserida

        //fase de processamento que utiliza repetição controlada por contador
        while (cont <= 10) {//fazer o loop 10 vezes
            System.out.println("entre com a nota "+cont+"º");//prompt
            int nota = sc.nextInt();//insere a proxima nota
            total += nota;//add notas ao total
            cont += 1;//incrementa um ao contador
        }
        int mediaTurma = total/10;
        System.out.printf("%ntotal de todas as notas é : %d%n",total);
        System.out.printf("Media da turma é : %d%n",mediaTurma);
    }
}