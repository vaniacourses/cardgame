package br.uff.qet.cardgame;

public class Card {
    private Suit suit;
    private Rank value;

    public Card(Rank value) {
        this.value = value;
        this.suit = Suit.CLUBS;
    }

    public Suit getSuit(){
        return this.suit;
    }

    public Rank getType() {
        return value;
    }

    public int getValue() {
        return value.getValue();
    }
}
