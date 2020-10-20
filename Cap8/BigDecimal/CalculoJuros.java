package Cap8.BigDecimal;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class CalculoJuros {
    public static void main(String[] args) {
        
        //qtd inicial antes dos juros
        BigDecimal principal = BigDecimal.valueOf(1000.0);
        BigDecimal rate = BigDecimal.valueOf(0.05);

        // exibe cabeçalhos
        System.out.printf("%s %20s %n", "Year", "Amount on deposit");
        //calcula a qtd de depósito para cada um dos dez anos
        for(int ano = 1; ano <= 10 ; ano++){
            //calcula nova qtd durante o ano especificado
            BigDecimal montante = principal.multiply(rate.add(BigDecimal.ONE).pow(ano));
            //exibe o ano e a quantidade
            //System.out.printf("%4d%,20.2f%n", ano+2019, montante);
            System.out.printf("%4d%20s%n",ano+2019,NumberFormat.getCurrencyInstance().format(montante));
            
        }
    }
}