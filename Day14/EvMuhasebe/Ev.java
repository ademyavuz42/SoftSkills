package Day14.EvMuhasebe;

public class Ev {
    public static void main(String[] args) {
        Ahmet ahmet = new Ahmet();
        Ayse ayse = new Ayse();

        int toplamGelir = ahmet.ahmetGelir()+ ayse.ayseGelir();
        System.out.println("Toplam ev geliri: " + toplamGelir);

    }
}
