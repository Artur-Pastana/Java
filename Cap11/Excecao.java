package Cap11;

public class Excecao {
    public static void main(String[] args) {
        
        try {
            throwException();

        } catch (Exception exception) {//exceção lançada por throwException
            System.out.println("Exceção feita na main");
        }

        doesNotThrowException();
        
    }
    public static void throwException() throws Exception{
       try {
        System.out.println("Método throwException");
        throw new Exception(); //gera a exceção
       }
       catch (Exception exception) {
           System.err.println("Exception handled in method throwException");
           throw exception; //lança novamente para processamento adicional
       }
       finally{
           System.err.println("Finally executado em throwException");
       }
    }

    public static void doesNotThrowException() {
        try {
            System.out.println("método doesNotThrowException");
            
        } catch (Exception exception) {//não executa
            System.err.println(exception);

        }
        finally{
            System.err.println("Finally executado em doesNotThrowException");
        }

        System.out.println("fim do método doesNot");
    }
}