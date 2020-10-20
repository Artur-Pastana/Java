package Cap21.estruturadedados;

public class FilaTeste {
    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<>();

        //utilizando o método enqueue
        fila.enqueue(-1);
        fila.mostrar();
        fila.enqueue(0);
        fila.mostrar();
        fila.enqueue(1);
        fila.mostrar();
        fila.enqueue(2);
        fila.mostrar();

        try {
            int removerItem;
            while (true) {
                removerItem = fila.dequeue();
                System.out.printf("%n%d dequeue%n", removerItem);
                fila.mostrar();
            }
        } catch (EmptyListException emptyListException) {
            //TODO: handle exception
            emptyListException.printStackTrace();
        }
    }
}