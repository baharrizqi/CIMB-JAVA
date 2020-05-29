package OOP.src;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Buah> listBuah = new ArrayList<Buah>();
    public static void main(String[] args) throws Exception {
        // Tampilan menu
        // 1. Tambah buah
        // 2. List buah
        // 3. Exit

        // Buah -> Nama,harga,stock
        tambahBuah();
        tampilMenu();
    }

    public static void tambahBuah() { 
            while (true) {
                // System.out.print("Nama buah: ");
                // String inputNama = scanner.next();
                String inputNama = readInput("Nama buah: ");
                System.out.print("Harga buah: ");
                int inputHarga =  scanner.nextInt();
                System.out.print("Stock buah: ");
                int inputStock = scanner.nextInt();
        
                Buah buah = new Buah(inputNama, inputHarga, inputStock); //instens atau objek
                
                listBuah.add(buah);
    
                System.out.print("Repeat? (y/n)");
                String option = scanner.next();
                if (option.equalsIgnoreCase("N")) {
                    System.out.println("Masuk N");
                    break;
                }
        }
    }
    public static String readInput(String message) {
        System.out.print(message);
        return scanner.next();
    }
    public static void tampilMenu() {
        System.out.println("====== LIST BUAH =======");
        for (int i = 0; i < listBuah.size(); i++) {
            System.out.println((i+1)+". "+ listBuah.get(i).getNama()+ "||"+ listBuah.get(i).getHarga() + "||"+ listBuah.get(i).getStock() + " pcs");  
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

