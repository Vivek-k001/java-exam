import java.util.Scanner;

class Student {
    int academic;

    void getAcademic(Scanner sc) {
        System.out.print("Enter Academic Marks: ");
        academic = sc.nextInt();
    }
}

interface Sports {
    void getSports(Scanner sc);
}

class Result extends Student implements Sports {
    int sports;

    public void getSports(Scanner sc) {
        System.out.print("Enter Sports Marks: ");
        sports = sc.nextInt();
    }

    void display() {
        System.out.println("\n--- Student Result ---");
        System.out.println("Academic Marks: " + academic);
        System.out.println("Sports Marks: " + sports);
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Result r = new Result();

        r.getAcademic(sc);
        r.getSports(sc);

        r.display();

        sc.close();
    }
}
