import java.security.SecureRandom;
import java.util.Scanner;

public class GuessTheNumberMOD531 {
    private static final SecureRandom randomNumbers = new SecureRandom();
    public static int upperLimit = 1000;
    public static int lowerLimit = 1;
    public static int rand = 1 + randomNumbers.nextInt(1000);
    public static int count = 0;
    public static boolean play = true;
    //private enum Status {EXACT, HIGH, LOW};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String chatPop;

        while (play) {
            resetParameters();
            System.out.print("Guess a number between " + lowerLimit + " and " + upperLimit + ": ");
            int guess = Integer.valueOf(scanner.nextLine());
            count += 1;
            if (!((guess >= lowerLimit) && (guess <= upperLimit))) {
                System.out.print("Invalid number! ");
                continue;
            } else {
                chatPop = banter(rand, guess, count);
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
                    count += 1;
                    if (!((guess >= lowerLimit) && (guess <= upperLimit))) {
                        System.out.print("Invalid number! ");
                        if (guess > upperLimit) {
                            guess = upperLimit;
                        } else if (guess < lowerLimit) {
                            guess = lowerLimit;
                        }
                    } else {
                        chatPop = banter(rand, guess, count);
                        System.out.println(chatPop);
                        replayGameIfGuessEqualsRand(rand, guess);
                    }
                    
                    
                } else if (guess > rand) {
                    upperLimit = guess;
                    System.out.print("Guess a number between " + lowerLimit + " and " + upperLimit + ": ");
                    guess = Integer.valueOf(scanner.nextLine());
                    count += 1;
                    if (!((guess >= lowerLimit) && (guess <= upperLimit))) {
                        System.out.print("Invalid number! ");
                        if (guess > upperLimit) {
                            guess = upperLimit;
                        } else if (guess < lowerLimit) {
                            guess = lowerLimit;
                        }
                    } else {
                        chatPop = banter(rand, guess, count);
                        System.out.println(chatPop);
                        replayGameIfGuessEqualsRand(rand, guess);     
                    }
                    
                } 

            } 
            resetParameters();
            
        }


        scanner.close();
    } 

    public static String banter(int rand, int guess, int count) {
        String banter = null;
        //String countChatter = null;
        if (guess > rand) {
            banter = "" + guess + " is too high. Try again.";
        } else if (guess < rand) {
            banter = guess + " is too low. Try again.";
        } else {
            String countChatter = null;
            if (count <= 10) {
                countChatter = "Either you know the secret or you got lucky!";
            } 
            if (count == 10) {
                countChatter = "You know the secret!";
            } 
            if (count > 10) {
                countChatter = "You should be able to do better!";
            }
            banter = "Congratulations. You guessed the number " + rand + ", in " + count + " tries! \n\n" + countChatter;
            
        } 

        return banter;
    } 

    public static void resetParameters() {
        upperLimit = 1000;
        lowerLimit = 1;
        rand = 1 + randomNumbers.nextInt(1000);
        count = 0;
        System.out.println();
    }
    public static void replayGameIfGuessEqualsRand(int rand, int guess) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        if ((guess == rand)) {
            System.out.println();
            System.out.println("Would you like to play again? \nIf yes 'YES', else input any value:");
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
