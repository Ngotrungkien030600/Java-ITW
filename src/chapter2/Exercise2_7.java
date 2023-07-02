package chapter2;

import java.util.Scanner;

public class Exercise2_7 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the number in minutes: ");
        long minutes = sc.nextLong();
        long minutesInYears = 365*24*60;
        long years = minutes / minutesInYears;
        long remainingMinutes = minutes % minutesInYears;
        long days = remainingMinutes / (24*60);
        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days.");
        sc.close();
    }
}
