package abstractfactory;

public class MsiManufacturer extends Company {

    @Override
    public Gpu createGpu() {
        return new MsiGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new MsiMonitor();
    }

    @Override
    public Mouse createMouse() {
        return new MsiMouse();
    }

}