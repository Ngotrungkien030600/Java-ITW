package chapter2;

import java.util.Scanner;

public class Exercise2_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer between 0 and 1000 : ");
        int number = sc.nextInt();
        if(number < 0 || number > 1000){
            System.out.println("Invalid input .please enter an integer between 0 and 1000: ");
            return;
        }
        int multipplication = 1;
        int remainingNumber =number;
        while (remainingNumber != 0){
            int digit =  remainingNumber % 10;
            multipplication *= digit;
            remainingNumber /= 10;
        }
        System.out.println(" The multipplication of all digit is:  " + multipplication);
        sc.close();
    }
}
