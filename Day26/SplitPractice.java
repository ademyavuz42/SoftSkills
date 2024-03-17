package Day26;

public class SplitPractice {
    public String sonKelime(String text) {
        String [] kelimeler = text.split(" ");
        String sonKelime = kelimeler[kelimeler.length-1];
        return sonKelime;
    }
}
