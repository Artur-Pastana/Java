package Cap18;

import java.math.BigInteger;

public class Fatorial {
    public static void main(String[] args) {

        //calcula o fatorial de 0  a 21
        for (int i = 0; i <= 21; i++) {
            System.out.printf("%d! = %d%n", i, fatorial(i));
        }

        //calcula o fatorial utilizando a classe bigInteger de 0 a 50
        System.out.println("usando a Classe Biginteger:");
        for(int i = 0; i <= 50; i++){
            System.out.printf("%d! = %d%n", i,fatorial(BigInteger.valueOf(i)));
        }
        
    }

    public static long fatorial(long  numero) {
        if (numero <= 1) {//teste básico
            return 1;//casos básicos : 0! = 1 e 1! = 1
        }
        else{
            return numero * fatorial(numero - 1);
        }
    }

    //usando Biginteger para calcular o fatorial
    public static BigInteger fatorial(BigInteger numero) {
            if (numero.compareTo(BigInteger.ONE) <= 0) {
                return BigInteger.ONE;
            }
            else{
                return numero.multiply(fatorial(numero.subtract(BigInteger.ONE)));
            }
    }
}