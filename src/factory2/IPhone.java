package factory2;

public class IPhone implements Mobile{
    @Override
    public void createMobile() {
        System.out.println("IPhone created!");
    }
}
