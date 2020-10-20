package Cap7.Estudo1;

import java.security.SecureRandom;

public class DeckOfCards {

    private Cartas[] deck;//array de objetos cartas
    private int currentCard;//indice da proxima carta a ser distribuida(0 - 51);
    private static final int NUM_DE_CARTAS = 52;
    //gerador de numeros aleatório 
    private static final SecureRandom numRand = new SecureRandom();

    //construtor preenche baralho de cartas;
    public DeckOfCards(){
        String[] faces = {"As","Dois","Tres","Quatro","Cinco","Seis","Sete","Oito","Nove",
                          "Dez","Valette","Rainha","Rei"};
        String[] suit =  {"Pauos","Copas","Espada","Ouro"};

        deck = new Cartas[NUM_DE_CARTAS];//cria um array de objetos Cartas
        currentCard = 0;// a primeira carta distribuida será o deck[0]

        //preenche o baralho com objetos cartas
        for(int i = 0; i < deck.length; i++){
            deck[i] = new Cartas(faces[i % 13], suit[i / 13]);
        }
    }
    //embaralha as cartas com um algoritmo de uma passagem
    public void embaralhar() {
        //a proxima chamada para o metodo dealCard deve começar no deck[0]
        currentCard = 0;

        //para cada carta, seleciona outra carta aleatória de (0-51) e as compara
        for(int primeiro = 0; primeiro < deck.length; primeiro++){
            //seleciona um numero aleatório entre 0 e  51
            int segundo = numRand.nextInt(NUM_DE_CARTAS);

            //compara carta atual com a carta aleatórimente selecionada
            Cartas temp = deck[primeiro];
            deck[primeiro] = deck[segundo];
            deck[segundo] = temp;
        }
    }

    //distribui uma carta
    public Cartas distribuirCartas(){
        //determina se ainda há cartas a serem distribuidas
        if (currentCard < deck.length) {
            return deck[currentCard++];
        }
        else{
            return null;
        }
    }

}