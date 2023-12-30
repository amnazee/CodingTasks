package chapter;

import java.util.Scanner;

public class LoanQualifier {

    public static void main(String[] args){
        //initialize what we know
        int requiredSalary=30000;
        int requiredYearsEmployed=2;

        //get what we don't
        System.out.println("Enter your salary:");
        Scanner scanner=new Scanner(System.in);
        double salary=scanner.nextDouble(); //double holds integer as well as float

        System.out.println("Enter the number of years with your current employer: ");
        double years=scanner.nextDouble();
        scanner.close();

        //make decision
        if(salary>=requiredSalary){
            if(years>=requiredYearsEmployed){
                System.out.println("Loan Approved! Congratulations");
            }
            else {
                System.out.println("You need to have worked at least "+requiredYearsEmployed+" years");
            }
        }
        else {
            System.out.println("Loan not approved! Your salary is less than "+requiredSalary);
        }
    }
}
