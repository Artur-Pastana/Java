package Cap5.For;

public class Juros {
    public static void main(String[] args) {

        double montante;//quantia em depósito no final de cada ano
        double valorInicial = 1000.00; //valor que vai ser investido
        double taxa = 0.05;//taxa de juros

        // exibe cabeçalhos
        System.out.printf("%s %20s %n", "Year", "Amount on deposit");
        //calcula a qtd de depósito para cada um dos dez anos
        for(int ano = 1; ano <= 10 ; ano++){
            //calcula nova qtd durante o ano especificado
            montante = valorInicial * Math.pow(1.0 + taxa, ano);

            //exibe o ano e a quantidade
            System.out.printf("%4d%,20.2f%n", ano+2019, montante);
        }
    }
}