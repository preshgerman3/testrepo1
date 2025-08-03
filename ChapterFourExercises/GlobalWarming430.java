import java.util.Scanner;

public class GlobalWarming430 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;


        System.out.println("Question 1: Which of the following is a primary greenhouse gas responsible for global warming?");
        System.out.println("1. Oxygen");
        System.out.println("2. Nitrogen");
        System.out.println("3. Carbon dioxide");
        System.out.println("4. Hydrogen");
        System.out.print("Enter answer: ");
        String a1 = scanner.nextLine();
        if (a1.equals("3")) {
            count += 1;
            System.out.println("Correct!");
            
        } else {
            System.out.println("Wrong!");
        }

        System.out.println();

        System.out.println("Question 2: Melting glaciers and ice sheets are a direct consequence of:");
        System.out.println("1. Decreasing global temperatures");
        System.out.println("2. Rising sea levels");
        System.out.println("3. Increasing volcanic activity");
        System.out.println("4. Decreasing solar radiation");
        System.out.print("Enter answer: ");
        String a2 = scanner.nextLine();
        if (a2.equals("2")) {
            count += 1;
            System.out.println("Correct!");
        } else {
            System.out.println("Wrong!");
        }

        System.out.println();


        System.out.println("Question 3: Deforestation contributes to global warming by:");
        System.out.println("1. Increasing the Earth's albedo");
        System.out.println("2. Reducing the amount of carbon dioxide absorbed by trees");
        System.out.println("3. Increasing the amount of oxygen in the atmosphere");
        System.out.println("4. Cooling the planet");
        System.out.print("Enter answer: ");
        String a3 = scanner.nextLine();
        if (a3.equals("2")) {
            count += 1;
            System.out.println("Correct!");
        } else {
            System.out.println("Wrong!");
        }

        System.out.println();

        System.out.println("Question 4: What is the main goal of the Paris Agreement?");
        System.out.println("1. To increase global temperatures");
        System.out.println("2. To phase out fossil fuels by 2050");
        System.out.println("3. To limit global warming to well below 2 degrees Celsius above pre-industrial levels");
        System.out.println("4. To increase deforestation rates");
        System.out.print("Enter answer: ");
        String a4 = scanner.nextLine();
        if (a4.equals("3")) {
            count += 1;
            System.out.println("Correct!");
        } else {
            System.out.println("Wrong!");
        }

        System.out.println();

        System.out.println("Question 5: Which of the following is an example of climate change mitigation?");
        System.out.println("1. Building more coastal defenses");
        System.out.println("2. Promoting renewable energy sources");
        System.out.println("3. Relocating populations away from coastal areas");
        System.out.println("4. Developing drought-resistant crop");
        System.out.print("Enter answer: ");
        String a5 = scanner.nextLine();
        if (a5.equals("2")) {
            count += 1;
            System.out.println("Correct!");
        } else {
            System.out.println("Wrong!");
        }

        String remark;
        switch (count) {
            case 1:
                remark = "Time to brush up on your knowledge of global warming";
                break;
            
            case 2:
                remark = "Time to brush up on your knowledge of global warming";
                break;

            case 3:
                remark = "Time to brush up on your knowledge of global warming";
                break;

            case 4:
                remark = "Very good";
                break;
        
            default:
                remark = "Excellent";
                break;
        }

        System.out.println();
        System.out.println("You got " + count + " questions correct. " + remark);
        

        scanner.close();
         
        
        

    }
}
