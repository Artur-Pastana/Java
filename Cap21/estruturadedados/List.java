package Cap21.estruturadedados;

public class List<T> {
    
    private ListNode<T> firstNode;
    private ListNode<T> lastNode;
    private String nome;//string como "lista" usada na impressão

    //verifica se a pilha está vazia
    public boolean isEmpty(){
        return firstNode == null; // retorna true se a lista estiver vazia
    }

    // construtor cria List vazia com "list" como o nome
    public List(){
        //this.nome = "lista";
        this("lista");
        
    }

    // construtor cria uma List vazia com um nome
    public List(String nome){
        this.nome = nome;
        firstNode = lastNode = null;
    }

    // insere o item na frente de List
    public void inserirFront(T item) {
        if (isEmpty()) {
            firstNode = lastNode = new ListNode<T>(item);
        }
        else{
            firstNode = new ListNode<T>(item, firstNode);
        }
    }

    //insere o item no final da lista
    public void inserirBack(T item) {
        if (isEmpty()) {
            firstNode = lastNode = new ListNode<T>(item);
        }
        else{
            lastNode = lastNode.proxNode = new ListNode<T>(item);
        }
    }

    //remove o primeiro nó da lista
    public T removerPrimeiro() throws EmptyListException {
        if (isEmpty()) {
            throw new EmptyListException(this.nome);
        }
        
        T removerItem = firstNode.dado;//recupera dados sendo removidos

        //atualiza referencias first e last 
        if (firstNode == lastNode){

            firstNode = lastNode = null;
        }
        else{
            firstNode = firstNode.proxNode;
        }

        return removerItem;//retorna dados de nó removidos
    }

    //remove o ultimo nó d lista
    public T removerUltimo() throws EmptyListException{
        if (isEmpty()) {
            throw new EmptyListException(this.nome);
        }

        T removerItem = lastNode.dado;

        if (firstNode == lastNode) {
            firstNode = lastNode = null;
        }
        else{//localiza o novo ultimo nó
            ListNode<T> current = firstNode;

            // faz loop enquanto o nó atual não referencia lastNode
            while (current.proxNode != lastNode) {
                current = current.proxNode;
            }
            lastNode = current;
            current.proxNode = null;
        }

        return removerItem;

    }

    public void mostrar() {
        if (isEmpty()) {
            System.out.printf("%s Vazia%n",this.nome);
            return;
        }
        System.out.printf("The %s is: ", this.nome);

        ListNode<T> current = firstNode;

        // enquanto não estiver no fim de lista, gera saída dos dados do nó atual
        while (current != null) {
            System.out.printf("%s ", current.dado);
            current = current.proxNode;
        }
        System.out.println();
    }
}//fim da classe list