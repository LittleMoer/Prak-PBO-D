/**
 * File      : PolomorfismeCoercion.java
 * Penulis : Mursetyo Ardiyan Nugroho -24060121140095
 * Deskripsi : Deskripsi Polimorfisme Coersi 
 *
 */
public class PolimorfismeCoercion {
	
	public static int kuadrat (int bilangan) {
		return bilangan*bilangan ;
	}
	
	public static void main( String[] args ) {
		//deklarasi objek integer
		int bilangan = 10 ;
		//objek integer 'dipaksa' untuk diubah menjadi primitif
		int hasilKuadrat = kuadrat(bilangan);
		
		System.out.printf("Hasil Kuadrat %d adalah %d",
		bilangan,hasilKuadrat);
	}
	
}