package br.uff.qet.cardgame;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private List<Card> hand;
    private String name;

    public Player(String name){
        this.hand = new ArrayList<>();
        this.name = name;
    }


    public void takeCard(Card card) {
        hand.add(card);
    }

    public int countHand(){
        return hand.size();
    }
    
    public Card getCard(int posicao) {
    	return this.hand.remove(posicao);
    }

    public int getHandValue(){
        int cardValues = 0;
        for (Card card : hand){
            int cardValue = card.getValue();
            cardValues += cardValue;
        }
        return cardValues;
    }

}

