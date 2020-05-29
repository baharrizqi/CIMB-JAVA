import java.util.Arrays;
import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args){

        // umur -> byte
        byte umur = 45;
        
        //short
        short iniShort = 128;

        //int
        int iniInt = 1_142_342;
        // gaboleh decimal

        //float
        float iniFloat = 142.32F;

        //double
        double iniDouble = 142.32D;

        //string
        String nama = "Seto";

        //char
        char grade = 'B';

        boolean isVerified = true;

        //Reference data tyoes
        // String people[] = new String[5];
        // people[0] = "Seto";
        // System.out.println(Arrays.toString(people));

        // int people[] = new int[5];
        // people[0] = 3;
        // System.out.println(Arrays.toString(people));

        // int people[] = {3,6,8,7,2};
        // people[4] = 1;
        // System.out.println(Arrays.toString(people));

        // int people[] = {3,6,8,7,2};
        // for (int i = 0; i < people.length; i++) {
        //     people[i] = i * 3;
        // }
        // System.out.println(Arrays.toString(people));

        // int matrix[][] = new int[4][3];
        // matrix[0][1] = 17;
        // matrix[1][0] = 7;
        // System.out.println(Arrays.deepToString(matrix));

        // CONSTANT VARIABLE
        final float PI = 3.14F;

        // Scanner scanner = new Scanner(System.in);
        // byte inputAge = scanner.nextByte();
        // System.out.println("Age: " + inputAge);

        
        // Scanner scanner = new Scanner(System.in);
        // String inputName = scanner.next();
        // System.out.println("INPUT: " + inputName);

        // Scanner scanner = new Scanner(System.in);
        // String inputName = scanner.nextLine();
        // System.out.println("INPUT: " + inputName);

        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Input nama anda: "); //output
        // String inputName = scanner.nextLine(); //input
        // System.out.println("Nama anda adalah: " + inputName); //output

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input nama anda: ");
        String inputName = scanner.nextLine();
        System.out.print("Input umur anda: ");
        Byte inputUmur = scanner.nextByte();
        System.out.print("Tinggal dimana: ");
        String inputTempat = scanner.next();
        System.out.print("Input Tahun lahir anda: ");
        Short inputTahun = scanner.nextShort();
        System.out.println("Nama anda adalah: " + inputName +" Umur anda: "+ inputUmur +" Tempat tinggal anda di: " +inputTempat + " Tahun lahir anda: "+inputTahun );



    }
}