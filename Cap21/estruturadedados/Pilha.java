package Cap21.estruturadedados;

public class Pilha<T> extends List<T> {

    //construtor
    public Pilha(){
        super("Pilha");
    }

    //adciona objeto a lista
    public void push(T objeto) {
        inserirFront(objeto);
    }

    //remove objeto da pilha
    public T pop() throws EmptyListException{
        
        return removerPrimeiro();
    }
    
}