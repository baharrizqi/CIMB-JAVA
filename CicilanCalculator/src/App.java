package CicilanCalculator.src;

import java.util.Scanner;

public class App {
    public static Scanner scanner = new Scanner(System.in);
    static final int BULAN_DALAM_TAHUN = 12;
    static final int PERCENT = 100;
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // Harga Awal = P
        // Durasi Cicilan = D (tahun)
        // Bunga = B
        // Bayaran per bulan = M
        // M = [P+(P*B/100)]/D *12

        // int hargaAwal;
        // int durasiCicilan;
        // double bunga;

        // while (true) {
        //     // System.out.print("Harga Awal: ");
        //     hargaAwal = (int) Console.readInputNumber("Harga Awal: ");

        //     if (hargaAwal >= 1_000_000) {
        //         break;
        //     }
        //     System.out.println("Harga minimal 1.000.000");
        // }

        // while (true) {
        //     // System.out.print("Durasi Cicilan: ");
        //     durasiCicilan = (int) Console.readInputNumber("Durasi Cicilan: ");
        //     if (durasiCicilan >= 1) {
        //         break; 
        //     }
        //     System.out.println("Tahun minimal 1");
        // }
        // while (true) {
        //     // System.out.print("Bunga: ");
        //     bunga = (int) Console.readInputNumber("Bunga: ");

        //     if (bunga >= 0) {
        //         break;
        //     }
        //     System.out.println("Bunga minimal 0");
        // }

        Input.inputCicilan();
    }


}
