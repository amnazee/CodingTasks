package chapter;

import java.util.ArrayList;
import java.util.Objects;

public class GenericsExample {
    public static void main(String[] arg){
        Generics<Integer> printer=new Generics<Integer>(23);
        printer.print();


    }
}
