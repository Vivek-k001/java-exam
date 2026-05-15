import java.util.Scanner;

class Publisher {
    String publisher;
}

class Book extends Publisher {
    String title, author;

    void getData(Scanner sc) {
        System.out.print("Enter Publisher Name: ");
        publisher = sc.nextLine();

        System.out.print("Enter Book Title: ");
        title = sc.nextLine();

        System.out.print("Enter Author Name: ");
        author = sc.nextLine();
    }

    void display(String type) {
        System.out.println("\n--- " + type + " Book Details ---");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisher);
    }
}

class Literature extends Book {}
class Fiction extends Book {}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Literature");
        System.out.println("2. Fiction");
        System.out.print("Enter Choice: ");

        int ch = sc.nextInt();
        sc.nextLine();

        if (ch == 1) {
            Literature l = new Literature();
            l.getData(sc);
            l.display("Literature");
        }
        else if (ch == 2) {
            Fiction f = new Fiction();
            f.getData(sc);
            f.display("Fiction");
        }
        else {
            System.out.println("Invalid Choice");
        }
    }
}
