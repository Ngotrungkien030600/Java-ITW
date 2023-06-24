package chapter2;

import java.util.Scanner;

public class Exercise2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a valque in meters: ");
        double meters = sc.nextDouble();
        double feet = meters * 3.2786;

        System.out.println(meters + " meters is equal to " + feet + " feet ");

        sc.close();
    }
}
