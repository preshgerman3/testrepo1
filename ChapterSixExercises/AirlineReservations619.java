import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AirlineReservations619 {
    public static String outline = null;
    public static ArrayList<String> outlineList = new ArrayList<>();
    public static int count = 0;
    public static ArrayList<String> assignedSeats = new ArrayList<>();
    public static boolean[] taken = new boolean[10];
    public static ArrayList<String> outStrings = new ArrayList<>();
    public static String outUnSplit = null;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Arrays.fill(taken, false);
        int size = 10;
        String fillValue = null;
        for (int i = 0; i < size; i++) {
            assignedSeats.add(fillValue);
        }
        boolean firstClassFull = false;
        boolean economyFull = false;
        
        while (count < 10) {
            prompt(firstClassFull, economyFull);
            String input = scanner.nextLine();
            if (input.equals("1")) {
                if (!(taken[0])) {
                   takenFirst(0);
                } else if (!(taken[1])) {
                   takenFirst(1);
                } else if (!(taken[2])) {
                   takenFirst(2);
                } else if (!(taken[3])) {
                   takenFirst(3);
                } else if (!(taken[4])) {
                   takenFirst(4);
                   firstClassFull = true;
                } 
            } else if (input.equals("2")) {
                if (!(taken[5])) {
                   takenEconomy(5);
                } else if (!(taken[6])) {
                   takenEconomy(6);
                } else if (!(taken[7])) {
                   takenEconomy(7);
                } else if (!(taken[8])) {
                   takenEconomy(8);
                } else if (!(taken[9])) {
                   takenEconomy(9);
                   economyFull = true;
                } 
            } else {
                System.out.println("Next flight leaves in 3 hours.");
            }  
        } 

        System.out.println();
        System.out.printf("%s%6s%13s%n", "User", "Seat", "Class");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%4d%5s%14s%n", (i + 1), outStrings.get(i).split(" ")[1], outStrings.get(i).split(" ")[2]);
        }

        System.out.println();
        /*for (String string : outlineList) {
            System.out.println(string);
        } 
        System.out.println();*/

        scanner.close();
    } 

    public static void takenFirst(int i) {
        assignedSeats.set(i, "First Class"); 
        taken[i] = true;
        count += 1;
        outline = "User " + count + ": Seat " + (i + 1) + ". First Class";
        outlineList.add(outline);
        outUnSplit = count + " " + (i + 1) + " " + "First-class";
        outStrings.add(outUnSplit);
        System.out.println(outline);
    } 

    public static void takenEconomy(int i) {
        assignedSeats.set(i, "Economy"); 
        taken[i] = true;
        count += 1;
        outline = "User " + count + ": Seat " + (i + 1) + ". Economy";
        outlineList.add(outline);
        outUnSplit = count + " " + (i + 1) + " " + "Economy";
        outStrings.add(outUnSplit);
        System.out.println(outline);
    } 

    public static void prompt(boolean firstClassFull, boolean economyFull) {
        System.out.println();
        if ((!(firstClassFull)) && (!(economyFull))) {
            System.out.print("Please type 1 for First Class and type 2 for Economy: ");
        } else if ((!(firstClassFull)) && ((economyFull))) {
            System.out.println();
            System.out.print("All Economy seats are taken." + "\nWould you like to be placed in the First-class section? If yes type 1, else type any value: ");
        } else if ((taken[4]) && ((firstClassFull)) && (!(economyFull))) {
            System.out.println();
            System.out.print("All First-class seats are taken." + "\nWould you like to be placed in the Economy section? If yes type 2, else type any other value: ");
        } 
    }
}
