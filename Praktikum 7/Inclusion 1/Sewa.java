/**
 * File      : Sewa.java
 * Penulis : Mursetyo Ardiyan Nugroho -24060121140095
 * Deskripsi : Deskripsi Kelas sewa
 *
 */
package com.oracle.training;

public class Sewa {
	public static void main(String[] args) {
		Vehicle kendaraan = new Vehicle();
		Vehicle mobil = new Car();
		Vehicle bis = new Bus();
		kendaraan.calRent(50, 1000);
		mobil.calRent(50, 1000);
		bis.calRent(50, 1000);
	}
}
