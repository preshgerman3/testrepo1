import java.security.SecureRandom;
import java.util.Scanner;

public class CrapsGame533 {
    private static final SecureRandom randomNumbers = new SecureRandom();
    private enum Status {CONTINUE, WON, LOST};
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;
    public static boolean replay = true;
    public static int bankBalance = 1000;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //resetParameters();
        boolean isWinning;
        boolean toContinue;
        String chatPop;
        int myPoint = 0; // point if no win or loss on first roll
        Status gameStatus; // can contain CONTINUE, WON or LOST
        System.out.println();
        while (replay) {
            System.out.print("Enter wager: ");
            int wager = Integer.valueOf(scanner.nextLine());
            while (true) {
                if (!((wager >= 0) && (wager <= bankBalance))) {
                    System.out.print("Reenter wager: ");
                    wager = Integer.valueOf(scanner.nextLine());
                } else {
                    replay = true;
                    break;
                }
            }
            int sumOfDice = rollDice(); // first roll of the dice
            switch (sumOfDice) {
                case SEVEN: // win with 7 on first roll
                case YO_LEVEN: // win with 11 on first roll
                    gameStatus = Status.WON;
                    break;
                case SNAKE_EYES: // lose with 2 on first roll
                case TREY: // lose with 3 on first roll
                case BOX_CARS: // lose with 12 on first roll
                    gameStatus = Status.LOST;
                    break;
    
                default: // did not win or lose, so remember point
                    gameStatus = Status.CONTINUE; // game is not over
                    myPoint = sumOfDice; // remember the point
                    System.out.printf("Point is %d%n", myPoint);
                    break;
            } 
            while (gameStatus == Status.CONTINUE) {
                isWinning = false;
                toContinue = true;
                chatPop = chatter(isWinning, toContinue);
                System.out.println(chatPop);
                System.out.println();
                sumOfDice = rollDice(); // roll dice again
                if (sumOfDice == myPoint) {
                    gameStatus = Status.WON;
                } else {
                    if (sumOfDice == SEVEN) {
                        gameStatus = Status.LOST;
                    }
                }
            } 

            if (gameStatus == Status.WON) {
                System.out.println("Player wins");
                bankBalance += wager;
                System.out.println("New bank balance: " + bankBalance);
                isWinning = true;
                toContinue = false;
                chatPop = chatter(isWinning, toContinue);
                System.out.println(chatPop);
                System.out.println();
                replay(isWinning, toContinue);

            } else {
                System.out.println("Player loses");
                bankBalance -= wager;
                if (bankBalance == 0) {
                    System.out.println("Sorry. You busted!");
                    System.out.println();
                } else {
                    System.out.println("New bank balance: " + bankBalance);
                    isWinning = false;
                    toContinue = false;
                    chatPop = chatter(isWinning, toContinue);
                    System.out.println(chatPop);
                    System.out.println();
                    replay(isWinning, toContinue);
                }
            } 
        } 
        scanner.close();
        
    }
    public static int rollDice() {
            int die1 = 1 + randomNumbers.nextInt(6); // first die roll
            int die2 = 1 + randomNumbers.nextInt(6); // second die roll
            int sum = die1 + die2; // sum of die values

            System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);

            return sum;
    } 


    public static String chatter(boolean isWinning, boolean toContinue) {
        String chatter = null;
        if (isWinning && !toContinue) {
            //replay = true;
            int winRan = 1 + randomNumbers.nextInt(3);
            switch (winRan) {
                case 1:
                    chatter = "You're up big. Now's the time to cash in your chips!";
                    break;
            
                case 2:
                    chatter = "We up!";
                    break;

                case 3:
                    chatter = "Woohoo!";
                    break;
            } 
            
        } else if (!isWinning && !toContinue){ 
            int winRan = 1 + randomNumbers.nextInt(3);
            switch (winRan) {
                case 1:
                    chatter = "Aw c'mon, take a chance!";
                    break;
            
                case 2:
                    chatter = "You're going for broke, huh?";
                    break;

                case 3:
                    chatter = "Not again!";
                    break;

            }

        } else if (toContinue) {
            int winRan = 1 + randomNumbers.nextInt(5);
            switch (winRan) {
                case 1:
                    chatter = "Keep rolling!";
                    break;
            
                case 2:
                    chatter = "Let's hit that point!";
                    break;

                case 3:
                    chatter = "We go again!";
                    break;

                case 4:
                    chatter = "The next roll might be your lucky one!";
                    break;

                case 5:
                    chatter = "Gotta roll that point!";
                    break;

            }
        }
        return chatter;
    } 

    public static void resetParameters() {
        bankBalance = 1000;
    }

    public static void replay(boolean isWinning, boolean toContinue) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        if (isWinning && !toContinue) {
            bankBalance = 1000;
            System.out.println("Would you like to replay the game? If yes 'YES', else input any value");
            String input = scanner.nextLine();
            if (input.equals("YES")) {
                replay = true;
                System.out.println();
            } else {
                replay = false;
                System.out.println();
                System.out.println("THE END");
           
            }

        } else if (!isWinning && !toContinue) {
            bankBalance = 1000;
            System.out.println("Would you like to replay the game? If yes 'YES', else input any value");
            String input = scanner.nextLine();
            if (input.equals("YES")) {
                replay = true;
                System.out.println();
            } else {
                replay = false;
                System.out.println();
                System.out.println("THE END");
            }

        }

    }
    
}
