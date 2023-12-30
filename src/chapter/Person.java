package chapter;

public class Person {

    private String name;
    private int age;
    private Location location;

//    int[] location;

    public Person(){
        this.name="";
        this.age=0;
//        this.location=new int[]{0,0,0};
        this.location=new Location();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
//    public int[] getLocation() {
//        return location;
//    }
//
//    public void setLocation(int[] location) {
//        this.location = location;
//    }

//    public void move(String direction, int distance){
//      if( direction.equals("North")){
//          this.location[1]+=distance;
//      }
//    }
    public void move(String direction, int distance){
        if(direction.equals("North")){
            this.location.setY(this.location.getY()+distance);
        }
    }

//    public void ascend(int distance){
//        this.location[2]+=distance;
//    }
public void ascend(int distance){
    this.location.setZ(this.location.getZ()+distance);
}
    public void descend(int distance){
        this.location.setZ(this.location.getZ()-distance);
    }

    public Location getLocation(){
        return new Location(this.location.getX(), this.location.getY(), this.location.getZ());
    }
}


