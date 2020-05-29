package OOP.src;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        Scanner scanner = new Scanner(System.in);
        Employee orang = new Employee(50_000,100);
        Employee person = new Employee(10_000);

        // System.out.print("salary: ");
        // int salary = scanner.nextInt();
        // System.out.print("overtime: ");
        // int overtime = scanner.nextInt();
        // System.out.print("payPerHour: ");
        // int payPerHour = scanner.nextInt();

        // orang.setSalary(scanner.nextInt());
        // orang.setSalary(salary);
        // orang.setOvertime(overtime);
        // orang.setPayPerHour(payPerHour);
        // orang.payPerHour = scanner.nextInt();

        // System.out.println(orang.calculateWage(5));

        System.out.println(Employee.employeeCount);

        // System.out.println(calculateWage(orang.getSalary(), orang.overtime, orang.payPerHour));

    }
    public static int calculateWage(int salary,int overtime,int payPerHour) {
        return salary + (overtime*payPerHour);
    }
    public static void testing() {
        System.out.println("Testing 123");
    }
}
