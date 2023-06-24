package chapter2;

import java.util.Scanner;

public class Exercise2_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the subtotal: ");
        double subtotal = sc.nextDouble();
        System.out.print("Enter the gratuity rate (in percentage): ");
        double grattuityRate = sc.nextDouble();
        double gratuity = subtotal *  (grattuityRate / 100) ;
        double total = subtotal + gratuity;
        System.out.println("Gratuity: $" + gratuity);
        System.out.println("Total: $" + total);
        sc.close();



    }
}
