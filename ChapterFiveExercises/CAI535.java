import java.security.SecureRandom;
import java.util.Scanner;

public class CAI535 {
    public static final SecureRandom randomNumbers = new SecureRandom();
    public static int num1; 
    public static int num2;
    public static int correctAnswer;
    public static int count = 0;
    public static boolean newQuestion = true;
    public static boolean reattemptSameQuestion = true;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (newQuestion) {
            generateNewQuestion();
            if (askQuestion() == correctAnswer) {
                System.out.println(goodEnd());
                tryNewQuestion();
            } else {
                System.out.println(reattemptSameQuestion());
            }
            while (reattemptSameQuestion) {
                if (askQuestion() == correctAnswer) {
                    System.out.println(goodEnd());
                    tryNewQuestion();
                    break;
                } else {
                    if (count == 3) {
                        end();
                        tryNewQuestion();    
                        break;
                    } else {
                        System.out.println(reattemptSameQuestion());
                    }
                }
            }  
        } 
        scanner.close();
    } 

    public static void generateNewQuestion() {
        num1 = 1 + randomNumbers.nextInt(9);
        num2 = 1 + randomNumbers.nextInt(9);
        correctAnswer = num1 * num2;
        
    } 

    public static void tryNewQuestion() {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        count = 0;
        System.out.println();
        System.out.println("Do you want to retry? If yes 'YES', else input any value");
        String tryAgain = scanner.nextLine();
        if (tryAgain.equals("YES")) {
            newQuestion = true;
        } else {
            newQuestion = false;
        } 
        //scanner.close(); do not uncomment!!
    } 

    public static String goodEnd() {
        reattemptSameQuestion = false;
        int rand = 1  + randomNumbers.nextInt(1);
        String chatter = null;
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
    }
    

    public static String reattemptSameQuestion() {
        reattemptSameQuestion = true;
        int rand = 1 + randomNumbers.nextInt(1);
        String chatter = null;
        switch (rand) {
                case 1:
                    chatter = "No. Please try again.";
                    break;
                case 2:
                    chatter = "Wrong. Don't stop trying now. ";
                    break;
                case 3:
                    chatter = "Not correct. But d1on't give up!";
                    break;
                case 4:
                    chatter = "No. Keep trying.";
                    break;
            } 
            return chatter;
    } 

    public static void end() {
        reattemptSameQuestion = false;
        System.out.println("No. The answer is " + correctAnswer);
    } 

    public static int askQuestion() {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("How much is " + num1 + " times " + num2 + "?");
        int answer = Integer.valueOf(scanner.nextLine());
        count += 1;
        return answer;
        
    } 
    

}
