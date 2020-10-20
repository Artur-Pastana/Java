package Cap10.Interfaces;

public class TestePagamento {
    public static void main(String[] args) {
        
        Pagamento[] objPagamento = new Pagamento[2];

        //preenche os array com objetos fatura
        objPagamento[0] = new Fatura("390133", "Chave de rosca", 10, 2.59);
        objPagamento[1] = new Fatura("014057", "Rodão Aro 21", 20, 250.59);

        System.out.println("Faturas:");

        for (Pagamento fatura : objPagamento) {
            System.out.printf("%n%s %n%s: $%,.2f%n", fatura.toString());
        }
    }
}