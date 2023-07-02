package chapter2;

import java.util.Scanner;

public class Exercise2_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the take-off speed (v) in meters/second: ");
        double v = scanner.nextDouble();

        System.out.print("Enter the acceleration (a) in meters/second squared: ");
        double a = scanner.nextDouble();
        double length = (v * v) / (2 * a);

        System.out.println("The minimum runway length for this airplane is " + length);

        scanner.close();

    }
}
