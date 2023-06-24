package chapter2;

import java.util.Scanner;

public class Exercise2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value in square meters: ");
        double squazeMetters = sc.nextDouble();
        double ping = squazeMetters * 0.3025;

        System.out.println(squazeMetters + " square meters is equal to " + ping + " ping ");
        sc.close();
    }
}
