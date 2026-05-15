import java.util.Scanner;

class Employee {
    int no;
    String name;
    double salary;

    void read(Scanner sc) {
        System.out.print("Enter Employee Number: ");
        no = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        name = sc.nextLine();

        System.out.print("Enter Employee Salary: ");
        salary = sc.nextDouble();
    }

    void display() {
        System.out.println("\nEmployee Found:");
        System.out.println("Employee Number : " + no);
        System.out.println("Employee Name   : " + name);
        System.out.println("Employee Salary : " + salary);
    }}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        Employee[] e = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Employee " + (i + 1));
            e[i] = new Employee();
            e[i].read(sc);
        }

        System.out.print("\nEnter Employee Number to search: ");
        int search = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (e[i].no == search) {
                e[i].display();
                return;
            }}

        System.out.println("Employee not found.");
    }}
