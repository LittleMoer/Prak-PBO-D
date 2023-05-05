/**
 * BangunDatar.java 12/11/11
 * Penulis : Mursetyo Ardiyan Nugroho -24060121140095
 * Deskripsi : kelas abstrak, berisi abstraksi bangun datar
 * 
 */ 
 
 public abstract class BangunDatar{
	protected double luas;
	
	public abstract double hitungLuas(double sisi);
	
	public void setLuas(double l){
		luas = l;
	}
	
	public double getLuas(){
		return luas;
	}
 } 
 
 
 
 