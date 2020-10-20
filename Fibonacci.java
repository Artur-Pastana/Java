import java.math.BigInteger;

public class Fibonacci {
    public static void main(String[] args) {

        //exibe os valores de fibonacci de 0 a 40
        for(int i = 0; i <= 40; i++){
            System.out.printf("Fibonacci de %d = %d%n", i, fibonacci(BigInteger.valueOf(i)));
        }
    }
    
    private static BigInteger DOIS = BigInteger.valueOf(2);
    //declaração recursiva do método de fibonacci
    public static BigInteger fibonacci(BigInteger numero) {
        
        if (numero.equals(BigInteger.ZERO) || numero.equals(BigInteger.ONE)) {//casos basicos
            return numero;
        }
        else{
            return fibonacci(numero.subtract(BigInteger.ONE)).add(fibonacci(numero.subtract(BigInteger.TWO)));
        }
    }
}