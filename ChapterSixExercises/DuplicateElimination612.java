import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DuplicateElimination612 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] readIntoArray = new int[10];
        Arrays.fill(readIntoArray, -1);
        ArrayList<Integer> duplicateValues = new ArrayList<>();
        for (int i = 0; i < readIntoArray.length; i++) {
            System.out.println();
            System.out.print("Enter number between 10 and 100, both inclusive: ");
            int input = Integer.valueOf(scanner.nextLine());
                if ((input >= 10) && (input <= 100)) {
                    readIntoArray[i] = input;
                } else {
                    while (true) {
                        System.out.println("Invalid number!");
                        System.out.println("Enter number between 10 and 100, both inclusive: ");
                        int inputBranch = Integer.valueOf(scanner.nextLine());
                        if ((inputBranch >= 10) && (inputBranch <= 100)) {
                            readIntoArray[i] = inputBranch;
                            break;
                        }
                    }
                    
                }

            /*try {
                input = Integer.valueOf(scanner.nextLine());
                if ((input >= 10) && (input <= 100)) {
                    readIntoArray[i] = input;
                }
                
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println(e);
                //System.out.printf("%d", readIntoArray[i]);
                System.out.printf("%d", input);
            } */


            //int input = Integer.valueOf(scanner.nextLine());
            
        }
        System.out.println();
        System.out.println("Array:");
        System.out.println(Arrays.toString(readIntoArray));

        for (int i = 0; i < readIntoArray.length; i++) {
            for (int j = 0; j < readIntoArray.length; j++) {
                if (!(j == i)) {
                    if (readIntoArray[j] == readIntoArray[i]) {
                        if (!(duplicateValues.contains(readIntoArray[j]))) {
                            readIntoArray[j] = -1;
                        }
                    }
                }
            }
        } 
        
        System.out.println();
        System.out.printf("%5s%6s%n", "Index", "Value");
        for (int i = 0; i < readIntoArray.length; i++) {
            if (readIntoArray[i] != -1) {
                System.out.printf("%5d%6d%n", i, readIntoArray[i]);
            }
        } 
        System.out.println();
        System.out.println("The omitted indices are the duplicate values");
            
        scanner.close();
    } 

}
