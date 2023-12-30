package chapter;

import java.util.Scanner;

public class Arrays {
    public static void main (String[] args){
        String[] daysOfTheWeek={"Monday","Tuesday","Wednesday", "Thursday","Friday"};
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of the day: ");
        int num=scanner.nextInt();
        scanner.close();

        System.out.println("Corresponding day: "+daysOfTheWeek[num-1]);
    }
}
