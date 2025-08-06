import java.security.SecureRandom;
import java.util.Scanner;

public class CAI535 {
    public static final SecureRandom randomNumbers = new SecureRandom();
    public static int num1; 
    public static int num2; 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean newQuestion = true;
        boolean reattempt = true;
        int numProd; // = num1 * num2;
        while (newQuestion) {
            generateNewQuestion();
            numProd = num1 * num2;
            System.out.println();
            System.out.println("How much is " + num1 + " times " + num2 + "?");
            int answer = Integer.valueOf(scanner.nextLine());
            if (answer == numProd) {
                reattempt = false;
                System.out.println("Very good!");
                newQuestion = true;
            } else {
                reattempt = true;
                System.out.println("No. Please try again.");
            }
            while (reattempt) {
                System.out.println();
                System.out.println("How much is " + num1 + " times " + num2 + "?");
                answer = Integer.valueOf(scanner.nextLine());
                if (answer == numProd) {
                    reattempt = false;
                    System.out.println("Very good!");
                    newQuestion = true;
                    break;
                } else {
                    reattempt = true;
                    System.out.println("No. Please try again.");
                }
            }
        } 
        scanner.close();
    } 

    public static void generateNewQuestion() {
        num1 = 1 + randomNumbers.nextInt(9);
        num2 = 1 + randomNumbers.nextInt(9);

    }
}
