package Factorial338;

import java.util.Scanner;

public class ConstantE338b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        int factorial = 1;
        double e = 1.0;
        if (number >= 0) {
            if (number == 0) {
                factorial = 1;
                e = 0;
                
            } else {
                if (number == 1) {
                    factorial = 1;
                    e = (1.0) / (1);
                } else {
                    e = (1) / (factorial);
                    for (int i = 2; i <= number ; i++) {
                        factorial *= i - 1;
                        e += (1.0) / (factorial);
                    
                    }
                }
                
            }
        } 
        System.out.println("The value of e for " + number + " terms is: " + e);

        scanner.close();
    }
}
