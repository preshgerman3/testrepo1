package Cryptography339;

import java.util.Scanner;

public class Decrypt339 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 4-digit encrypted integer: ");
        int xCrypt = scanner.nextInt();
        //xCrypt is a 4-digit number: pqrs, where each digit is between 0 and 9 (both inclusive)
        int p = xCrypt / 1000;
        int q = (xCrypt % 1000) / 100;
        int r = (xCrypt % 100) / 10;
        int s = xCrypt % 10;
        xCrypt = (p * 1000) + (q * 100) + (r * 10) + (s * 1);

        //swap the first digit with the third, and swap the second digit with the fourth
        xCrypt = (r * 1000) + (s * 100) + (p * 10) + (q * 1);

        //apply a reverse modulo operation on each digit (add 10, and subtract 7 from the sum)
        int r1;
        int s1;
        int p1;
        int q1;
        if (r <= 6) {
            r1 = (r + 10) - 7;
        } else {
            r1 = r - 7;
        } 

        if (s <= 6) {
            s1 = (s + 10) - 7;
        } else {
            s1 = s - 7;
        } 

        if (p <= 6) {
            p1 = (p + 10) - 7;
        } else {
            p1 = p - 7;
        }

        if (q <= 6) {
            q1 = (q + 10) - 7;
        } else {
            q1 = q - 7;
        }



        int xDecrypt = (r1 * 1000) + (s1 * 100) + (p1 * 10) + (q1 * 1);
        String xDecryptString = null;

        if (r1 == 0) {
            xDecryptString = "0" + xDecrypt;
            System.out.println("Decrypted integer: " + xDecryptString);
        } else {
            System.out.println("Decrypted integer: " + xDecrypt);
        }

        

        scanner.close();

    }
    
}
