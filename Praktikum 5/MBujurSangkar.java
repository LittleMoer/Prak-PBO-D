/**
 * MBujurSangkar.java 12/11/11
 * Penulis : Mursetyo Ardiyan Nugroho -24060121140095
 * Deskripsi : kelas yang mengimplementasikan cara menghitung 
               luas bujur sangkar
 * 
 */ 
 import java.util.Scanner;
 
 class MBujurSangkar{
	public static void main(String[] args){
		try (Scanner scan = new Scanner(System.in)) {
			BujurSangkar bs = new BujurSangkar();
			System.out.print("Masukkan sisi bujur sangkar : ");
			double sisi = scan.nextDouble();
			System.out.println("Luas bujur sangkar dengan sisi "+sisi+
						" satuan adalah "+bs.hitungLuas(sisi));
		}
	}
}
 
 