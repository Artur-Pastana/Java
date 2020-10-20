package Cap21.estruturadedados;

class TreeNode<T extends Comparable<T>> {
    //membros de acesso de pacote
    TreeNode<T> esquedoNode;
    TreeNode<T> direitoNode;
    T dado;

    // construtor inicializa os dados e os torna um nó de folha
    public TreeNode(T dadoNo){
        dado = dadoNo;
        direitoNode = esquedoNode = null;
    }

    // localiza ponto de inserção e insere novo nó; ignora os valores duplicados
    public void inserir(T valor) {
        // insere na subárvore esquerda
        if (valor.compareTo(dado) < 0) {
            
            //insere novo treeNode
            if (esquedoNode == null){
                esquedoNode = new TreeNode<T>(valor);
            }
            else{// continua percorrendo a subárvore esquerda recursivamente
                esquedoNode.inserir(valor);
            }
        }
        else if (valor.compareTo(dado) > 0) {
            // insere novo TreeNode
            if (direitoNode == null) {
                direitoNode = new TreeNode<T>(valor);
            }
            else{
                direitoNode.inserir(valor);
            }
        }
    }
}