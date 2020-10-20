package Cap5.repeticao2;

public class Para {
    public static void main(String[] args) {
        
        //cabeçalho da instrução for inclui inicialização
        //condição de continuação e incremento
        System.out.println();
        for (int i = 0; i < 100; i++) {
            System.out.printf("%d ", i);
        }
        System.out.println("\n");
        for (int i = 100; i >= 1; --i) {
            System.out.printf("%d ", i);
        }
        System.out.println("\n");
        for (int i = 7; i <= 77; i += 7){
            System.out.printf("%d ", i);
        }
        System.out.println("\n");
        for (int i = 20; i >= 2; i -= 2){
            System.out.printf("%d ", i);
        }
        System.out.println("\n");

    }
}