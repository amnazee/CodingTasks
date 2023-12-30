package factory2;

public class Samsung implements Mobile{
    @Override
    public void createMobile() {
        System.out.println("Samsung created!");
    }
}
