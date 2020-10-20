package Cap15.Serializacao;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ArquivoSerializado {
    
    private static ObjectOutputStream output;//gera a saida dos dados no arquivo

    public static void main(String[] args) {

        abrirArquivo();
        addRegistro();
        fecharArquivo();
    }

    public static void abrirArquivo() {
        
        try {
            
            output  = new ObjectOutputStream(Files.newOutputStream(Paths.get("clientes.ser")));

        } catch (IOException ioException) {

            System.err.println("Erro ao abrir o arquivo. Terminado");
            System.exit(1);

        }

    }

    //adiciona registros ao arquivo
    public static void addRegistro() {
        
        Scanner input = new Scanner(System.in);
        System.out.printf("%s%n%s%n? ",
                        "Enter account number, first name, last name and balance.",
                        "Enter end-of-file indicator to end input.");
        
        while (input.hasNext()){ //faz um loop até o indicador  de fim de arquivo
            try {
                
                //cria novo registro; esse exemplo supõe uma entrada válida7

                Conta registro = new Conta(input.nextInt(), input.next(), input.next(), input.nextDouble());
                //serializa o objeto de registro em um arquivo
                output.writeObject(registro);

            } catch (NoSuchElementException elementException ) {
                System.err.println("Invalid input. Please try again.");
                input.nextLine();
            } catch(IOException ioException ){
                System.err.println("Erro de escrita do arquivo. Terminating.");
                break;
            }
            System.out.print("? ");
        }
    }

    //fecha o arquivo e termina o app
    public static void fecharArquivo() {
        
        try {

            if ( output != null ){
                output.close();
            }

        } catch (IOException ioException) {
            System.err.println("Erro ao fechar o arquivo.terminado");

        }
    }
}//Fim da classe