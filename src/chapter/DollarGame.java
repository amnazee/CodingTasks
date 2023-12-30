package chapter;

import java.util.Scanner;

public class DollarGame {
    public static void main (String[] arg){
        //initialize what we know

        double penny=0.01;
        double nickel=0.05;
        double dimes=0.10;
        double quarter=0.25;
        int dollar=1;

        //get what we don't
        Scanner scanner=new Scanner(System.in);
        System.out.println("Welcome to the game!!");

        System.out.println("Enter the number of pennies: ");
        int numPennies=scanner.nextInt();
        System.out.println("Enter the number of nickel: ");
        int numNickel=scanner.nextInt();
        System.out.println("Enter the number of dimes: ");
        int numDimes=scanner.nextInt();
        System.out.println("Enter the number of quarter: ");
        int numQuarter=scanner.nextInt();

        scanner.close();

        double total=numPennies*penny+numNickel*nickel+numDimes*dimes+numQuarter*quarter;

        if(total<dollar)
        {
            double shortAmount=dollar-total;
            System.out.println("Ooops! You lost. You were short "+shortAmount+" cents");
        }
        else if(total>dollar)
        {
            double overAmount=total-dollar;
            System.out.println("Ooops! You lost. You were over "+overAmount+" cents");
        }
        else {
            System.out.println("Yay! You are exactly $ 1! You win!!!! ");
        }
    }
}
