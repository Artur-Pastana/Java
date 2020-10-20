package Cap17;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ListaDeEmpregados {
    public static void main(String[] args) {
        
        Empregado[] empregados = {
            new Empregado("artur", "Pastana", 5000, "cuidar"),
            new Empregado("Aslan", "Pietro", 7600, "bagunça"),
            new Empregado("iris", "juliany", 10000, "bagunça"),
            new Empregado("Hitallo", "Silva", 6200, "jogo"),
            new Empregado("Maria", "Ana", 14500, "kpop"),
            new Empregado("Anne", "Caroline", 3000, "kpop"),
            new Empregado("Andreza", "cristina", 4230, "cuidar"),
        };

        List<Empregado> lista = Arrays.asList(empregados);

        //exibe todos os empregados
        System.out.printf("Lista de empregados:%nNome   Sobrenome   salario    departamento%n");
        lista.stream().forEach(System.out :: println);

        // Predicate que retorna true para salários no intervalo US$ 4000-US$ 6000
        Predicate<Empregado> intervalo = e -> (e.getSalario() >= 4000 && e.getSalario() <= 6000);

        // Exibe Employees com salários no intervalo US$ 4000-US$ 6000
        // classificados em ordem crescente por salário
        System.out.printf("%nEmpregados com salarios entre 4000 a 6000 ordenados:%n"); 
            lista.stream()
            .filter(intervalo)
            .sorted(Comparator.comparing(Empregado :: getSalario))
            .forEach(System.out :: println);
        
        // Exibe o primeiro Employee com salário no intervalo US$ 4000-US$ 6000
        System.out.printf("%nprimeiro empregado com salario entre 4k e 6k:%n%s%n",
            lista.stream()
            .filter(intervalo)
            .findFirst()
            .get());
        
        // Functions para obter o nome e o sobrenome de um Employee
        Function<Empregado, String> nome = Empregado :: getNome;
        Function<Empregado, String> sobreNome = Empregado :: getSobreNome;

        // Comparator para comparar Employees pelo nome, então, pelo sobrenome
        Comparator<Empregado> sobreNomeENome = Comparator.comparing(sobreNome).thenComparing(nome);

        // classifica funcionários pelo sobrenome e, então, pelo nome
        System.out.printf("%nEmployees in ascending order by last name then first:%n");
            lista.stream()
            .sorted(sobreNomeENome)
            .forEach(System.out :: println);

        // classifica funcionários em ordem decrescente pelo sobrenome e, então, pelcv o nome
        System.out.printf("%nEmployees in descending order by last name then first:%n");
            lista.stream()
            .sorted(sobreNomeENome.reversed())
            .forEach(System.out :: println);

        // exibe os sobrenomes únicos dos funcionários classificados
        System.out.printf("%nsobrenomes unicos dos empregados em ordem:%n");
            lista.stream()
            .map(Empregado :: getSobreNome)
            .distinct()
            .sorted()
            .forEach(System.out :: println);

        // exibe apenas o nome e o sobrenome
        System.out.printf("%nNome e sobrenome dos empregados em ordem:%n");
            lista.stream()
            .sorted(sobreNomeENome)
            .map(Empregado :: getNomeCompleto)
            .forEach(System.out :: println);

        //agrupa os empregados por departamento
        System.out.printf("Empregados por Departamento:%n");
        Map<String, List<Empregado>> grupoDepartamento = lista.stream().collect(Collectors.groupingBy(Empregado :: getDepartamento));
        grupoDepartamento.forEach(
            (departamento, empregadoNoDepartamento) -> 
            { 
                System.out.println(departamento);
                empregadoNoDepartamento.forEach(empregado -> System.out.printf("  %s%n", empregado));
            }
        );

        // conta o número de Employees em cada departamento
        System.out.println("numeros de empregados por departamento");
        Map<String, Long> numeroDeEmpregados = lista.stream()
            .collect(Collectors.groupingBy(Empregado :: getDepartamento, Collectors.counting()));
        numeroDeEmpregados.forEach((departamento, cont) -> System.out.printf("%s possui %d empregados(s)%n",departamento, cont));
        
    }
}