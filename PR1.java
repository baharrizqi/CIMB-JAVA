import java.util.Scanner;

public class PR1 {
    public static void main(String[] args){
        // System.out.println(
        //     "Nama anda adalah <NAMA>,Berumur <UMUR> tahun, tinggal di <TEMPAT_TINGGAL>, lahir tahun <TAHUN_LAHIR>"

        // Scanner scanner = new Scanner(System.in);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nama anda: ");
        String name = scanner.nextLine();
        System.out.print("Umur anda: ");
        byte age = scanner.nextByte();
        System.out.print("Tempat tinggal anda: ");
        scanner.nextLine();
        String address = scanner.nextLine();
        System.out.print("Tahun lahir anda: ");
        int year = scanner.nextInt();

        String template = "Nama anda adalah %s, berumur %s tahun, tinggal di %s, lahir tahun %s";
    
        String result = String.format(template, name, age, address, year);
    
        System.out.println(result);

    //     System.out.println(
    //         "Nama anda adalah "+name+",berumur "+age+" tahun, tinggal di "+address+ ", lahir tahun "+year);
    // }
        // System.out.println(result);

    }
}