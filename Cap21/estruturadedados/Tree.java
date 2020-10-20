package Cap21.estruturadedados;

public class Tree<T extends Comparable<T>> {
    
    private TreeNode<T> root;

    // construtor inicializa uma Tree de inteiros vazia
    public Tree(){
        root = null;
    }

    // insere um novo nó na árvore de pesquisa binária
    public void inserirNo(T valor) {
        if (root == null) {
            root = new TreeNode<T>(valor);//cria o nó raiz
        }
        else{
            root.inserir(valor);//chama o método inserir de treeNode
        } 
    }

    public void preOrdemTransversal() {
        preOrdem(root);
    }

    // método recursivo para realizar percurso na pré-ordem
    private void preOrdem(TreeNode<T> node) {
        if (node == null){
            return;
        }
        System.out.printf("%s ", node.dado);
        preOrdem(node.esquedoNode);
        preOrdem(node.direitoNode);
    }

    // inicia percurso na ordem
    public void emOrdemTransversal() {
        emOrdem(root);
    }

    //método recursivo para acesso em ordem
    private void emOrdem(TreeNode<T> node) {
        if (node == null) {
            return;
        }
        emOrdem(node.esquedoNode);
        System.out.printf("%s ", node.dado);
        emOrdem(node.direitoNode);
    }

    //método recursivo para aceso em pós ordem
    private void posOrdem(TreeNode<T> node) {
        if (node == null) {
            return;
        }
        posOrdem(node.esquedoNode);
        posOrdem(node.direitoNode);
        System.out.printf("%s ", node.dado);
    }

    public void posOrdemTransversal() {
        posOrdem(root);
    }

}