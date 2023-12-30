package chapter;

public class Chapter13 {
    public static void main(String[] arg){

        try{
            int c=30/0;
        }
        catch(Exception e){
            System.out.println("You divided by zero!!");
        }
        System.out.println("Division is fun");
    }


}
