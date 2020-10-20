package Cap11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Divisao {
    
    //demonstra o laçamento de uma exceção quando ocorre uma divisão por zero
    public static int quociente(int numerador, int denominador) throws ArithmeticException {

        return numerador/denominador;//possivel divisão por zero
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        boolean cont = true;//determina se mais entrdas é necessário
        do{
            try {

                System.out.println("entre com um valor");
                int numerador = sc.nextInt();
                System.out.println("entre com outro valor");
                int denominador = sc.nextInt();
        
                int res = quociente(numerador, denominador);
                System.out.printf("%nResultado de %d / %d = %d%n",numerador, denominador, res);
    
                cont = false;
            } catch (InputMismatchException inputMismatchException) {

                System.out.printf("%nException: %s%n",inputMismatchException);
                sc.nextLine();//descarta entrada para o usuario tentar novamente
                System.out.printf("Vc deve digitar um numero inteiro, por favor%n");

            }
            catch(ArithmeticException arithmeticException){
                System.out.printf("%nException: %s%n", arithmeticException);
                System.out.println("Não pode ocorrer divisão por zero, não faça isso por favor");
            }
        }while(cont);
       
    }
}