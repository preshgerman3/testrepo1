import java.util.Scanner;

public class WorldPopulationGrowth234 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter world population figure (in billions, to one decimal place): ");
        double population1 = scanner.nextDouble(); //world population as 2025, 8.2 billion
        System.out.println("Enter world population growth rate in percentage");
        double growthRate = scanner.nextDouble(); //growth rate as at 2025, 0.85
        
        double estimatedPopulation1 = population1 * (Math.pow((1 + (growthRate * 0.01)), 1)); /*growth rate multiplied by 0.01 to convert to a percentage of 1, 
        instead of a percentage of 100*/ 
        double estimatedPopulation2 = population1 * (Math.pow((1 + (growthRate * 0.01)), 2));
        double estimatedPopulation3 = population1 * (Math.pow((1 + (growthRate * 0.01)), 3));
        double estimatedPopulation4 = population1 * (Math.pow((1 + (growthRate * 0.01)), 4));
        double estimatedPopulation5 = population1 * (Math.pow((1 + (growthRate * 0.01)), 5));

        System.out.println("World population after 1 year is: " + estimatedPopulation1 + " billion");
        System.out.println("World population after 2 years is: " + estimatedPopulation2 + " billion");
        System.out.println("World population after 3 years is: " + estimatedPopulation3 + " billion");
        System.out.println("World population after 4 years is: " + estimatedPopulation4 + " billion");
        System.out.println("World population after 5 years is: " + estimatedPopulation5 + " billion");

        scanner.close();
        
    }
}
