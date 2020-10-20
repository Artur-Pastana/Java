package Cap8.Time;

public class Teste {
    public static void main(String[] args) {
        
        //cria um objeto time
        Time tempo = new Time();//invoca o construtor time

        //gera saida de representações de string da data/hora
        displayTime("Hora do objeto criado:", tempo);
        System.out.println();

        //altera a data / hora  e gera a saida atualizada
        tempo.setTime(07, 20, 24);
        displayTime("Usando o settime", tempo);
        System.out.println();

        try {
            tempo.setTime(99, 99, 99);
        } catch (IllegalArgumentException e) {
            System.out.printf("Exceção: %s%n%n", e.getMessage());
        }

        displayTime("Usando valores errados", tempo);

    }
    public static void displayTime(String info, Time t) {
        System.out.printf("%s%nHora Universal: %s%nHora padrão: %s%n", info,t.universalString(),t.toString());
    }
}