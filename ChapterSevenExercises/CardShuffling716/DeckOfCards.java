package CardShuffling716;

import java.security.SecureRandom;
import java.util.ArrayList;

public class DeckOfCards {
    private static final SecureRandom randomNumbers = new SecureRandom();
    private static final int NUM_OF_CARDS_IN_DECK = 52;
    private Card[] deck = new Card[NUM_OF_CARDS_IN_DECK];
    private int currentCard = 0;
    public static String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
    public static String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    public static boolean containsPair = false;
    public static boolean containsTwoPairs = false;
    public static boolean containsThreeOfAKind = false;
    public static boolean containsFourOfAKind = false;
    public static ArrayList<String> pairsList1 = new ArrayList<>();
    public static ArrayList<String> pairsList2 = new ArrayList<>();
    public static ArrayList<String> pairsList3 = new ArrayList<>();
    public static ArrayList<String> pairsList4 = new ArrayList<>();
    public static boolean isFlush = false;
    public static boolean isStraight = false;
    public static ArrayList<String> threeMatchList = new ArrayList<>();
    public static boolean isFullHouse = false;
    public static boolean containsThreeOfAKindInFullHouse = false;


    public DeckOfCards() {
        //String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        //String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

        for (int count = 0; count < deck.length; count++) {
            deck[count] = new Card(faces[count % 13], suits[count / 13]);
        }
    } 

    public int getFaceInt(Card card) {
        String faceValue = "";
        int getFaceInt = 0;

        switch (faceValue) {
            case "Ace":
                getFaceInt = 1;
                break;
            case "Deuce":
                getFaceInt = 2;
                break;
            case "Three":
                getFaceInt = 3;
                break;
            case "Four":
                getFaceInt = 4;
                break;
            case "Five":
                getFaceInt = 5;
                break;
            case "Six":
                getFaceInt = 6;
                break;
            case "Seven":
                getFaceInt = 7;
                break;
            case "Eight":
                getFaceInt = 8;
                break;
            case "Nine":
                getFaceInt = 9;
                break;
            case "Ten":
                getFaceInt = 10;
                break;
            case "Jack":
                getFaceInt = 11;
                break;
            case "Queen":
                getFaceInt = 12;
                break;
            case "King":
                getFaceInt = 13;
                break;
        } 
        return getFaceInt;
    }

    public void shuffle() {
        currentCard = 0;
        for (int first = 0; first < deck.length; first++) {
            int second = randomNumbers.nextInt(NUM_OF_CARDS_IN_DECK);

            Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
        }
    } 

    public Card dealCard() {
        if (currentCard < deck.length) {
            return deck[currentCard++];
        } else {
            return null;
        }
    } 
    public Card[] hand() {
        ArrayList<Card> cards = new ArrayList<>();
        Card[] hand = new Card[5];
        for (int i = 0; i < 5; i++) {
            int randFace;
            int randSuit;
            Card newCard;
            if (cards.size() == 0) {
                randFace = randomNumbers.nextInt(13);
                randSuit = randomNumbers.nextInt(4);
                newCard = new Card(faces[randFace], suits[randSuit]);
                cards.add(newCard);
            } else if ((cards.size() > 0) && (cards.size() < 5)) {
                //boolean whileBoolean = true;
                while (true) {
                    randFace = randomNumbers.nextInt(13);
                    randSuit = randomNumbers.nextInt(4);
                    newCard = new Card(faces[randFace], suits[randSuit]);
                    int inequalityCount = 0;
                    for (int j = 0; j < cards.size(); j++) {
                        if (!((cards.get(j).getFace().equals(faces[randFace])) && (cards.get(j).getSuit().equals(suits[randSuit])))) {
                            inequalityCount += 1;
                        }
                    } 
                    if (inequalityCount == cards.size()) {
                        cards.add(newCard);
                        break;
                    }
                }
            } 
            System.out.println(cards.get(i));
            hand[i] = cards.get(i);

        } 
        System.out.println();
        printRankings(hand);

        return hand;

    } 

    public void printRankings(Card[] hand) {
        if (onePair(hand) && (!(threeOfAKind(hand))) && (!(fourOfAKind(hand)))) {
            System.out.println("Hand contains a pair: 2 " + pairsList1.get(0) + "s");
        } else if (twoPairs(hand) && (!(threeOfAKind(hand))) && (!(fourOfAKind(hand)))) {
            System.out.println("Hand contains 2 pairs: 2 " + pairsList2.get(0) + "s and 2 " + pairsList2.get(1) + "s");
        } else if (threeOfAKind(hand)) {
            System.out.println("Hand contains three of a kind: 3 " + pairsList3.get(0) + "s");
        } else if (fourOfAKind(hand)) {
            System.out.println("Hand contains four of a kind: 4 " + pairsList4.get(0) + "s");
        } else if (flush(hand)) {
            System.out.println("Hand contains a flush");
        } else if (straight(hand)) {
            System.out.println("Hand contains a straight");
        } else if (fullHouse(hand)) {
            System.out.println("Hand contains a full house");
        }
    } 

    public boolean fullHouse(Card[] hand) {
        ArrayList<String> handFaceValueList = new ArrayList<>();
        for (int i = 0; i < hand.length; i++) {
            handFaceValueList.add(hand[i].getFace());
        }
        for (int i = 0; i < hand.length; i++) {
            for (int j = 0; j < hand.length; j++) {
                if (!((i == j))) {
                    if (hand[i].getFace().equals(hand[j].getFace())) {
                        threeMatchList.add(hand[i].getFace());
                        
                    }
                }
            }
        } 
        if (threeMatchList.size() == 6) {
            containsThreeOfAKindInFullHouse = true;
            handFaceValueList.remove(threeMatchList.get(0));
            handFaceValueList.remove(threeMatchList.get(0));
            handFaceValueList.remove(threeMatchList.get(0));
            if (handFaceValueList.get(0) == handFaceValueList.get(1)) {
                isFullHouse = true;
            }
        } 
        

        return isFullHouse;
    } 

    public boolean straight(Card[] hand) {
        Card minCard = hand[0];
        int sum = 0;
        for (Card card : deck) {
            sum += getFaceInt(card);
            if (getFaceInt(minCard) > getFaceInt(card)) {
                minCard = card;
            }
        } 
        if (sum == ((getFaceInt(minCard) * 5) + 10)) {
            isStraight = true;
        } 
        return isStraight;
    }

    public boolean flush(Card[] hand) {
        int countToFlush = 0;
        Card helper = hand[0];
        for (Card card : hand) {
            if (helper.getSuit().equals(card.getSuit())) {
                countToFlush += 1;
            }
        } 
        if (countToFlush == hand.length) {
            isFlush = true;
        } 
        return isFlush;
        
    }

    public boolean onePair(Card[] hand) {
        for (int i = 0; i < hand.length; i++) {
            for (int j = 0; j < hand.length; j++) {
                if (!(i == j)) {
                    if (hand[i].getFace().equals(hand[j].getFace())) {
                        if (!(pairsList1.contains(hand[i].getFace()))) {
                            pairsList1.add(hand[i].getFace());
                        }
                    }
                }
            }
        } 
        if ((pairsList1.size() == 1)) {
            containsPair = true;
        } 
        return containsPair;
    }

    public boolean twoPairs(Card[] hand) {
        
        for (int i = 0; i < hand.length; i++) {
            for (int j = 0; j < hand.length; j++) {
                if (!(i == j)) {
                    if (hand[i].getFace().equals(hand[j].getFace())) {
                        if (!(pairsList2.contains(hand[i].getFace()))) {
                            pairsList2.add(hand[i].getFace());
                        }
                    }
                }
            }
        } 

        if ((pairsList2.size() == 2)) {
            containsTwoPairs = true;
        } 
        return containsTwoPairs;
    } 

    public boolean threeOfAKind(Card[] hand) {
        for (int i = 0; i < hand.length; i++) {
            for (int j = 0; j < hand.length; j++) {
                if (!(i == j)) {
                    if (hand[i].getFace().equals(hand[j].getFace())) {
                        pairsList3.add(hand[i].getFace());
                    }
                }
            }
        } 

        if (pairsList3.size() == 6) {
            containsThreeOfAKind = true;
        } 
        return containsThreeOfAKind;
    } 

    public boolean fourOfAKind(Card[] hand) {
        for (int i = 0; i < hand.length; i++) {
            for (int j = 0; j < hand.length; j++) {
                if (!(i == j)) {
                    if (hand[i].getFace().equals(hand[j].getFace())) {
                        pairsList4.add(hand[i].getFace());
                    }
                }
            }
        } 

        if ((pairsList4.size() == 12)) {
            containsFourOfAKind = true;
        } 
        return containsFourOfAKind;
    }


}
