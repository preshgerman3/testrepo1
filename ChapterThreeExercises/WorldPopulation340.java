import java.util.Scanner;

public class WorldPopulation340 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter world population figure (in billions, to one decimal place): ");
        double populationToday = scanner.nextDouble(); //world population as 2025, 8.2 billion
        System.out.print("Enter world population growth rate in percentage: ");
        double growthRate = scanner.nextDouble(); //growth rate as at 2025, 0.85
        System.out.print("Enter number of years: ");
        int numOfYears = scanner.nextInt();
        System.out.println();
        
        
        System.out.print("Year");
        System.out.print("     ");
        System.out.print("Estimated Population");
        System.out.print("     ");
        System.out.println("Population Increase");
        for (int x = 1; x <= numOfYears; x++) {
            // we can have numOfYears = 75
            double estimatedPopulationX = populationToday * (Math.pow((1 + (growthRate * 0.01)), x));
            double estimatedPopulationXMinus1 = populationToday * (Math.pow((1 + (growthRate * 0.01)), x - 1));
            double populationIncrease = estimatedPopulationX - estimatedPopulationXMinus1;
            System.out.println(x + "        " + estimatedPopulationX + "        " + populationIncrease);
            
        } 

        for (int x = 1; x <= numOfYears; x++) {
            // we can have numOfYears = 75
            double estimatedPopulationX = populationToday * (Math.pow((1 + (growthRate * 0.01)), x));
            double estimatedPopulationXMinus1 = populationToday * (Math.pow((1 + (growthRate * 0.01)), x - 1));
            double populationIncrease = estimatedPopulationX - estimatedPopulationXMinus1;


            if (x == 1) {
                System.out.println("World population after 1 year is: " + estimatedPopulationX + ", and population increase is: " + populationIncrease);
            } else if (x > 1) {
                System.out.println("World population after " + x + " years is: " + estimatedPopulationX + ", and population increase is: " + populationIncrease);
            }
            
        } 

        System.out.println();

        for (int x = 1; x <= 1000; x++) {
            double estimatedPopulationX = populationToday * (Math.pow((1 + (growthRate * 0.01)), x));
            //since we're dealing with doubles, we can only determine population doubling within an interval
            if ((estimatedPopulationX - (2 * populationToday)) >= 0 &&  (estimatedPopulationX - (2 * populationToday)) <= 0.015) {
                System.out.println("Population will double in " + x + " years");
                break;
            }
        } 



        scanner.close();
        
    }
}
