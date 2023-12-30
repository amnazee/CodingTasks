package abstractfactory;

public abstract class Company {

    public abstract Gpu createGpu();

    public abstract Monitor createMonitor();

    public abstract Mouse createMouse();

}