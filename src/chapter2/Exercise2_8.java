package chapter2;

import java.util.Scanner;

public class Exercise2_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the time zone offset to GMT: ");
        int timeZoneOffset = sc.nextInt();
        long totalMilliSeconds = System.currentTimeMillis();
        long totalSeconds = totalMilliSeconds / 1000;
        long currentSeconds = totalSeconds % 60;
        long totalMinites = totalSeconds / 60;
        long currentMinutes = totalMinites % 60;
        long totalHours = totalMinites /60;
        long currentHours = (totalHours+timeZoneOffset) %24;
        System.out.println("Current time: " + currentHours + ":" + currentMinutes + ":" + currentSeconds + " GMT");
        sc.close();
    }
}
