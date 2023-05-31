/* *
* File : BangunDatarGeneric. java
* deskripsi : kelas konstruksi generic untuk BangunDatar
*/
public class BangundatarGeneric <T extends Bangundatar>{
    private T Bangundatar;

    public void set (T tipeBangundatar) {
    Bangundatar = tipeBangundatar ;
    }
    public T get(){
    return Bangundatar ;
    }
    public double hitungkeliling() {
    return Bangundatar.hitungkeliling() ;
    }
}