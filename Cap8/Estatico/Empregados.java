package Cap8.Estatico;

public class Empregados {
    private static int cont = 0;
    private String primeiroNome;
    private String ultimoNome;

    // inicializa Employee, adiciona 1 a static count e
    // gera a saída de String indicando que o construtor foi chamado
    public Empregados(String nome, String sobrenome){
        this.primeiroNome = nome;
        this.ultimoNome = sobrenome;

        ++this.cont;//incremente contagem estática de empregados
        System.out.printf("Construtor de Empregados: %s %s; cont = %d%n",this.primeiroNome, this.ultimoNome, this.cont);
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }
    public String getUltimoNome() {
        return ultimoNome;
    }

    public static int getCont() {
        return cont;
    }
}