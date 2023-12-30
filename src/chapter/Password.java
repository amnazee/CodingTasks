package chapter;

import java.util.Scanner;

public class Password {

    private String username;
    private String password;

    private Boolean valid;
    private String error;

    public static Scanner scanner=new Scanner(System.in);

    public Password(String username, String password){
        this.username=username;
        this.password=password;
    }

//    public String getPassword(){
//        System.out.println("Enter the new password: ");
//        newPassword=scanner.nextLine();
//        return newPassword;
//
//    }


}

//is 8 characters long
//contains an uppercase letter
//contains a special letter
//does not equal the username
//not same as old password
