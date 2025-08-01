import java.util.Scanner;

public class NegativePositiveZero232 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int negNumsCount = 0;
        int posNumsCount = 0;
        int zerosCount = 0;

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        if (num1 < 0) {
            negNumsCount += 1;
        } else if (num1 > 0) {
            posNumsCount += 1;
        } else {
            zerosCount += 1;
        }

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        if (num2 < 0) {
            negNumsCount += 1;
        } else if (num2 > 0) {
            posNumsCount += 1;
        } else {
            zerosCount += 1;
        }
            
        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();
        if (num3 < 0) {
            negNumsCount += 1;
        } else if (num3 > 0) {
            posNumsCount += 1;
        } else {
            zerosCount += 1;
        }

        System.out.print("Enter fourth number: ");
        int num4 = scanner.nextInt();
        if (num4 < 0) {
            negNumsCount += 1;
        } else if (num4 > 0) {
            posNumsCount += 1;
        } else {
            zerosCount += 1;
        }

        System.out.print("Enter fifth number: ");
        int num5 = scanner.nextInt();
        if (num5 < 0) {
            negNumsCount += 1;
        } else if (num5 > 0) {
            posNumsCount += 1;
        } else {
            zerosCount += 1;
        }

        System.out.println("Number of negative inputs: " + negNumsCount);
        System.out.println("Number of positive inputs: " + posNumsCount);
        System.out.println("Number of zeros: " + zerosCount);

        scanner.close();

    }
}
