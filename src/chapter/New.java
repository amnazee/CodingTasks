package chapter;

import java.util.Arrays;

public class New {
    public static void main(String[] arg){
        Person newPerson=new Person();
        System.out.println(newPerson.getName());
        System.out.println(newPerson.getAge());
        newPerson.move("North", 25);
        newPerson.ascend(34);
        newPerson.descend(10);
//        int[] newLocation=newPerson.getLocation();
//        System.out.println(Arrays.toString(newLocation));
        Location location=newPerson.getLocation();
        System.out.println("Location is: {"+location.getX()+ "," + location.getY()+ "," + location.getZ()+"}");
    }
}