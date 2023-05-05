/**
 * File      : Car.java
 * Penulis : Mursetyo Ardiyan Nugroho -24060121140095
 * Deskripsi : Deskripsi Car,turunan dari kelas Vehicle
 *
 */
package com.oracle.training;

public class Car extends Vehicle{
	void calRent(int jarak, float harga){ 
		float fare=jarak*harga;
		fare=fare-1000.00f;
		System.out.println("harga sewa mobil = "+fare);
	}
}

