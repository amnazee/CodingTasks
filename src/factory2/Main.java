package factory2;

public class Main {
    public static void main(String[] arg){
        MobileFactory mobileFactory=new MobileFactory();
        Mobile mobile=mobileFactory.produceMobile("IPHONE");
        mobile.createMobile();

        mobile=mobileFactory.produceMobile("Samsung");
        mobile.createMobile();

        mobile=mobileFactory.produceMobile("Vivo");
        mobile.createMobile();
    }
}
