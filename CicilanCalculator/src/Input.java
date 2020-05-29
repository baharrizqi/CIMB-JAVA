package CicilanCalculator.src;

public class Input {

	public static void inputCicilan() {
        while (true) {
            System.out.println("HargaAwal minimal 1.000.000");
            int hargaAwal = (int) Console.readInputNumber("Harga Awal: ");
            if (hargaAwal < 1000000) {
                break;
            }
            System.out.println("Durasi Cicilan minimal 1 Tahun");
            int durasiCicilan = (int) Console.readInputNumber("Durasi Cicilan: ");
            if (durasiCicilan < 1 ) {
                break;
            }
            System.out.println("Bunga minimal di atas 0");
            double bunga = (int) Console.readInputNumber("Bunga: ");
            if (bunga <= 0 ) {
                break;
            }
        
            Cicilan cicilan = new Cicilan(hargaAwal, durasiCicilan, bunga);
        
            double bayaranPerBulan = (hargaAwal+(hargaAwal*(bunga/App.PERCENT)))/(durasiCicilan*App.BULAN_DALAM_TAHUN);
        
            Screen.tampilBayaran(bayaranPerBulan);
        
            Rumus.hitungSisaBayaranPerBulan(hargaAwal, durasiCicilan, bunga, bayaranPerBulan);
            break;   
        }
	
	}
    
}