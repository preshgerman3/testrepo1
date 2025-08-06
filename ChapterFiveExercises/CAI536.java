import java.security.SecureRandom;
import java.util.Scanner;

public class CAI536 {
    public static final SecureRandom randomNumbers = new SecureRandom();
    public static int num1; 
    public static int num2; 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean newQuestion = true;
        boolean reattempt = true;
        int numProd;
        String chatPop = null;
        while (newQuestion) {
            generateNewQuestion();
            numProd = num1 * num2;
            System.out.println();
            System.out.println("How much is " + num1 + " times " + num2 + "?");
            int answer = Integer.valueOf(scanner.nextLine());
            if (answer == numProd) {
                reattempt = false;
                chatPop = chattter(answer, numProd);
                System.out.println(chatPop);
                newQuestion = true;
            } else {
                reattempt = true;
                chatPop = chattter(answer, numProd);
                System.out.println(chatPop);
            }
            while (reattempt) {
                System.out.println();
                System.out.println("How much is " + num1 + " times " + num2 + "?");
                answer = Integer.valueOf(scanner.nextLine());
                if (answer == numProd) {
                    reattempt = false;
                    chatPop = chattter(answer, numProd);
                    System.out.println(chatPop);
                    newQuestion = true;
                    break;
                } else {
                    reattempt = true;
                    chatPop = chattter(answer, numProd);
                    System.out.println(chatPop);
                }
            }
        } 
        scanner.close();
    } 

    public static void generateNewQuestion() {
        num1 = 1 + randomNumbers.nextInt(9);
        num2 = 1 + randomNumbers.nextInt(9);
    } 

    public static String chattter(int answer, int numProd) {
        String chatter = null;
        int rand = 1 + randomNumbers.nextInt(4);
        if (answer == numProd) {

            switch (rand) {
                case 1:
                    chatter = "Very good!";
                    break;
                case 2:
                    chatter = "Excellent!";
                    break;
                case 3:
                    chatter = "Nice work!";
                    break;
                case 4:
                    chatter = "Keep up the good work!";
                    break;
            }
            return chatter;
        } else {
            switch (rand) {
                case 1:
                    chatter = "No. Please try again.";
                    break;
                case 2:
                    chatter = "Wrong. Try once more. ";
                    break;
                case 3:
                    chatter = "Don't give up!";
                    break;
                case 4:
                    chatter = "No. Keep trying.";
                    break;
            }
            return chatter;
        }
    }
}
