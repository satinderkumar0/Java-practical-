

interface Printable {
    void print();
}

interface Scannable {
    void scan();
}

class AllInOnePrinter implements Printable, Scannable {

    public void print() {
        System.out.println("Printer is printing a report...");
    }

    public void scan() {
        System.out.println("Printer is scanning a document...");
    }
}

class Machine {

    void start() {
        System.out.println("Machine is switched on.");
    }
}

interface Copyable {
    void copy();
}

class SmartPrinter extends Machine implements Copyable {

    public void copy() {
        System.out.println("Document copied successfully.");
    }

    void status() {
        System.out.println("Smart printer is ready to use.");
    }
}

public class Main {
    public static void main(String[] args) {

        System.out.println("=== Office Printer using Interfaces ===");

        AllInOnePrinter p = new AllInOnePrinter();
        p.print();
        p.scan();

        System.out.println("\n=== Hybrid Inheritance Example ===");

        SmartPrinter sp = new SmartPrinter();
        sp.start();
        sp.copy();
        sp.status();
    }
}
