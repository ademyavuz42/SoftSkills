package Day23;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {13, 15, 17, 19, 21};
        int[] sayilar = {23, 25, 27, 29, 31};
        System.out.println(ilkIntElamaniDoundur(numbers));
        System.out.println("Toplam iki arrayin ilk elamanlari: " + toplam(numbers, sayilar));

        String[] names = {"Adem", "Hafizo", "Hayrettin", "Hafsa", "Leyla"};
        System.out.println(toplamListeUzunlugu(names));

        int[] num = arrayOlustur(1, 2, 3, 4, 5);
        System.out.println(Arrays.toString(num));


        double[] ogrenciPuanListesi = {88, 99, 77, 100, 98};
        double ortalama = ogrenciPuanOrtalamasi(ogrenciPuanListesi);
        System.out.println("Not oralamasi : " + ortalama);

        String[] nameList = isimList("Ali", "Naciye", "Kemal", "Mehmet", "Havvana");
        System.out.println("Isim listesi : " + Arrays.toString(nameList));
        System.out.println("En uzun isim : "+enUzunIsim(names));

    }

    private static String enUzunIsim(String[] names) {
        String enUzunIsim = names[0];
        for (int i = 0; i < names.length; i++) {
            if (enUzunIsim.length() < names[i].length()) {
                enUzunIsim = names[i];
            }
        }
        return enUzunIsim;
    }

    public static String[] isimList(String isim1, String isim2, String isim3, String isim4, String isim5) {
        String[] isimList = {isim1, isim2, isim3, isim4, isim5};
        return isimList;
    }

    public static double ogrenciPuanOrtalamasi(double[] ogrenciPuanListesi) {
        double sum = 0;
        for (int i = 0; i < ogrenciPuanListesi.length; i++) {
            sum += ogrenciPuanListesi[i];
        }
        double ortalama = sum / ogrenciPuanListesi.length;
        return ortalama;
    }

    public static int[] arrayOlustur(int a, int b, int c, int d, int e) {
        int[] list = {a, b, c, d, e};
        return list;
    }

    private static int toplam(int[] numbers, int[] sayilar) {
        return numbers[0] + sayilar[0];
    }

    public static int toplamListeUzunlugu(String[] names) {
        int sum = 0;
        for (int i = 0; i < names.length; i++) {
            sum += names[i].length();
        }
        return sum;
    }

    public static int ilkIntElamaniDoundur(int[] numbers) {
        return numbers[0];
    }
}
