package Cap17;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArrayAndStream2 {
    public static void main(String[] args) {
        
        String[] cores = {"Red", "orange", "Yellow", "green", "Blue", "indigo", "Violet"};

        //exibe as cores originais
        System.out.printf("%ncores originais: %s%n", Arrays.asList(cores));

        //exibe strings Maisculas
        System.out.printf("Strings Maisculas: %s%n", 
            Arrays.stream(cores).map(String::toUpperCase).collect(Collectors.toList()));
        
        //exibe as strings em minusculas
        System.out.printf("Cores minusculas: %s%n", 
            Arrays.stream(cores).map(String :: toLowerCase).collect(Collectors.toList()));
        
        // strings menores que “n” (sem distinção maiúsc/minúsc) em ordem crescente
        System.out.printf("Strings > 'n' ordenadas sem distinção: %s%n", 
            Arrays.stream(cores)
            .filter(s -> s.compareToIgnoreCase("n") < 0)
            .sorted(String.CASE_INSENSITIVE_ORDER)
            .collect(Collectors.toList()));

        //// strings menores que “n” (com distinção maiúsc/minúsc) em ordem decrescente
        System.out.printf("Strings > 'n' ordenadas com distinção: %s%n", 
        Arrays.stream(cores)
        .filter(s -> s.compareToIgnoreCase("n") < 0)
        .sorted(String.CASE_INSENSITIVE_ORDER.reversed())
        .collect(Collectors.toList()));
    }
}