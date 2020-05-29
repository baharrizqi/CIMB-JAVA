package OOP.src;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Buah> listBuah = new ArrayList<Buah>();
    public static void main(String[] args) throws Exception {
        // Tampilan menu
        // 1. Tambah buah
        // 2. List buah
        // 3. Exit

        // Buah -> Nama,harga,stock
            while (true) {
            System.out.println("=== MAIN MENU ===");
            System.out.println("1. Tambah buah");
            System.out.println("2. Tampil buah");
            System.out.println("3. Exit");
            String mainMenuOption = scanner.next();

            if (mainMenuOption.equals("1")) {
                Menu.tambahBuah();
            }else if (mainMenuOption.equals("2")) {
                Menu.tampilListBuah();
            }else {
                break;
            }
        }
    }
}

        // listBuah.forEach(item -> {
        //     System.out.println("1. "+ item.getNama()+ "||"+ item.getHarga() + "||"+ item.getStock() + " pcs");
        // });








        // Day-3
        // Scanner scanner = new Scanner(System.in);
        // Employee orang = new Employee(50_000,100);
        // Employee person = new Employee(10_000);

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

        // System.out.println(Employee.employeeCount);

        // System.out.println(calculateWage(orang.getSalary(), orang.overtime, orang.payPerHour));


    // public static int calculateWage(int salary,int overtime,int payPerHour) {
    // return salary + (overtime*payPerHour);
    // }
    // public static void testing() {
    // System.out.println("Testing 123");
    // }

