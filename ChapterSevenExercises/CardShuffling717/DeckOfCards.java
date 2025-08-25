package CardShuffling717;

import java.security.SecureRandom;
import java.util.ArrayList;

public class DeckOfCards {
    private static final SecureRandom randomNumbers = new SecureRandom();
    private static final int NUM_OF_CARDS_IN_DECK = 52;
    private Card[] deck = new Card[NUM_OF_CARDS_IN_DECK];
    private int currentCard = 0;
    public static String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
    public static String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    public static boolean containsNoPair = false;
    public static boolean containsOnePair = false;
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
    public static int noPairRank = 0;
    public static int onePairRank = 0;
    public static int twoPairRank = 0;
    public static int threeKindRank = 0;
    public static int fourKindRank = 0;
    public static int flushRank = 0;
    public static int straightRank = 0;
    public static int fullHouseRank = 0;
    public static int intRankHand = 0;
    public static int intRankHand1 = 0;
    public static int intRankHand2 = 0;

    public DeckOfCards() {
        //String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        //String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

        for (int count = 0; count < deck.length; count++) {
            deck[count] = new Card(faces[count % 13], suits[count / 13]);
        }
    } 

    public void resetParams() {
        containsNoPair = false;
        containsOnePair = false;
        containsTwoPairs = false;
        containsThreeOfAKind = false;
        containsFourOfAKind = false;
        pairsList1 = new ArrayList<>();
        pairsList2 = new ArrayList<>();
        pairsList3 = new ArrayList<>();
        pairsList4 = new ArrayList<>();
        isFlush = false;
        isStraight = false;
        threeMatchList = new ArrayList<>();
        isFullHouse = false;
        containsThreeOfAKindInFullHouse = false;
        noPairRank = 0;
        onePairRank = 0;
        twoPairRank = 0;
        threeKindRank = 0;
        fourKindRank = 0;
        flushRank = 0;
        straightRank = 0;
        fullHouseRank = 0;
    }

    public void compareTwoHands(ArrayList<ArrayList<Card>> twoHandList) {
        resetParams();
        if (intRank(twoHandList.get(0)) > intRank(twoHandList.get(1))) {
            System.out.println("First hand is better");
            resetParams();
        } else if (intRank(twoHandList.get(0)) < intRank(twoHandList.get(1))) {
            System.out.println("Second hand is better");
            resetParams();
        } else if (intRank(twoHandList.get(0)) == intRank(twoHandList.get(1))) {
            System.out.println("Both hands are equal");
        }

    } 

    public int distributionsRank(ArrayList<Card> hand) {
        int distRank = 0;
        if (noPair(hand)) {
            distRank = 1; 
        } else if (onePair(hand)) {
            distRank = 2;
        } else if (twoPairs(hand)) {
            distRank = 3;
        } else if (threeOfAKind(hand)) {
            distRank = 4;
        } else if (fourOfAKind(hand)) {
            distRank = 5;
        } else if (flush(hand)) {
            distRank = 6;
        } else if (straight(hand)) {
            distRank = 7;
        } else if (fullHouse(hand)) {
            distRank = 8;
        } 
        
        return distRank;
    } 

    public int highestFaceValue(ArrayList<Card> hand) {
        int value = 0;
        if (noPair(hand)) {
            value = noPairRank;
        } else if (onePair(hand)) {
            value = onePairRank;
        } else if (twoPairs(hand)) {
            value = twoPairRank;
        } else if (threeOfAKind(hand)) {
            value = threeKindRank;
        } else if (fourOfAKind(hand)) {
            value = fourKindRank;
        } else if (flush(hand)) {
            value = flushRank;
        } else if (straight(hand)) {
            value = straightRank;
        } else if (fullHouse(hand)) {
            value = fullHouseRank;
        } 

        return value; 
    } 

    public int getFaceIntOfCard(Card card) {
        String faceValue = card.getFace();
        int getFaceIntOfCard = 0;

        switch (faceValue) {
            case "Ace":
                getFaceIntOfCard = 1;
                break;
            case "Deuce":
                getFaceIntOfCard = 2;
                break;
            case "Three":
                getFaceIntOfCard = 3;
                break;
            case "Four":
                getFaceIntOfCard = 4;
                break;
            case "Five":
                getFaceIntOfCard = 5;
                break;
            case "Six":
                getFaceIntOfCard = 6;
                break;
            case "Seven":
                getFaceIntOfCard = 7;
                break;
            case "Eight":
                getFaceIntOfCard = 8;
                break;
            case "Nine":
                getFaceIntOfCard = 9;
                break;
            case "Ten":
                getFaceIntOfCard = 10;
                break;
            case "Jack":
                getFaceIntOfCard = 11;
                break;
            case "Queen":
                getFaceIntOfCard = 12;
                break;
            case "King":
                getFaceIntOfCard = 13;
                break;
        } 
        return getFaceIntOfCard;
    } 

    public int getIntOfFace(String face) {
        String faceValue = "";
        int getIntOfFace = 0;

        switch (faceValue) {
            case "Ace":
                getIntOfFace = 1;
                break;
            case "Deuce":
                getIntOfFace = 2;
                break;
            case "Three":
                getIntOfFace = 3;
                break;
            case "Four":
                getIntOfFace = 4;
                break;
            case "Five":
                getIntOfFace = 5;
                break;
            case "Six":
                getIntOfFace = 6;
                break;
            case "Seven":
                getIntOfFace = 7;
                break;
            case "Eight":
                getIntOfFace = 8;
                break;
            case "Nine":
                getIntOfFace = 9;
                break;
            case "Ten":
                getIntOfFace = 10;
                break;
            case "Jack":
                getIntOfFace = 11;
                break;
            case "Queen":
                getIntOfFace = 12;
                break;
            case "King":
                getIntOfFace = 13;
                break;
        } 
        return getIntOfFace;
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

    public ArrayList<Card> hand() {
        ArrayList<Card> hand = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int randFace;
            int randSuit;
            Card newCard;
            if (hand.size() == 0) {
                randFace = randomNumbers.nextInt(13);
                randSuit = randomNumbers.nextInt(4);
                newCard = new Card(faces[randFace], suits[randSuit]);
                hand.add(newCard);
            } else if ((hand.size() > 0) && (hand.size() < 5)) {
                while (true) {
                    randFace = randomNumbers.nextInt(13);
                    randSuit = randomNumbers.nextInt(4);
                    newCard = new Card(faces[randFace], suits[randSuit]);
                    int inequalityCount = 0;
                    for (int j = 0; j < hand.size(); j++) {
                        if (!((hand.get(j).getFace().equals(faces[randFace])) && (hand.get(j).getSuit().equals(suits[randSuit])))) {
                            inequalityCount += 1;
                        }
                    } 
                    if (inequalityCount == hand.size()) {
                        hand.add(newCard);
                        break;
                    }
                }
            } 
        }
        
        printHand(hand);
        printRankings(hand);
        return hand;
    }

    public ArrayList<ArrayList<Card>> twoHands() {
        ArrayList<Card> allCards = new ArrayList<>();
        ArrayList<Card> hand1 = new ArrayList<>();
        ArrayList<Card> hand2 = new ArrayList<>();
        ArrayList<ArrayList<Card>> twoHandsList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int randFace;
            int randSuit;
            Card newCard;
            if (allCards.size() == 0) {
                randFace = randomNumbers.nextInt(13);
                randSuit = randomNumbers.nextInt(4);
                newCard = new Card(faces[randFace], suits[randSuit]);
                allCards.add(newCard);
            } else if ((allCards.size() > 0) && (allCards.size() < 10)) {
                while (true) {
                    randFace = randomNumbers.nextInt(13);
                    randSuit = randomNumbers.nextInt(4);
                    newCard = new Card(faces[randFace], suits[randSuit]);
                    int inequalityCount = 0;
                    for (int j = 0; j < allCards.size(); j++) {
                        if (!((allCards.get(j).getFace().equals(faces[randFace])) && (allCards.get(j).getSuit().equals(suits[randSuit])))) {
                            inequalityCount += 1;
                        }
                    } 
                    if (inequalityCount == allCards.size()) {
                        allCards.add(newCard);
                        break;
                    }
                }
            } 
        }
        
        for (Card card : allCards) {
            if (hand1.size() < 5) {
                hand1.add(card);
            } else {
                hand2.add(card);
            }
        } 

        twoHandsList.add(hand1);
        twoHandsList.add(hand2);
        
        printHand(hand1);
        printRankings(hand1);
        intRankHand1 = intRank(hand1);

        System.out.println();
        resetParams();

        printHand(hand2);
        printRankings(hand2);
        intRankHand2 = intRank(hand2);

        if (intRankHand1 > intRankHand2) {
            System.out.println("First hand is better");
        } else if (intRankHand1 < intRankHand2) {
            System.out.println("Second hand is better");
        } else if (intRankHand1 == intRankHand2) {
            System.out.println("Both hands are equal");
        }

        
        return twoHandsList;
    }

    public void printHand(ArrayList<Card> hand) {
        for (Card card : hand) {
            System.out.println(card);
        }
    }

    public void printRankings(ArrayList<Card> hand) {
        if (noPair(hand)) {
            System.out.println("NO PAIR");
            System.out.println();
        } else if (onePair(hand)) {
            System.out.println("HAND CONTAINS A PAIR: 2 " + pairsList1.get(0) + "s");
            System.out.println();
        } else if (twoPairs(hand) && (!(threeOfAKind(hand))) && (!(fourOfAKind(hand)))) {
            System.out.println("HAND CONTAINS 2 PAIRS: 2 " + pairsList2.get(0) + "s and 2 " + pairsList2.get(1) + "s");
            System.out.println();
        } else if (threeOfAKind(hand)) {
            System.out.println("HAND CONTAINS THREE OF A KIND: 3 " + pairsList3.get(0) + "s");
            System.out.println();
        } else if (fourOfAKind(hand)) {
            System.out.println("HAND CONTAINS FOUR OF A KIND: 4 " + pairsList4.get(0) + "s");
            System.out.println();
        } else if (flush(hand)) {
            System.out.println("HAND CONTAINS A FLUSH");
            System.out.println();
        } else if (straight(hand)) {
            System.out.println("HAND CONTAINS A STRAIGHT");
            System.out.println();
        } else if (fullHouse(hand)) {
            System.out.println("HAND CONTAINS A FULL HOUSE");
            System.out.println();
        }
    } 

    public boolean fullHouse(ArrayList<Card> hand) {
        ArrayList<String> handFaceValueList = new ArrayList<>();
        for (int i = 0; i < hand.size(); i++) {
            handFaceValueList.add(hand.get(i).getFace());
        }
        for (int i = 0; i < hand.size(); i++) {
            for (int j = 0; j < hand.size(); j++) {
                if (!((i == j))) {
                    if (hand.get(i).getFace().equals(hand.get(j).getFace())) {
                        threeMatchList.add(hand.get(i).getFace());
                        fullHouseRank = getFaceIntOfCard(hand.get(i));
                        
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

    public boolean straight(ArrayList<Card> hand) {
        Card minCard = hand.get(0);
        int sum = 0;
        for (Card card : hand) {
            sum += getFaceIntOfCard(card);
            if (getFaceIntOfCard(minCard) > getFaceIntOfCard(card)) {
                minCard = card;
            }
        } 

        Card rankCard = hand.get(0);
        for (int i = 0; i < hand.size(); i++) {
            if (getFaceIntOfCard(rankCard) < getFaceIntOfCard(hand.get(i))) {
                rankCard = hand.get(i);
            } 
        } 
        straightRank = getFaceIntOfCard(rankCard);

        if (sum == ((getFaceIntOfCard(minCard) * 5) + 10)) {
            isStraight = true;
        } 
        return isStraight;
    }

    public boolean flush(ArrayList<Card> hand) {
        int countToFlush = 0;
        Card helper = hand.get(0);
        for (Card card : hand) {
            if (helper.getSuit().equals(card.getSuit())) {
                countToFlush += 1;
            }
        } 

        Card rankCard = hand.get(0);
        for (int i = 0; i < hand.size(); i++) {
            if (getFaceIntOfCard(rankCard) < getFaceIntOfCard(hand.get(i))) {
                rankCard = hand.get(i);
            } 
        } 
        flushRank = getFaceIntOfCard(rankCard);

        if (countToFlush == hand.size()) {
            isFlush = true;
        } 
        return isFlush;
        
    } 

    public boolean noPair(ArrayList<Card> hand) {
        int pairCounter = 0;
        for (int i = 0; i < hand.size(); i++) {
            for (int j = 0; j < hand.size(); j++) {
                if (hand.get(i).getFace().equals(hand.get(j).getFace())) {
                    pairCounter += 1;
                } 

            }
        } 
        if (pairCounter == hand.size()) {
            containsNoPair = true;
        }


        Card rankCard = hand.get(0);
        for (int i = 0; i < hand.size(); i++) {
            if (getFaceIntOfCard(rankCard) < getFaceIntOfCard(hand.get(i))) {
                rankCard = hand.get(i);
            } 
        } 
        noPairRank = getFaceIntOfCard(rankCard); 

        return containsNoPair;
    }

    public boolean onePair(ArrayList<Card> hand) {
        int pairCounter = 0;
        for (int i = 0; i < hand.size(); i++) {
            for (int j = 0; j < hand.size(); j++) {
                if ((!(i == j)) && (hand.get(i).getFace().equals(hand.get(j).getFace()))) {
                    pairCounter += 1;
                    pairsList1.add(hand.get(i).getFace());
                    onePairRank = getFaceIntOfCard(hand.get(i));
                }
            }
        } 
        
        if (pairCounter == 2) {
            containsOnePair = true;
           
        } 
            
        return containsOnePair;
    }

    public boolean twoPairs(ArrayList<Card> hand) {
        ArrayList<Card> pairsCardsList = new ArrayList<>();
        int matchCount = 0;
        for (int i = 0; i < hand.size(); i++) {
            for (int j = 0; j < hand.size(); j++) {
                if ((!(i == j)) && (hand.get(i).getFace().equals(hand.get(j).getFace()))) {
                    matchCount += 1;
                    if (!(pairsList2.contains(hand.get(i).getFace()))) {
                        pairsList2.add(hand.get(i).getFace());
                        if (twoPairRank < getFaceIntOfCard(hand.get(i))) {
                            twoPairRank = getFaceIntOfCard(hand.get(i));
                        }
                        pairsCardsList.add(hand.get(i));
                    }
                }
            }
        } 

        if (matchCount == 4) {
            containsTwoPairs = true;
        }
        
        return containsTwoPairs;
    } 

    public boolean threeOfAKind(ArrayList<Card> hand) {
        for (int i = 0; i < hand.size(); i++) {
            for (int j = 0; j < hand.size(); j++) {
                if ((!(i == j)) && (hand.get(i).getFace().equals(hand.get(j).getFace()))) {
                    pairsList3.add(hand.get(i).getFace());
                    threeKindRank = getFaceIntOfCard(hand.get(i));
                }
            }
        } 

        if (pairsList3.size() == 6) {
            containsThreeOfAKind = true;
        } 
        return containsThreeOfAKind;
    } 

    public boolean fourOfAKind(ArrayList<Card> hand) {
        for (int i = 0; i < hand.size(); i++) {
            for (int j = 0; j < hand.size(); j++) {
                if ((!(i == j)) && (hand.get(i).getFace().equals(hand.get(j).getFace()))) {
                        pairsList4.add(hand.get(i).getFace());
                        fourKindRank = getFaceIntOfCard(hand.get(i));
                    }
            }
        } 

        if ((pairsList4.size() == 12)) {
            containsFourOfAKind = true;
        } 
        return containsFourOfAKind;
    }

    public int intRank(ArrayList<Card> hand) {
        int intRank = 0;
        if ((noPair(hand)) && noPairRank == 1) {
            intRank = 101;
        } else if ((noPair(hand)) && noPairRank == 2) {
            intRank = 102;
        } else if ((noPair(hand)) && noPairRank == 3) {
            intRank = 103;
        } else if ((noPair(hand)) && noPairRank == 4) {
            intRank = 104;
        } else if ((noPair(hand)) && noPairRank == 5) {
            intRank = 105;
        } else if ((noPair(hand)) && noPairRank == 6) {
            intRank = 106;
        } else if ((noPair(hand)) && noPairRank == 7) {
            intRank = 107;
        } else if ((noPair(hand)) && noPairRank == 8) {
            intRank = 108;
        } else if ((noPair(hand)) && noPairRank == 9) {
            intRank = 109;
        } else if ((noPair(hand)) && noPairRank == 10) {
            intRank = 110;
        } else if ((noPair(hand)) && noPairRank == 11) {
            intRank = 111;
        } else if ((noPair(hand)) && noPairRank == 12) {
            intRank = 112;
        } else if ((noPair(hand)) && noPairRank == 13) {
            intRank = 113;
        } else if ((onePair(hand)) && onePairRank == 1) {
            intRank = 201;
        } else if ((onePair(hand)) && onePairRank == 2) {
            intRank = 202;
        } else if ((onePair(hand)) && onePairRank == 3) {
            intRank = 203;
        } else if ((onePair(hand)) && onePairRank == 4) {
            intRank = 204;
        } else if ((onePair(hand)) && onePairRank == 5) {
            intRank = 205;
        } else if ((onePair(hand)) && onePairRank == 6) {
            intRank = 206;
        } else if ((onePair(hand)) && onePairRank == 7) {
            intRank = 207;
        } else if ((onePair(hand)) && onePairRank == 8) {
            intRank = 208;
        } else if ((onePair(hand)) && onePairRank == 9) {
            intRank = 209;
        } else if ((onePair(hand)) && onePairRank == 10) {
            intRank = 210;
        } else if ((onePair(hand)) && onePairRank == 11) {
            intRank = 211;
        } else if ((onePair(hand)) && onePairRank == 12) {
            intRank = 212;
        } else if ((onePair(hand)) && onePairRank == 13) {
            intRank = 213;
        } else if ((twoPairs(hand)) && twoPairRank == 1) {
            intRank = 301;
        } else if ((twoPairs(hand)) && twoPairRank == 2) {
            intRank = 302;
        } else if ((twoPairs(hand)) && twoPairRank == 3) {
            intRank = 303;
        } else if ((twoPairs(hand)) && twoPairRank == 4) {
            intRank = 304;
        } else if ((twoPairs(hand)) && twoPairRank == 5) {
            intRank = 305;
        } else if ((twoPairs(hand)) && twoPairRank == 6) {
            intRank = 306;
        } else if ((twoPairs(hand)) && twoPairRank == 7) {
            intRank = 307;
        } else if ((twoPairs(hand)) && twoPairRank == 8) {
            intRank = 308;
        } else if ((twoPairs(hand)) && twoPairRank == 9) {
            intRank = 309;
        } else if ((twoPairs(hand)) && twoPairRank == 10) {
            intRank = 310;
        } else if ((twoPairs(hand)) && twoPairRank == 11) {
            intRank = 311;
        } else if ((twoPairs(hand)) && twoPairRank == 12) {
            intRank = 312;
        } else if ((twoPairs(hand)) && twoPairRank == 13) {
            intRank = 313;
        } else if ((threeOfAKind(hand)) && threeKindRank == 1) {
            intRank = 401;
        } else if ((threeOfAKind(hand)) && threeKindRank == 2) {
            intRank = 402;
        } else if ((threeOfAKind(hand)) && threeKindRank == 3) {
            intRank = 403;
        } else if ((threeOfAKind(hand)) && threeKindRank == 4) {
            intRank = 404;
        } else if ((threeOfAKind(hand)) && threeKindRank == 5) {
            intRank = 405;
        } else if ((threeOfAKind(hand)) && threeKindRank == 6) {
            intRank = 406;
        } else if ((threeOfAKind(hand)) && threeKindRank == 7) {
            intRank = 407;
        } else if ((threeOfAKind(hand)) && threeKindRank == 8) {
            intRank = 408;
        } else if ((threeOfAKind(hand)) && threeKindRank == 9) {
            intRank = 409;
        } else if ((threeOfAKind(hand)) && threeKindRank == 10) {
            intRank = 410;
        } else if ((threeOfAKind(hand)) && threeKindRank == 11) {
            intRank = 411;
        } else if ((threeOfAKind(hand)) && threeKindRank == 12) {
            intRank = 412;
        } else if ((threeOfAKind(hand)) && threeKindRank == 13) {
            intRank = 413;
        } else if ((fourOfAKind(hand)) && fourKindRank == 1) {
            intRank = 501;
        } else if ((fourOfAKind(hand)) && fourKindRank == 2) {
            intRank = 502;
        } else if ((fourOfAKind(hand)) && fourKindRank == 3) {
            intRank = 503;
        } else if ((fourOfAKind(hand)) && fourKindRank == 4) {
            intRank = 504;
        } else if ((fourOfAKind(hand)) && fourKindRank == 5) {
            intRank = 505;
        } else if ((fourOfAKind(hand)) && fourKindRank == 6) {
            intRank = 506;
        } else if ((fourOfAKind(hand)) && fourKindRank == 7) {
            intRank = 507;
        } else if ((fourOfAKind(hand)) && fourKindRank == 8) {
            intRank = 508;
        } else if ((fourOfAKind(hand)) && fourKindRank == 9) {
            intRank = 509;
        } else if ((fourOfAKind(hand)) && fourKindRank == 10) {
            intRank = 510;
        } else if ((fourOfAKind(hand)) && fourKindRank == 11) {
            intRank = 511;
        } else if ((fourOfAKind(hand)) && fourKindRank == 12) {
            intRank = 512;
        } else if ((fourOfAKind(hand)) && fourKindRank == 13) {
            intRank = 513;
        } else if ((flush(hand)) && flushRank == 1) {
            intRank = 601;
        } else if ((flush(hand)) && flushRank == 2) {
            intRank = 602;
        } else if ((flush(hand)) && flushRank == 3) {
            intRank = 603;
        } else if ((flush(hand)) && flushRank == 4) {
            intRank = 604;
        } else if ((flush(hand)) && flushRank == 5) {
            intRank = 605;
        } else if ((flush(hand)) && flushRank == 6) {
            intRank = 606;
        } else if ((flush(hand)) && flushRank == 7) {
            intRank = 607;
        } else if ((flush(hand)) && flushRank == 8) {
            intRank = 608;
        } else if ((flush(hand)) && flushRank == 9) {
            intRank = 609;
        } else if ((flush(hand)) && flushRank == 10) {
            intRank = 610;
        } else if ((flush(hand)) && flushRank == 11) {
            intRank = 611;
        } else if ((flush(hand)) && flushRank == 12) {
            intRank = 612;
        } else if ((flush(hand)) && flushRank == 13) {
            intRank = 613;
        } else if ((straight(hand)) && straightRank == 1) {
            intRank = 601;
        } else if ((straight(hand)) && straightRank == 2) {
            intRank = 602;
        } else if ((straight(hand)) && straightRank == 3) {
            intRank = 603;
        } else if ((straight(hand)) && straightRank == 4) {
            intRank = 604;
        } else if ((straight(hand)) && straightRank == 5) {
            intRank = 605;
        } else if ((straight(hand)) && straightRank == 6) {
            intRank = 606;
        } else if ((straight(hand)) && straightRank == 7) {
            intRank = 607;
        } else if ((straight(hand)) && straightRank == 8) {
            intRank = 608;
        } else if ((straight(hand)) && straightRank == 9) {
            intRank = 609;
        } else if ((straight(hand)) && straightRank == 10) {
            intRank = 610;
        } else if ((straight(hand)) && straightRank == 11) {
            intRank = 611;
        } else if ((straight(hand)) && straightRank == 12) {
            intRank = 612;
        } else if ((straight(hand)) && straightRank == 13) {
            intRank = 613;
        } else if ((fullHouse(hand)) && fullHouseRank == 1) {
            intRank = 601;
        } else if ((fullHouse(hand)) && fullHouseRank == 2) {
            intRank = 602;
        } else if ((fullHouse(hand)) && fullHouseRank == 3) {
            intRank = 603;
        } else if ((fullHouse(hand)) && fullHouseRank == 4) {
            intRank = 604;
        } else if ((fullHouse(hand)) && fullHouseRank == 5) {
            intRank = 605;
        } else if ((fullHouse(hand)) && fullHouseRank == 6) {
            intRank = 606;
        } else if ((fullHouse(hand)) && fullHouseRank == 7) {
            intRank = 607;
        } else if ((fullHouse(hand)) && fullHouseRank == 8) {
            intRank = 608;
        } else if ((fullHouse(hand)) && fullHouseRank == 9) {
            intRank = 609;
        } else if ((fullHouse(hand)) && fullHouseRank == 10) {
            intRank = 610;
        } else if ((fullHouse(hand)) && fullHouseRank == 11) {
            intRank = 611;
        } else if ((fullHouse(hand)) && fullHouseRank == 12) {
            intRank = 612;
        } else if ((fullHouse(hand)) && fullHouseRank == 13) {
            intRank = 613;
        } 

        return intRank;
    }


}
