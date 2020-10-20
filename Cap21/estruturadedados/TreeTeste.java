package Cap21.estruturadedados;

import java.security.SecureRandom;

public class TreeTeste {
    public static void main(String[] args) {
        
        Tree<Integer> arvore = new Tree<>();
        SecureRandom numRandom = new SecureRandom();

        //insere 10 valores aleatórios de 0 a 99 na arvore
        for (int i = 0; i <=10; i++) {
            int valor =  numRandom.nextInt(100);
            System.out.printf("%d ", valor);
            arvore.inserirNo(valor);
        }

        System.out.printf("%nPre Ordem%n");
        arvore.preOrdemTransversal();

        System.out.printf("%nEm Ordem%n");
        arvore.emOrdemTransversal();

        System.out.printf("%nPós Ordem%n");
        arvore.posOrdemTransversal();

        System.out.println();

    }
}