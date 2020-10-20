package Cap21.estruturadedados;

public class Fila<T> {
    
    private List<T> fila;

    public Fila(){
        fila = new List<T>("fila");
    }

    //adicionar o objeto à fila
    public void enqueue(T objeto) {
        fila.inserirBack(objeto);
    }

    //remove o objeto da fila
    public T dequeue() throws EmptyListException{
        return fila.removerPrimeiro();
    }

    //determina se a fila está vazia
    public boolean isEmpty() {
        //System.out.println("Fila vazia!");
        return fila.isEmpty();
    }

    //gera a saida do conteudo
    public void mostrar() {
        fila.mostrar();
    }
}