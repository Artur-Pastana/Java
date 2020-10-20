package Cap21.estruturadedados;

public class EmptyListException extends RuntimeException {
    
    public EmptyListException(){
        //nome = "lista";
        this("lista");
    }

    public EmptyListException(String nome){

        super(nome +" is empty");
    }
}