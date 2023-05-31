/* 
* File : BangunDatarGenericTest .j ava
* Deskripsi : main class untuk generic bangun datar
*/
public class BangundatarGenericTest {
    public static void main (String [] args) {
        Lingkaran 1 = new Lingkaran (2);
        BangundatarGeneric<Lingkaran> bdg = new BangundatarGeneric<Lingkaran>() ;
        bdg.set(1) ;
        System. out . println ("keliling lingkaran : "+bdg. hitungkeliling ()) ;
        System. out . println ("tipe generic :" +bdg. get () .getClass () .getName ());
    }
}