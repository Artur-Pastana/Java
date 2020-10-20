package Cap21.estruturadedados;

// classe para representar um nó em uma lista
class ListNode<T> {
    
    // membros de acesso de pacote; List pode acessá-los diretamente
    T dado;// dados para esse nó
    ListNode<T> proxNode;//referência para o proximo nó da lista

    //construtor que cria um ListNode que referência um objeto
    ListNode(T objeto){
        //objeto = null;
        this(objeto, null);
    }

    // construtor cria ListNode que referencia o objeto
    // especificado e o próximo ListNode
    ListNode(T objeto, ListNode<T> node){
        this.dado = objeto;
        this.proxNode = node;
    }

    //retorna referencia aos dados do nó
    T getDado() {
        return dado;
    }

    //retorna a referencia ao proximo nó da lista
    ListNode<T> getProx(){
        return this.proxNode;
    }
}//fim da classe ListNode<T>