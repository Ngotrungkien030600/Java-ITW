package chapter2;

import java.util.Scanner;

public class Exercise2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a value in miles ");
        double miles = sc.nextDouble();
        double kilometers = miles * 1.6;
        System.out.println(miles + " miles is equal to " + kilometers + " kilometers ");

        sc.close();
    }
}
