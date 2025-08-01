import java.util.Scanner;

public class PizaPyramid235 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of stones: "); 
        double numOfStones = scanner.nextDouble(); // google says 2300000 (2.3 million)

        System.out.print("Enter average weight of each stone (in tons): ");
        double avgWeightOfEachStone = scanner.nextDouble(); // google says 2.5 tons

        System.out.print("Enter number of years: ");
        int numOfYears = scanner.nextInt(); // google says 20 years
        double totalWeight = avgWeightOfEachStone * numOfStones;
        double weightBuiltEachYear = totalWeight / numOfYears;
        double weightBuiltEachHour = weightBuiltEachYear / (365 * 24);
        double weightBuiltEachMinute = weightBuiltEachHour / 60;

        System.out.println("Weight built each year: " + weightBuiltEachYear + " tons");
        System.out.println("Weight built each hour: " + weightBuiltEachHour + " tons");
        System.out.println("Weight built each minute: " + weightBuiltEachMinute + " tons");

        scanner.close();
    }
}
