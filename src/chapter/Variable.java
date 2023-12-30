package chapter;

import java.util.Scanner;

public class Variable {
    public static void main (String[] arg){

        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the plan fee: ");
        double baseCost=scanner.nextDouble();
        System.out.print("Enter the overage minutes: ");
        double overageMinutes=scanner.nextDouble();
        scanner.close();

        double overageCharge=calculateOverage(overageMinutes);
        double tax=calculateTax(baseCost+overageCharge);
        calculateAndPrint(baseCost,overageCharge,tax);
    }

    public static double calculateOverage(double extraMinutes){
        double rate=0.25;
        return extraMinutes*rate;
    }

    public static double calculateTax(double subtotal){
        double rate=0.15;
        return subtotal*rate;
    }

    public static void calculateAndPrint(double base,double overage, double tax){
        double finalTotal=base+overage+tax;
        System.out.println("Phone bill Statement");
        System.out.println("Plan: $" + String.format("%.2f", base));
        System.out.println("Overage: $" + String.format("%.2f", overage));
        System.out.println("Tax: $" + String.format("%.2f", tax));
        System.out.println("Total: $" + String.format("%.2f", finalTotal));
    }
}