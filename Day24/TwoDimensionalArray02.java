package Day24;

import java.util.Arrays;

public class TwoDimensionalArray02 {
    public static void main(String[] args) {
        String[][] studentInfo = {{"Ogrenci No", "Isim", "Soy Isim", "Dogum Yeri"},
                {"925", "Elif", "Yildiz", "Antalya"},
                {"369", "Murat", "Kara", "Izmir"},
                {"988", "Hande", "Akdeniz", "Izmir"},
                {"256", "Hasan", "Akdeniz", "Istanbul"},
                {"125", "Ferit", "Demir", "Aydin"},
                {"341", "Cemile", "Gok", "Aydin"}};
        System.out.println(Arrays.toString(studentInfo[0]));
        System.out.println(Arrays.toString(studentInfo[3]));
        System.out.println("/////////////");
        for (int i = 0; i < studentInfo[i].length; i++) {
            System.out.printf(studentInfo[0][i]+"\t");
        }
        System.out.println();
        for (int i = 0; i < studentInfo[i].length; i++) {
            System.out.printf("%10s",studentInfo[3][i]);
        }
    }
}
