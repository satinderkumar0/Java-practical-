// Method Overloading
class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

// Base class
class Employee {

    double calculatePay() {
        return 0;
    }
}

// Child class
class FullTimeEmployee extends Employee {

    double salary = 55000;

    @Override
    double calculatePay() {
        return salary;
    }
}

// Child class
class PartTimeEmployee extends Employee {

    double hours = 60;
    double rate = 300;

    @Override
    double calculatePay() {
        return hours * rate;
    }
}

public class Main {

    public static void main(String[] args) {

        System.out.println("=== METHOD OVERLOADING ===");

        Calculator calc = new Calculator();

        System.out.println("Two numbers: " + calc.add(15, 25));
        System.out.println("Three numbers: " + calc.add(15, 25, 35));
        System.out.println("Decimal numbers: " + calc.add(12.5, 17.5));

        System.out.println("\n=== METHOD OVERRIDING ===");

        Employee emp;

        emp = new FullTimeEmployee();
        System.out.println("Full Time Pay: " + emp.calculatePay());

        emp = new PartTimeEmployee();
        System.out.println("Part Time Pay: " + emp.calculatePay());
    }
}
