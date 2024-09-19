package computer;

public class Computer {
    private String cpu;
    private String ram;
    private String storage;
    private String graphicsCard;
    private CoolingSystem coolingSystem;

    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
        this.coolingSystem = builder.coolingSystem;
    }

    public double getPrice() {
        double price = 0;
        if (cpu != null) price += 100;
        if (ram != null) price += 50;
        if (storage != null) price += 75;
        if (graphicsCard != null) price += 150;
        if (coolingSystem != null) price += coolingSystem.getPrice();
        return price;
    }

    @Override
    public String toString() {
        return "Computer [CPU=" + cpu + ", RAM=" + ram + ", Storage=" + storage + ", GraphicsCard=" + graphicsCard 
                + ", CoolingSystem=" + (coolingSystem != null ? coolingSystem.getDescription() : "None") + "]";
    }

    public static class Builder {
        private String cpu;
        private String ram;
        private String storage;
        private String graphicsCard;
        private CoolingSystem coolingSystem;

        public Builder setCPU(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder setRAM(String ram) {
            this.ram = ram;
            return this;
        }

        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGraphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public Builder setCoolingSystem(CoolingSystem coolingSystem) {
            this.coolingSystem = coolingSystem;
            return this;
        }

        public Computer build() {
            if (cpu == null || ram == null) {
                throw new IllegalStateException("CPU and RAM must be set");
            }
            if (cpu.equals("High-Performance") && coolingSystem == null) {
                throw new IllegalStateException("High-Performance CPU requires a cooling system");
            }
            return new Computer(this);
        }
    }
}
