import java.util.Scanner;

public class NumberArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        int count = 0;

        System.out.println("Enter 10 integers between 10 and 100 (inclusive):");

        while (count < 10) {
            try {
                System.out.print("Enter number " + (count + 1) + ": ");
                int input = Integer.parseInt(scanner.nextLine());

                if (input < 10 || input > 100) {
                    throw new IllegalArgumentException("Number must be between 10 and 100.");
                }

                numbers[count] = input;
                count++;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Error: Please enter a valid integer.");
            }
        }

        // Display the array
        System.out.println("\nNumbers in the array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        scanner.close();
    }
}
