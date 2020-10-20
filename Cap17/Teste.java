package Cap17;

import java.util.stream.IntStream;

public class Teste {
    public static void main(String[] args) {

        int[] valores = {3,10,6,1,4,8,2,5,6,7,25,24,28,26,27};

        //exibe valores originais
        System.out.println("valores originais");
        IntStream.of(valores).forEach(valor -> System.out.printf("%d ", valor));
        System.out.println();

        //count, min, max, sum, e avarege dos valores
        System.out.printf("%nCount: %d%n", IntStream.of(valores).count());
        System.out.printf("Minimo: %d%n", IntStream.of(valores).min().getAsInt());
        System.out.printf("Maximo: %d%n", IntStream.of(valores).max().getAsInt());
        System.out.printf("Soma dos Valores: %d%n", IntStream.of(valores).sum());
        System.out.printf("Media: %.2f%n", IntStream.of(valores).average().getAsDouble());

        //soma dos valores com o método reduce
        System.out.printf("Soma via método Reduce: %d%n", IntStream.of(valores).reduce(0,(x,y) -> x + y));

        // soma das raízes quadradas dos valores com o método reduce
        System.out.printf("Soma das raizes quadradas com o método reduce: %d%n", IntStream.of(valores).reduce(0,(x , y) -> x + y * y));

        // produto dos valores com o método reduce
        System.out.printf("Produto via metodo reduce: %d%n", IntStream.of(valores).reduce(1,(x ,y)-> x * y));

        // valores pares exibidos em ordem classificada
        System.out.printf("Valores pares ordenados:%n");
        IntStream.of(valores)
        .filter(valor -> valor % 2==0)
        .sorted()
        .forEach(valor -> System.out.printf("%d ", valor));
        System.out.println();

        // valores ímpares multiplicados por 10 e exibidos em ordem classificada
        System.out.printf("Valores impares mult. por 10 e ordenados: ");
        IntStream.of(valores).filter(valor -> valor % 2 != 0)
        .map(valor -> valor *10)
        .sorted()
        .forEach(valor -> System.out.printf("%d ",valor));

        // soma o intervalo dos números inteiros de 1 a 10, exclusivo
        System.out.printf("%nSoma os inteiros no intervalo de 1 a 9: %d%n", IntStream.range(1, 10).sum() );

        // soma o intervalo dos números inteiros de 1 a 10, inclusive
        System.out.printf("Soma dos inteiros no intervalo de 1 a 10: %d%n", IntStream.rangeClosed(1, 10).sum() );
        //84630000001-1 14900470202-8 00915012606-9 20000374623-3

        //toString
        System.out.println("Usando summaryStatistcs");
        System.out.println(IntStream.of(valores).summaryStatistics());

    }
}