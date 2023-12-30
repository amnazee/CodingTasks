package abstractfactory;

public class AsusGpu implements Gpu {

    @Override
    public void assemble() {
        // Logic relevant to ASUS GPUs
        System.out.println("Assembling ASUS GPU");
    }

}