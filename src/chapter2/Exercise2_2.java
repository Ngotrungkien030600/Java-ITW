package chapter2;

import java.util.Scanner;

public class Exercise2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the equilateral triangle: ");
        double sideLength = sc.nextDouble();

        double area = (Math.sqrt(3) / 4) * Math.pow(sideLength, 2);

        double volume = area * sideLength;

        System.out.println("Area of the equilateral triangle: " + area);
        System.out.println("Volume of the equilateral triangle: " +volume);

        sc.close();
    }
}
