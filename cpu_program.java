import java.util.Scanner;

class CPU {

    int price;

    CPU(int price) {
        this.price = price;
    }

    class Processor {
        int cores;
        String manufacturer;

        Processor(int cores, String manufacturer) {
            this.cores = cores;
            this.manufacturer = manufacturer;
        }
    }

    static class RAM {
        int memory;
        String manufacturer;

        RAM(int memory, String manufacturer) {
            this.memory = memory;
            this.manufacturer = manufacturer;
        }
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter CPU Price: ");
        CPU cpu = new CPU(sc.nextInt());
        sc.nextLine();

        System.out.print("Enter Number of Processor Cores: ");
        int cores = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Processor Manufacturer: ");
        String pMan = sc.nextLine();

        System.out.print("Enter RAM Memory (GB): ");
        int memory = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter RAM Manufacturer: ");
        String rMan = sc.nextLine();

        CPU.Processor p = cpu.new Processor(cores, pMan);
        CPU.RAM r = new CPU.RAM(memory, rMan);

        System.out.println("\n----- CPU DETAILS -----");
        System.out.println("CPU Price: " + cpu.price);

        System.out.println("\nProcessor Details");
        System.out.println("Number of Cores: " + p.cores);
        System.out.println("Manufacturer: " + p.manufacturer);

        System.out.println("\nRAM Details");
        System.out.println("Memory: " + r.memory + " GB");
        System.out.println("Manufacturer: " + r.manufacturer);

        sc.close();
    }
}
