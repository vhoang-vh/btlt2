public class Main {
    public static void main(String[] args) {
        Computer pc1 = new Computer.ComputerBuilder("1TB", "16GB")
                .setBluetooth(true)
                .build();
        Computer pc2 = new Computer.ComputerBuilder("500GB", "8GB")
                .build();
        pc1.showInfo();
        ;
        pc2.showInfo();
    }
}

