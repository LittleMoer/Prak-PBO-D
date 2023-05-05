/**
* File      : MLingkaran.java
* Penulis   : Mursetyo Ardiyan nugroho - 24060121140095
* Deskripsi : Kelas yang berisi program untuk menjalankan kelas Lingkaran.
**/

import java.util.*;

public class MLingkaran {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Masukkan jari-jari : ");
		double r = scan.nextDouble();
		Lingkaran lingkaran1 = new Lingkaran(r);
		lingkaran1.PrintInfo();
		System.out.println("Luas Lingkaran dengan jari-jari "+r+" satuan adalah : "+lingkaran1.hitungLuas());
		scan.close();
	}
}
