package Day26;

public class Main {
    public static void main(String[] args) {
        SplitPractice splitPractice = new SplitPractice();
        String text = "adem yavuz golyaka kasabasi bayesehir konya turkiye";
        String lastWord = splitPractice.sonKelime(text);
        if (lastWord.length()==5){
            System.out.println("Son kelime ("+lastWord+ ") 5 harften okusuyor.");
        }else {
            System.out.println("Son kelime ("+lastWord+") "+lastWord.length()+ " farkli harften olusuyor");
        }
        double oralamaKelimeUzunlugu = ortalamaKarakterUzunlugu(text);
        System.out.println("Ortalama kelime uzunlugu : " + oralamaKelimeUzunlugu);
    }
    public static double ortalamaKarakterUzunlugu(String text){
        String[] kelimeler = text.split(" ");
        double sum = 0;
        for (String kelime:kelimeler) {
          sum += kelime.length();
        }
        double average = sum/ kelimeler.length;
        return average;
    }
}
