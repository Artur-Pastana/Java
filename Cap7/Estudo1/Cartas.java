package Cap7.Estudo1;

public class Cartas {
    private final String face;//fa(ce da carta ("As","dois"..)
    private final String suit;//naipe da carta("copas","espadas"..)

    public Cartas(String cardFace, String cardSuit){
        this.face = cardFace;
        this.suit = cardSuit;
    }
    @Override
    public String toString() {
        return this.face +" de "+this.suit;
    }
}