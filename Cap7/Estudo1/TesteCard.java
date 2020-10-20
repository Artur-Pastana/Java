package Cap7.Estudo1;

public class TesteCard {
    public static void main(String[] args) {
        DeckOfCards meuJogoDeCartas = new DeckOfCards();
        meuJogoDeCartas.embaralhar();//coloca Cartas em ordem aleatória

        //imprime todas as 52 cartas na ordem em que elas estão distribuidas
        for(int i = 1; i <= 52; i++){
            //distribui e exibe uma carta
            System.out.printf("%-19s",meuJogoDeCartas.distribuirCartas());

            if (i % 4 == 0) {
                System.out.println();
            }
        }
    }
}