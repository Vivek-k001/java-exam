import java.util.Scanner;

class Employee {
    int id;
    String name, address;
    double salary;

    Employee(int id, String name, double salary, String address) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }
}

class Teacher extends Employee {

    String dept, subject;

    Teacher(int id, String name, double salary,
            String address, String dept, String subject) {

        super(id, name, salary, address);

        this.dept = dept;
        this.subject = subject;
    }

    void display() {
        System.out.println("\n----- Teacher Details -----");
        System.out.println("Employee ID : " + id);
        System.out.println("Name        : " + name);
        System.out.println("Salary      : " + salary);
        System.out.println("Address     : " + address);
        System.out.println("Department  : " + dept);
        System.out.println("Subject     : " + subject);
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of teachers: ");
        int n = sc.nextInt();
        sc.nextLine();

        Teacher[] t = new Teacher[n];

        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter details of Teacher " + (i + 1));

            System.out.print("Enter Employee ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter Address: ");
            String address = sc.nextLine();

            System.out.print("Enter Department: ");
            String dept = sc.nextLine();

            System.out.print("Enter Subject: ");
            String sub = sc.nextLine();

            t[i] = new Teacher(id, name, salary, address, dept, sub);
        }

        System.out.println("\n========== TEACHER DETAILS ==========");

        for (int i = 0; i < n; i++)
            t[i].display();
    }
}
