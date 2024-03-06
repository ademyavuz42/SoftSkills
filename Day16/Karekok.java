package Day16;

import java.util.Scanner;

public class Karekok {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayi giriniz :");
        double sayi = scanner.nextDouble();
        double karakok = Math.sqrt(sayi);       // karakok hesaplama
        System.out.println(karakok);
        double floorYuvarlama = Math.floor(karakok);    // floor yuvarlama
        System.out.println("floor yuvarlama " +floorYuvarlama);
        double ceilYuvarlama = Math.ceil(karakok);  // ceil yuvarlama
        System.out.println("ceil yuvarlama : " + ceilYuvarlama);
        int yuvarlama = (int) Math.round(karakok); // int yuvarlama
        System.out.println("integer yuvarlama : "+ yuvarlama);
    }
}
