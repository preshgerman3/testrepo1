package Factorial338;

import java.util.Scanner;

public class ConstantEX338c {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int number = scanner.nextInt();
        System.out.print("Enter value of x: ");
        int x = scanner.nextInt();
        int factorial = 1;
        double eX = 1.0;
        if (number >= 0) {
            if (number == 0) {
                factorial = 1;
                eX = 0;
                
            } else {
                if (number == 1) {
                    factorial = 1;
                    eX = (1.0 * (Math.pow(x, number - 1))) / (1);
                } else {
                    eX = (1.0) / (factorial);
                    for (int i = 2; i <= number ; i++) {
                        factorial *= i - 1;
                        eX += (1.0 * (Math.pow(x, i - 1))) / (factorial);
                    
                    }
                }
                
            }
        } 
        System.out.println("The value of e^x for x = " + x + ", and for " + number + " terms is: " + eX);
        
        scanner.close();
    }
    
}
