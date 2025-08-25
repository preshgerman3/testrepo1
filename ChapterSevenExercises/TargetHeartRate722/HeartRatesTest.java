package TargetHeartRate722;

import java.util.Scanner;

public class HeartRatesTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Your details");
        System.out.print("Enter firstname: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter lastname: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter month of birth (for example, July is '7'): ");
        int monthOfBirth = Integer.valueOf(scanner.nextLine());
        System.out.print("Enter day of birth: ");
        int dayOfBirth = Integer.valueOf(scanner.nextLine());
        System.out.print("Enter year of birth: ");
        int yearOfBirth = Integer.valueOf(scanner.nextLine());

        System.out.println();
        HeartRates ada = new HeartRates(firstName, lastName, monthOfBirth, dayOfBirth, yearOfBirth);
        System.out.println(ada);

        scanner.close();
    } 

    
}
