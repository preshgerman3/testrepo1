package CardShuffling719;

import java.util.Scanner;

public class DeckOfCardsTest {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DeckOfCards myDeckOfCards = new DeckOfCards(scanner);
        DeckOfCards deck1 = new DeckOfCards(scanner);
        
        //myDeckOfCards.shuffle();

        /*for (int i = 1; i <= 52; i++) {
            System.out.printf("%-19s", myDeckOfCards.dealCard());

            if (i % 4 == 0) {
                System.out.println();
            }
        } */

        //myDeckOfCards.printRankings(myDeckOfCards.hand());
        //myDeckOfCards.hand();
        //myDeckOfCards.twoHands();
        //myDeckOfCards.compareTwoHands(myDeckOfCards.twoHands());
        
        //myDeckOfCards.compareTwoHands(myDeckOfCards.twoHands());

        //deck1.compareHands(deck1.hand(), deck1.hand()); 

       
        //myDeckOfCards.compareTwoHands(myDeckOfCards.hand(), deck1.hand());

        //myDeckOfCards.compareTwoHands(myDeckOfCards.twoHands());

        //myDeckOfCards.printDeckList();
        //myDeckOfCards.makeDeckList();

        //myDeckOfCards.printList(myDeckOfCards.makeDeckList());

        //myDeckOfCards.draw();

       // myDeckOfCards.firstDrawTwoHands();
        //myDeckOfCards.repeatDraws();
        //myDeckOfCards.secondDrawTwoHands();
        //myDeckOfCards.checkWins();

        myDeckOfCards.replayGame();
        
    } 


    
}
