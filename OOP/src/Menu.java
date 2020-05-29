package OOP.src;

public class Menu {

	public static void tambahBuah() { 
	        while (true) {
	            // System.out.print("Nama buah: ");
	            // String inputNama = scanner.next();
	            String inputNama = Console.readInput("Nama buah: ");
	            int inputHarga = (int) Console.readInputNumber("Harga buah: ");
	            int inputStock = (int) Console.readInputNumber("Stock buah: ");
	    
	            Buah buah = new Buah(inputNama, inputHarga, inputStock); //instens atau objek
	            
	            App.listBuah.add(buah);
	
	            System.out.print("Repeat? (y/n)");
	            String option = App.scanner.next();
	            if (option.equalsIgnoreCase("N")) {
	                System.out.println("Masuk N");
	                break;
	            }
	    }
	}

	public static void tampilListBuah() {
	    System.out.println("====== LIST BUAH =======");
	    for (int i = 0; i < App.listBuah.size(); i++) {
	        System.out.println((i+1)+". "+ App.listBuah.get(i).getNama()+ "||"+ App.listBuah.get(i).getHarga() + "||"+ App.listBuah.get(i).getStock() + " pcs");  
	    }
	}
    
}