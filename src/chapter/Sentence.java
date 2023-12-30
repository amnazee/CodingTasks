package chapter;

import java.util.Scanner;

public class Sentence {

    public static void main (String[] arg) {
        System.out.println("Enter the season of the year:");
        Scanner scanner=new Scanner(System.in);
        String season=scanner.next();
        System.out.println("Enter the adjective: ");
        String adjective=scanner.next();

        System.out.println("Enter a whole number: ");
        int number=scanner.nextInt();

        scanner.close();

        System.out.println("On a "+adjective+" "+season+ " day, I drink a minimum of "+number
        +" cups of coffee");

    }
}
