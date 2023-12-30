package chapter;

public class TasteTester {
   public static void main(String[] arg){
       Cake cake=new Cake("Caramel");
       cake.setPrice(20.99);
       System.out.println("Cake flavour: "+cake.getFlavour());
       System.out.println("Cake Price: "+cake.getPrice());

       BirthdayCake cake2=new BirthdayCake();
       cake2.setPrice(30.99);
       System.out.println("Cake flavour: "+cake2.getFlavour());
       System.out.println("Cake Price: "+cake2.getPrice());

       WeddingCake cake3=new WeddingCake();
       cake3.setPrice(40.99);
       System.out.println("Cake flavour: "+cake3.getFlavour());
       System.out.println("Cake Price: "+cake3.getPrice());


   }
}
