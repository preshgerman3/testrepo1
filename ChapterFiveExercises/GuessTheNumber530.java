import java.security.SecureRandom;
import java.util.Scanner;

public class GuessTheNumber530 {
    private static final SecureRandom randomNumbers = new SecureRandom();
    public static int upperLimit = 1000;
    public static int lowerLimit = 1;
    public static int rand = 1 + randomNumbers.nextInt(1000);
    //private enum Status {EXACT, HIGH, LOW};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean play = true;
        String chatPop;

        while (play) {
            System.out.print("Guess a number between " + lowerLimit + " and " + upperLimit + ": ");
            int guess = Integer.valueOf(scanner.nextLine());
            if (!((guess >= lowerLimit) && (guess <= upperLimit))) {
                System.out.print("Invalid number! ");
                continue;
            } else {
                chatPop = banter(rand, guess);
                System.out.println(chatPop);
                if (guess == rand) {
                    break;
            }
            }
            while (!(guess == rand)) {
                if (guess < rand) {
                    lowerLimit = guess;
                    System.out.print("Guess a number between " + lowerLimit + " and " + upperLimit + ": ");
                    guess = Integer.valueOf(scanner.nextLine());
                    if (!((guess >= lowerLimit) && (guess <= upperLimit))) {
                        System.out.print("Invalid number! ");
                        if (guess > upperLimit) {
                            guess = upperLimit;
                        } else if (guess < lowerLimit) {
                            guess = lowerLimit;
                        }
                    } else {
                        chatPop = banter(rand, guess);
                        System.out.println(chatPop);
                        if ((guess == rand)) {
                            System.out.println("If yes, enter YES. If no, enter any other string:");
                            String replay = scanner.nextLine();
                            if (replay.equals("YES")) {
                                play = true;
                            } else {
                                System.out.println();
                                System.out.println("THE END");
                                play = false;
                            }
                        }  
                    }
                    
                } else if (guess > rand) {
                    upperLimit = guess;
                    System.out.print("Guess a number between " + lowerLimit + " and " + upperLimit + ": ");
                    guess = Integer.valueOf(scanner.nextLine());
                    if (!((guess >= lowerLimit) && (guess <= upperLimit))) {
                        System.out.print("Invalid number! ");
                        if (guess > upperLimit) {
                            guess = upperLimit;
                        } else if (guess < lowerLimit) {
                            guess = lowerLimit;
                        }
                    } else {
                        chatPop = banter(rand, guess);
                        System.out.println(chatPop);
                        if ((guess == rand)) {
                            System.out.println("If yes, enter YES. If no, enter any other string:");
                            String replay = scanner.nextLine();
                            if (replay.equals("YES")) {
                                play = true;
                            } else {
                                System.out.println();
                                System.out.println("THE END");
                                play = false;
                            }
                        }       
                    }
                } 

            } 
            resetParameters();
            
        }


        scanner.close();
    } 

    public static String banter(int rand, int guess) {
        String banter = null;
        if (guess > rand) {
            banter = "" + guess + " is too high. Try again.";
        } else if (guess < rand) {
            banter = guess + " is too low. Try again.";
        } else {
            banter = "Congratulations. You guessed the number " + rand + "! \n\nWould you like to play again?";
        } 

        return banter;
    } 

    public static void resetParameters() {
        upperLimit = 1000;
        lowerLimit = 1;
        rand = 1 + randomNumbers.nextInt(1000);
    }


}
