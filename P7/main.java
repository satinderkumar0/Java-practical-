class Sample {

    Sample() {
        System.out.println("New object has been created");
    }

    void display() {
        System.out.println("Object is performing its task");
    }
}

public class Main {
    public static void main(String[] args) {

        Sample obj = new Sample();

        obj.display();

        obj = null;

        System.gc();

        System.out.println("Garbage collection has been requested");
        System.out.println("Execution continues...");
    }
}
