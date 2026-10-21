class Employee {
    String name;
    double salary;
    static int count = 0;

    Employee() {
        this("Not Assigned", 0);
    }

    Employee(String n, double s) {
        this.name = n;
        this.salary = s;
        count++;
    }

    void show() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }

    static void countEmployees() {
        System.out.println("Total Number of Employees: " + count);
    }
}

public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee();
        Employee e2 = new Employee("Priya", 35000);
        Employee e3 = new Employee("Karan", 45000);

        e1.show();

        System.out.println();

        e2.show();

        System.out.println();

        e3.show();

        System.out.println();

        Employee.countEmployees();
    }
}
