package chapter;

import java.util.List;
import java.util.Scanner;

public class Palindrome {

    public static void main(String[] arg) {
        System.out.println("Enter the string:");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        System.out.println(word);
        String reversedWord = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord += word.charAt(i);
        }

             if(word.equals(reversedWord)){
                System.out.println("The word is palindrome");
             }
            else{
                 System.out.println("The word is not palindrome");
            }

    }
}
