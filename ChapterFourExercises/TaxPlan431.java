import java.util.Scanner;

public class TaxPlan431 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.print("Enter housing expenditure: ");
        int housing = scanner.nextInt();
        sum += housing;
        System.out.println();

        System.out.print("Enter food expenditure: ");
        int food = scanner.nextInt();
        sum += food;
        System.out.println();

        System.out.print("Enter clothing expenditure: ");
        int clothing = scanner.nextInt();
        sum += clothing;
        System.out.println();

        System.out.print("Enter transportation expenditure: ");
        int transportation = scanner.nextInt();
        sum += transportation;
        System.out.println();

        System.out.print("Enter education expenditure: ");
        int education = scanner.nextInt();
        sum += education;
        System.out.println();

        System.out.print("Enter healthcare expenditure: ");
        int healthcare = scanner.nextInt();
        sum += healthcare;
        System.out.println();

        System.out.print("Enter vacation expenditure: ");
        int vacations = scanner.nextInt();
        sum += vacations;
        System.out.println();

        double fairTax = sum * 0.23;

        System.out.println("Estimated 2Fair tax: " + fairTax);



        scanner.close();


    }
}
