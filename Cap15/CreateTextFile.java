package Cap15;

import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreateTextFile {
    
    private static Formatter output;//envia a saida de texto para um arquivo
    public static void main(String[] args) {
        openFile();
        addRecords();
        closeFile();
        
    }
    public static void openFile() {
        try {
            output = new Formatter("Clients.txt"); // abre o arquivo

        } catch (SecurityException securityException) {
            System.out.println("Permissão escrita ok. Terminada");
            System.exit(1); // termina o programa
        }
        catch(FileNotFoundException fileNotFoundException){
            System.err.println("Erro ao abrir o arquivo. Terminado");
            System.exit(1); //termina o programa
        } 
    }

    public static void addRecords() {
        
        Scanner input = new Scanner(System.in);

        System.out.printf("%s%n%s%n","Entre com o numero da conta, primeiro nome, ultimo nome e balanço",
        "Entre com o final do arquivo indicador de entrada");

        while (input.hasNext()){// faz um loop até o indicador de fim de arquivo
            try {
                // gera saída do novo registro para o arquivo; supõe entrada válida
                output.format("%d %s %s %.2f%n",input.nextInt(),input.nextLine(),input.nextLine(),input.nextDouble());
                //output.format("%s", input.nextLine());

            } catch (FormatterClosedException formatterClosedException) {
                System.err.println("Erro de escrita no arquivo. terminado");
                break;
            }
            catch(NoSuchElementException elementException){
                System.err.println("entrada inválida. tente novamente");
                input.nextLine();//descarta entrada para o usuario tentar de novo
            }
            
            System.out.print("? ");
        }//fim do while
    }//fim do metodo addRecords

    //fecha o arquivo
    public static void closeFile() {
        if (output != null){
            output.close();
        }
    }
}
