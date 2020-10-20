package Cap8.Estatico;

public class Teste {
    public static void main(String[] args) {
        
        //mostra que a contagem é 0 antes de criar objetos empregados
        System.out.printf("objetos empregados que foram instanciados: %d%n",Empregados.getCont());

        //criando dois objetos empregados
        Empregados emp1 = new Empregados("Artur ", "da gloria");
        Empregados emp2 = new Empregados("Iris ", "Aslan");

        


    }
}