package CicilanCalculator.src;

import java.text.NumberFormat;

public class Screen {

	public static void tampilBayaran(double bayaranPerBulan) {
	    System.out.println("------- PEMBAYARAN SETIAP BULAN ---------");
	    System.out.println(NumberFormat.getCurrencyInstance().format(bayaranPerBulan));
	}
    
}