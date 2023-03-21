//* Penulis : Mursetyo Ardiyan Nugroho
//* NIM 	: 24060121140095
public class MOperasiTitik{
    public static void main(String[] args) {
        Titik t = new Titik(4,4);
        OperasiTitik o = new OperasiTitik() ;
        System.out.println("Titik t (" + t.getAbsis() + "," + t.getOrdinat() + ')' );
        o.refleksiSumbuX (t) ; // Hasil ?
        System.out.println("Titik t (" + t.getAbsis() + "," + t.getOrdinat() + ')' );
        o.refleksiSumbuY (t) ; // Hasil ?
        System.out.println("Titik t (" + t.getAbsis() + "," + t.getOrdinat() + ')' );
    }
}