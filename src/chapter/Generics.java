package chapter;

public class Generics <T> {
    T thingToPrint;

    public Generics(T thingToPrint){
        this.thingToPrint=thingToPrint;
    }

    public void print(){
        System.out.println(thingToPrint);
    }
}
