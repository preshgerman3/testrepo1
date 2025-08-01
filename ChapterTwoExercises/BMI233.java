import java.util.Scanner;

public class BMI233 {
    public static void main(String[] args) {
        //this calculates BMI in Kilograms and Meters


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your weight (in Kilograms): ");
        int weightKg = scanner.nextInt();
        System.out.print("Enter your height (in Meters): ");
        double heightMeters = scanner.nextDouble(); // i decided to use double instead of int
        double bmi = (weightKg) / (heightMeters * heightMeters); 

        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi <= 24.9) {
            System.out.println("Healthy");
        } else if (bmi <= 29.9) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obesity");
        }

        scanner.close();
    }
}
