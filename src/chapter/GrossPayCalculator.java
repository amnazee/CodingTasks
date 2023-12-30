package chapter;

import java.util.Scanner;

public class GrossPayCalculator {
    //get the number of hours worked
    //to display output to the console
    public static void main (String[] arg) {
        System.out.println("How many hours did the employee worked?");
        //take the input by the user
        Scanner scanner = new Scanner(System.in); // use to take the input
        int hours = scanner.nextInt();

        //get the hourly pay rate
        System.out.println("Enter the employees pay rate");
        double rate = scanner.nextDouble();
        scanner.close();
        //multiply hours and pay rate
        double grossPay = hours * rate;
        //display result
        System.out.println("The employee gross pay is $ "+grossPay);

    }
}
