class Vehicle {
    String brand = "Toyota";

    void start() {
        System.out.println("Vehicle has started...");
    }
}

class Car extends Vehicle {
    int speed = 180;

    void displayCar() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Maximum Speed: " + speed + " km/h");
    }
}

class Person {
    String name = "Amit";

    void showPerson() {
        System.out.println("Person Name: " + name);
    }
}

class Employee extends Person {
    int employeeId = 310;

    void showEmployee() {
        System.out.println("Employee ID: " + employeeId);
    }
}

class Manager extends Employee {
    String department = "Human Resources";

    void showManager() {
        System.out.println("Department: " + department);
    }
}

class Shape {
    void displayShape() {
        System.out.println("This is a geometric shape.");
    }
}

class Circle extends Shape {
    double radius = 5;

    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

class Rectangle extends Shape {
    double length = 15;
    double width = 8;

    void calculateArea() {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}

public class Main {
    public static void main(String[] args) {

        System.out.println("=== SINGLE INHERITANCE ===");

        Car car = new Car();
        car.start();
        car.displayCar();

        System.out.println("\n=== MULTILEVEL INHERITANCE ===");

        Manager manager = new Manager();
        manager.showPerson();
        manager.showEmployee();
        manager.showManager();

        System.out.println("\n=== HIERARCHICAL INHERITANCE ===");

        Circle circle = new Circle();
        circle.displayShape();
        circle.calculateArea();

        Rectangle rectangle = new Rectangle();
        rectangle.displayShape();
        rectangle.calculateArea();
    }
}
