package Cap15.Menu;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Credito {
    
    private final static MenuOpcao[] valores = MenuOpcao.values();

    public static void main(String[] args) {
        // obtém a solicitação do usuário (por exemplo, saldo zero, credor ou devedor)
        MenuOpcao tipoConta = getRequest();

        while (tipoConta != MenuOpcao.END) {
            switch (tipoConta) {
                case ZERO_VALOR:
                    System.out.printf("%nAccounts with zero balances:%n");
                    break;
                case CREDITO_VALOR:
                    System.out.printf("%nAccounts with credit balances:%n");
                    break;
                case DEBITO_VALOR:
                    System.out.printf("%nAccounts with debit balances:%n");
                    break;
            }
            readRecords(tipoConta);
            tipoConta = getRequest();
        }
    }

    public static MenuOpcao getRequest() {
        int request = 4;

        //exibe opções de solicitação
        System.out.printf("%nEnter request%n%s%n%s%n%s%n%s%n",
                        " 1 - List accounts with zero balances",
                        " 2 - List accounts with credit balances",
                        " 3 - List accounts with debit balances",
                        " 4 - Terminate program");
        
        try {
            Scanner input = new Scanner(System.in);

            do{//insere a solicitação do usuário
                System.out.printf("%n?");
                request = input.nextInt();
            }while(request < 1|| request > 4);

        } 
        catch (NoSuchElementException noSuchElementException) {
            System.out.printf("Entrada invalida");
        }
        return valores[request - 1];//retorna o valor enum da opção
    }

    // lê registros de arquivo e exibe somente os registros do tipo apropriado

    private static void readRecords(MenuOpcao tipoConta ) {
        try (Scanner input = new Scanner(Paths.get("Clients.txt"))) {
            
            while (input.hasNext()) {
                int numConta = input.nextInt();
                String ultimoNome = input.nextLine();
                String primeiroNome = input.nextLine();
                double salario = input.nextDouble();

                //se o tipo for a conta adequada, exibe o resgistro
                if (sholdDisplay(tipoConta, salario)) {
                    System.out.printf("%-10d%-12s%-12s%10.2f%n", numConta,primeiroNome,ultimoNome,salario);
                }
                else{
                    input.nextLine();//descarta o restante do registro atual
                }
            }
        } catch (NoSuchElementException | IllegalStateException | IOException exception ) {
            System.err.println("Error processing file. Terminating.");
            System.exit(1);
        } 
    }//fim do metodo addRecords

    // utiliza o tipo de registro para determinar se registro deve ser exibido
    private static boolean sholdDisplay(MenuOpcao tipoConta, double valor ) {
        if ((tipoConta == MenuOpcao.CREDITO_VALOR) && (valor < 0)) {
            return true;
        }
        else if ((tipoConta == MenuOpcao.DEBITO_VALOR) && (valor > 0)) {
            return true;
        }
        else if ((tipoConta == MenuOpcao.ZERO_VALOR) && (valor == 0)){
            return true;
        }
        return false;

    }

}