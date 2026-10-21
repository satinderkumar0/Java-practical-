
class ComplexNumber {

    double real;
    double imaginary;

    ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    ComplexNumber add(ComplexNumber other) {
        double r = this.real + other.real;
        double i = this.imaginary + other.imaginary;

        return new ComplexNumber(r, i);
    }

    void display() {
        if (imaginary >= 0) {
            System.out.println(real + " + " + imaginary + "i");
        } else {
            System.out.println(real + " - " + (-imaginary) + "i");
        }
    }
}

public class Main {

    public static void main(String[] args) {

        ComplexNumber num1 = new ComplexNumber(7, 6);
        ComplexNumber num2 = new ComplexNumber(3, 2);

        System.out.print("First Complex Number: ");
        num1.display();

        System.out.print("Second Complex Number: ");
        num2.display();

        ComplexNumber result = num1.add(num2);

        System.out.print("Sum: ");
        result.display();
    }
}
