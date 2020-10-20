package Cap21.estruturadedados;

public class Pilhateste {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<>();

        pilha.push(-1);
        pilha.mostrar();
        pilha.push(-2);
        pilha.mostrar();
        pilha.push(-3);
        pilha.mostrar();

        try {
            int removerItem;

            while (true) {
                removerItem = pilha.pop();
                System.out.printf("%n%d removido%n", removerItem);
                pilha.mostrar();
            }
        } catch (EmptyListException emptyListException) {
            //TODO: handle exception
            emptyListException.printStackTrace();
        }
    }
}