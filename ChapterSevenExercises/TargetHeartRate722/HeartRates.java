package TargetHeartRate722;

import java.time.Year;
import java.util.ArrayList;

public class HeartRates {
    private String firstName;
    private String lastName;
    private int monthOfBirth;
    private int dayOfBirth;
    private int yearOfBirth;

    public HeartRates(String firstName, String lastName, int monthOfBirth, int dayOfBirth, int yearOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthOfBirth = monthOfBirth;
        this.dayOfBirth = dayOfBirth;
        this.yearOfBirth = yearOfBirth;
    } 

    public void setFirstName(String name) {
        this.firstName = name;
    } 

    public String getFirstName() {
        return this.firstName.substring(0, 1).toUpperCase() + this.firstName.substring(1).toLowerCase();
    } 

    public void setLastName(String name) {
        this.lastName = name;
    } 

    public String getLastName() {
        return this.lastName.substring(0, 1).toUpperCase() + this.lastName.substring(1).toLowerCase();
    } 

    public void setMonthOfBirth(int month) {
        this.monthOfBirth = month;
    } 

    public int getMonthOfBirth() {
        return this.monthOfBirth;
    } 

    public void setDayOfBirth(int day) {
        this.dayOfBirth = day;
    } 

    public int getDayOfBirth() {
        return this.dayOfBirth;
    } 

    public void setYearOfBirth(int year) {
        this.yearOfBirth = year;
    } 

    public int getYearOfBirth() {
        return this.yearOfBirth;
    } 

    public int currentYear() {
        Year currentYearObject = Year.now();
        int currentYear = currentYearObject.getValue();
        return currentYear;
    }

    public int ageInYears() {
        int age = currentYear() - this.yearOfBirth;
        return age;
    } 

    public int maximumHeartRate() {
        int maximumHeartRate = 220 - this.ageInYears();
        return maximumHeartRate;
    } 

    public ArrayList<Double> targetHeartRateRange() {
        ArrayList<Double> limitsList = new ArrayList<>();
        double lowerLimit = 0.5 * this.maximumHeartRate();
        limitsList.add(lowerLimit);
        double upperLimit = 0.85 * this.maximumHeartRate();
        limitsList.add(upperLimit);
        return limitsList;
    } 

    public String toString() {

        //input.substring(0, 1).toUpperCase() + input.substring(1);

        return "Full name: " + this.getFirstName() + " " + this.getLastName() + 
        "\nMaximimum heart rate: " + this.maximumHeartRate() + 
        "\nTarget heart rate range: (" + targetHeartRateRange().get(0) + ", " + targetHeartRateRange().get(1) + ")";
    }
}
