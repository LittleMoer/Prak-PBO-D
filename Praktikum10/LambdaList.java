import java.util.ArrayList;
/**
 * File : LambdaList.java 31/05/2023
 * Nama/NIM : Mursetyo Ardiyan Nugroho/24060121140095
 * Deskripsi : implementasi lambda pada list, digunakan sebagai parameter pada method
**/

public class LambdaList{
	public static void main(String[] args){
		ArrayList<String> mahasiswaList = new ArrayList<>();
		mahasiswaList.add("Adi");
		mahasiswaList.add("Bambang");
		mahasiswaList.add("Cici");
		mahasiswaList.add("Didi");
		//lambda digunakan sebagai parameter
		mahasiswaList.forEach((nama) -> System.out.println(nama));
	}
}