package Cap16.Pilha;

import java.util.EmptyStackException;
import java.util.Stack;

public class PilhaTeste {
    public static void main(String[] args) {
        
        Stack<Number> pilha = new Stack<>();//cria uma pilha

        //utiliza o método push
        pilha.push(12L);//insere o valor long 12L
        System.out.println("insere o 12L");
        mostrarPilha(pilha);

        pilha.push(2828);
        System.out.println("insere 2828");
        mostrarPilha(pilha);

        pilha.push(10);
        System.out.println("insere 10");
        mostrarPilha(pilha);

        try {
            
            Number removeObj = null;

            //remove os elementos da pilha
            while (true) {
                removeObj = pilha.pop();//utiliza o método pop
                System.out.printf("Popped %s%n",  removeObj);
                mostrarPilha(pilha);
            }
        } 
        catch (EmptyStackException emptyStackException) {
            emptyStackException.printStackTrace();
        }
    }

    private static void mostrarPilha(Stack<Number> stack){
        if ( stack.isEmpty() ){
        System.out.printf("Pilha está Vazia%n%n"); // a pilha está vazia
        }
        else{ // a pilha não está vazia
        System.out.printf("stack contains: %s (top)%n", stack);
        }
    }
}