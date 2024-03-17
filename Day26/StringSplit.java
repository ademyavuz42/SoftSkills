package Day26;

import java.util.Arrays;

public class StringSplit {
    public static void main(String[] args) {
        String str = "";
        String[] strList = str.split(" ");
        System.out.println(Arrays.toString(strList));
        String ogrenci = "John,Smith,USA,Computer Science";
        temelOgrenciBilgisi(ogrenci);
    }
    public static void temelOgrenciBilgisi(String ogrenci){
        String[] bilgi = ogrenci.split(",");
        String[] label = {"Adi\t     :", "Soyadi\t :", "Ulke\t :", "Alan\t :"};
        for (int i = 0; i < label.length; i++) {
            System.out.println(label[i].concat(" ".concat(bilgi[i])));
        }


    }
}
