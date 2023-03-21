/* 
* Nama File : Bujur Sangkar.java 
* Penulis 	: Mursetyo Ardiyan Nugroho
* NIM		: 24060121140095
* Tanggal 	: 15 Maret 2023
* Deskripsi : File Class Bujur Sangkar
*/

package org.bangundatar;

import org.poligon.Poligon;

public class BujurSangkar extends Poligon {
    // atribut
    private double panjangSisi;

    // konstruktor
    public BujurSangkar(double panjangSisi){
        this.panjangSisi = panjangSisi;
        this.jumlahSisi = 4;
    }

    // method
    public double getPanjangSisi(){
        return this.panjangSisi;
    }

    public double hitungLuas(){
        return Math.pow(this.panjangSisi,2);
    }
}