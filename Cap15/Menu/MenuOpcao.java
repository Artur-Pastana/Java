package Cap15.Menu;

public enum MenuOpcao {
    
    //declara o conteudo do tipo enum
    ZERO_VALOR(1),
    CREDITO_VALOR(2),
    DEBITO_VALOR(3),
    END(4);

    private final int valor; //opção atual de menu

    //construtor
    private MenuOpcao(int opção){
        this.valor = opção;
    }

}