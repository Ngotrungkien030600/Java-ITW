package chapter2;

import java.util.Scanner;

public class Exercise2_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of years: ");
        int years = sc.nextInt();
        int currentPopulation = 312032486;
        int secondsPerYear = 365 * 24 * 60 * 60;
        int birthsPeryear = secondsPerYear / 7;
        int deathsPeryear =  secondsPerYear / 13;
        int  immigrantsPerYear = secondsPerYear / 45;
        int projectedPoplation =  currentPopulation + (birthsPeryear - deathsPeryear + immigrantsPerYear) * years;
        System.out.println("The population in " + years + " year is " + projectedPoplation);
        sc.close();
    }
}
