package org.poligon;

public class Poligon {
    // atribut
    protected int jumlahSisi;

    // konstruktor
    public Poligon(){
        this.jumlahSisi = 0;
    }

    // method
    public void setJumlahSisi(int sisi){
        this.jumlahSisi = sisi;
    }

    public int getJumlahSisi(){
        return this.jumlahSisi;
    }
}
