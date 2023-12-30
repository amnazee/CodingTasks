package abstractfactory;


    public class AsusManufacturer extends Company {

        @Override
        public Gpu createGpu() {
            return new AsusGpu();
        }

        @Override
        public Monitor createMonitor() {
            return new AsusMonitor();
        }

        @Override
        public Mouse createMouse() {return new AsusMouse(); }

    }

