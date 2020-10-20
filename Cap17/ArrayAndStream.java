package Cap17;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ArrayAndStream {
    public static void main(String[] args) {
        
        Integer[] valores = {2, 9, 5, 0, 3, 7, 1, 4, 8, 6};
        
        //exibe valores originais
        System.out.printf("valores originais: %s%n", Arrays.asList(valores));

        // classifica os valores em ordem crescente com fluxos
        System.out.printf("valores ordenados: %s%n", Arrays.stream(valores).sorted().collect(Collectors.toList()));

        //Valores maiores que 4
        List<Integer> maiorQue4 = Arrays.stream(valores).filter(valor -> valor > 4).collect(Collectors.toList());
        System.out.printf("valores maiores que 4: %s%n", maiorQue4);

        // filtra valores maiores que 4 e então classifica os resultados
        System.out.printf("Valores ordenados > 4: %s%n",
            Arrays.stream(valores).filter(valor -> valor > 4).sorted().collect(Collectors.toList()));

        // lista greaterThan4 classificada com fluxos
        System.out.printf("valores > 4, classificados por fluxos: %s%n", 
            maiorQue4.stream().sorted().collect(Collectors.toList()));
    }
}