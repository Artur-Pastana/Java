package Cap11;

public class Desempilhando {
    public static void main(String[] args) {
        
        try {
            metodo1();

        } catch (Exception exception) {
            System.err.printf("%s%n%n",exception.getMessage());
            exception.printStackTrace();

            //obtém informações de rastreamento de pilha
            StackTraceElement[] traceElements = exception.getStackTrace();

            System.out.printf("%nStack trace from getStackTrace:%n");
            System.out.println("Class\t\tFile\t\t\tLine\tMethod");

            // faz um loop por traceElements para obter a descrição da exceção
            for (StackTraceElement element : traceElements) {
                System.out.printf("%s\t", element.getClassName());
                System.out.printf("%s\t", element.getFileName());
                System.out.printf("%s\t", element.getLineNumber());
                System.out.printf("%s%n", element.getMethodName());
                
            }
        }
    }

    public static void metodo1() throws Exception {
        metodo2();
    }

    public static void metodo2() throws Exception {
        metodo3();
    }

    public static void metodo3() throws Exception {
        throw new Exception("Exceção thrown em metodo 3");
    }
}