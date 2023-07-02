package chapter2;

import java.util.Scanner;

public class Exercise2_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the amount of water in kilogram: ");
        double m = sc.nextDouble();

        System.out.println("Enter the inital tempera in degrees celsius: ");
        double innitialtemperature = sc.nextDouble();
        System.out.println("Enter the final temperature in degrees celsius: ");
        double finalTemperature = sc.nextDouble();
        double Q = m * (finalTemperature - innitialtemperature) * 4184;

        System.out.println("The energy needed is " + Q);
        sc.close();
    }
}
