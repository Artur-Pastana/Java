package Cap15.Serializacao;

import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Desserializando {
    
    private static ObjectInputStream input;

    public static void main(String[] args) {
        abrirArquivo();
        adicionarReg();
        fecharArquivo();

    }

    public static void abrirArquivo() {
        
        try {
            
            //output  = new ObjectOutputStream(Files.newOutputStream(Paths.get("clientes.ser")));
            input = new ObjectInputStream(Files.newInputStream(Paths.get("clientes.ser")));

        } catch (IOException ioException) {

            System.err.println("Erro ao abrir o arquivo. Terminado");
            System.exit(1);

        }
    }

    //permite que o usuario selecione o arquivo a abrir
    public static void adicionarReg() {
        
        System.out.printf("%-10s%-12s%-12s%10s%n", "Conta",
        "Nome", "Sobre Nome", "Valor");

        try {

            while (true) {//faz um loop até ocorrer uma EOFException
                Conta registro = (Conta) input.readObject();
                
                //exibe o conteudo de registro
                System.out.printf("%-10d%-12s%-12s%10.2f%n", registro.getConta(), registro.getNome(),
                registro.getSobreNome(), registro.getSalario());

            }
        } 
        catch (EOFException eofException) {
            System.err.println("%No more records%n");
        }
        catch(ClassNotFoundException classNotFoundException){
            System.err.println("Invalid object type. Terminating.");
        }
        catch(IOException ioException){
            System.err.println("Error reading from file. Terminating.");
        }
    }//fim do metodo adicionar

    public static void fecharArquivo() {
        
        try {
            if (input != null) {
                input.close();
            }
        } catch (IOException ioException) {
            System.err.println("Error closing file. Terminating.");
            System.exit(1);
        }
    }

}