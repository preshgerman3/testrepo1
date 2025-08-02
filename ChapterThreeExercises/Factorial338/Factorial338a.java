package Factorial338;

import java.util.Scanner;

public class Factorial338a {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        int factorial = 1;
        if (number >= 0) {
            if (number == 0) {
                factorial = 1;
                
            } else {
                for (int i = number; i > 0 ; i--) {
                    factorial *= i;
                }
            }
        } 
        System.out.println(number +"! is: " + factorial);
        scanner.close();





        
    }

    
}