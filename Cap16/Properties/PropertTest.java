package Cap16.Properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertTest {
    public static void main(String[] args) {
        
        Properties tabela = new Properties();

        //configura propriedades
        tabela.setProperty("cor", "Azul");
        tabela.setProperty("tamanho", "200");

        System.out.println("setando propriedades");
        listarProperties(tabela);

        //susbtitui o valor de propriedade
        tabela.setProperty("cor", "vermelho");

        System.out.println("Alterando o valor de propriedade");
        listarProperties(tabela);

        salvarProperties(tabela);

        tabela.clear();//tabela vazia

        System.out.println("Limpando propriedades");
        listarProperties(tabela);

        lerProperties(tabela);

        //obtem o valor de cor da propriedade
        Object valor = tabela.getProperty("cor");

        //verifica se o valor esta na tabela
        if (valor != null) {
            System.out.printf("O valor da propriedade Cor é: %s%n", valor);
        }
        else{
            System.out.println("propriedade Cor não contém na tabela");
        }
        
    }

    private static void salvarProperties(Properties props) {
        
        //salva o conteudo de tabela
        try {
            FileOutputStream output = new FileOutputStream("props.dat");
            props.store(output,"propriedade Simples");
            output.close();
            System.out.println("Salvando as propriedades");
            listarProperties(props);

        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    //carrega as propriedades de um arquivo
    private static void lerProperties(Properties props) {
        
        //carrega o conteudo de tabela
        try {
            FileInputStream input = new FileInputStream("props.dat");
            props.load(input);
            input.close();
            System.out.println("Lendo Propriedades");
            listarProperties(props);

        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    //gera a saida de valores de propriedades
    private static void listarProperties(Properties props) {
        Set<Object> chaves = props.keySet();//obtém nomes de propriedades

        //gera a saida de pares nome - valor
        for (Object chave  : chaves) {
            System.out.printf("%s\t%s%n",chave, props.get((String)chave));
        }
        System.out.println();
    }
}