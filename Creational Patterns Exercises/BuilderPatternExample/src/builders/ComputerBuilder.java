package builders;

import product.Computer;

public class ComputerBuilder {

    public static void main(String[] args) {
        Computer computer1 = new Computer.Builder()
                .setCpu("Intel i7")
                .setRam("16GB")
                .setStorage("512GB SSD")
                .build();

        Computer computer2 = new Computer.Builder()
                .setCpu("AMD Ryzen 5")
                .setRam("8GB")
                .setStorage("1TB HDD")
                .setGraphicsCard("NVIDIA GTX 1660")
                .build();

        System.out.println(computer1);
        System.out.println(computer2);
    }
}