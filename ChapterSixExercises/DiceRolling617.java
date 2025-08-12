import java.security.SecureRandom;
import java.util.Arrays;

public class DiceRolling617 {
    public static int limit = 36_000_000;
    public static final SecureRandom randomNumbers = new SecureRandom();
    public static int numOfRolls = 0;
    public static int count2 = 0;
    public static int count3 = 0;
    public static int count4 = 0;
    public static int count5 = 0;
    public static int count6 = 0;
    public static int count7 = 0;
    public static int count8 = 0;
    public static int count9 = 0;
    public static int count10 = 0;
    public static int count11 = 0;
    public static int count12 = 0;

    public static void main(String[] args) {
        while (numOfRolls < limit) {
            switch (rollDice()) {
                case 2:
                    count2 += 1;
                    break;
                case 3:
                    count3 += 1;
                    break;
                case 4:
                    count4 += 1;
                    break;
                case 5:
                    count5 += 1;
                    break;
                case 6:
                    count6 += 1;
                    break;
                case 7:
                    count7 += 1;
                    break;
                case 8:
                    count8 += 1;
                    break;
                case 9:
                    count9 += 1;
                    break;
                case 10:
                    count10 += 1;
                    break;
                case 11:
                    count11 += 1;
                    break;
                case 12:
                    count12 += 1;
                    break;
            } 
            numOfRolls += 1;
        }

        int[] sumsTally = {count2, count3, count4, count5, count6, count7, count8, count9, count10, count11, count12};
        System.out.println(Arrays.toString(sumsTally));
        System.out.printf("%s%10s%n", "Sum", "Frequency");
        for (int i = 0; i < 11; i++) {
            System.out.printf("%3d%10d%n", (i + 2), sumsTally[i]);
        }
    } 

    public static int rollDice() {
        int die1 = 1 + randomNumbers.nextInt(6);
        int die2 = 1 + randomNumbers.nextInt(6);
        int dieSum = die1 + die2;
        return dieSum;
    } 
}
