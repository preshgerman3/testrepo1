package CardShuffling719;

import java.util.ArrayList;

public class Card {
    private final String face;
    private final String suit;
    private ArrayList<Card> cards;

    public Card(String face, String suit) {
        this.face = face;
        this.suit = suit;
        this.cards = new ArrayList<>();
    } 

    public String toString() {
        return this.face + " of " + this.suit;
    } 

    public String getFace() {
        return this.face;
    } 

    public String getSuit() { 
        return this.suit;
    } 

    public boolean equalCards(Card card) {
        if (((this.getFace().equals(card.getFace()))) && ((this.getSuit().equals(card.getSuit())))) {
            return true;
        } else {
            return false;
        }
    }

    public void addCard(Card card) {
        if (this.cards.size() == 0) {
            this.cards.add(card);
        } else if ((this.cards.size() > 0) && (this.cards.size() < 5)) {
            if (!(this.cards.contains(card))) {
                this.cards.add(card);
            }
        }
    } 

    public void displayCards() {
        for (Card card : cards) {
            System.out.println(card);
        }
    }

    





    
}