package Cap21.estruturadedados;

public class ListaTeste {
    
    public static void main(String[] args) {
        List<Integer> lista = new List<>();

        lista.inserirBack(-1);
        lista.mostrar();
        lista.inserirBack(0);
        lista.mostrar();
        lista.inserirFront(1);
        lista.mostrar();
        lista.inserirFront(5);
        lista.mostrar();

        try {
            int removerItem = lista.removerPrimeiro();
            System.out.printf("%n%d remove%n", removerItem);
            lista.mostrar();

        } catch (EmptyListException emptyListException) {
            emptyListException.printStackTrace();
        }
    }
}