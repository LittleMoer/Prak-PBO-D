//* Penulis : Mursetyo Ardiyan Nugroho
//* NIM 	: 24060121140095
public class OperasiTitik {
    public void refleksiSumbuX(Titik titik){
         double x ;
        x = titik.getOrdinat() ;
        x *= -1 ;
        titik.setOrdinat(x);
    }
    public void refleksiSumbuY(Titik titik){
        double x ;
       x = titik.getAbsis() ;
       x *= -1 ;
       titik.setAbsis(x);
   }
}
