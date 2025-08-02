package Cryptography339;
import java.util.Scanner;

public class Encrypt339 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 4-digit integer: ");
        int x = scanner.nextInt();
        //x is a 4-digit number: abcd, where each digit is between 0 and 9 (both inclusive)
        int a = x / 1000;
        int b = (x % 1000) / 100;
        int c = (x % 100) / 10;
        int d = x % 10;
        if (!(((a >= 0) && (a <= 9)) && ((b >= 0) && (b <= 9)) && ((c >= 0) && (c <= 9)) && ((d >= 0) && (d <= 9)))) {
            System.out.println(x + " is not a 4-digit number!");
        } else {
            /*Replace each digit with the result of adding 7 to the 
            digit and getting the remainder after dividing the new value by 10 */
            int a1 = (a + 7) % 10;
            int b1 = (b + 7) % 10;
            int c1 = (c + 7) % 10;
            int d1 = (d + 7) % 10;

            //swap the first digit with the third, and swap the second digit with the fourth
            int xCrypt = (c1 * 1000) + (d1 * 100) + (a1 * 10) + (b1 * 1);
            
            System.out.println("Encrypted integer: " + xCrypt);
        }
        
        scanner.close();
    }
}
