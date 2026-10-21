class Book {
    String title;
    String author;
    double price;

    Book() {
        title = "Not Available";
        author = "Not Available";
        price = 0;
    }

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    Book(Book b) {
        title = b.title;
        author = b.author;
        price = b.price;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

public class Main {
    public static void main(String[] args) {

        Book b1 = new Book();
        Book b2 = new Book("Python Basics", "Guido van Rossum", 450);
        Book b3 = new Book(b2);

        System.out.println("Book 1:");
        b1.display();

        System.out.println("\nBook 2:");
        b2.display();

        System.out.println("\nBook 3:");
        b3.display();

        b3.title = "Advanced Python";
        b3.price = 700;

        System.out.println("\nAfter changing Book 3:");

        System.out.println("\nBook 2:");
        b2.display();

        System.out.println("\nBook 3:");
        b3.display();
    }
}
