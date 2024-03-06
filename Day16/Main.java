package Day16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz : ");
        int sayi = scanner.nextInt();
        int area = sayi * sayi;     // kare alan hesaplama
        System.out.println("area : " + area);

        // double input, kare ve cevre hesaplama
        double sayiDouble = scanner.nextDouble();
        double alanDouble = sayiDouble * sayiDouble;
        double cevreDouble = sayiDouble * 4;
        System.out.println("alanDouble : " + alanDouble); // kare alan hesaplama
        System.out.println("cevreDouble : " + cevreDouble); // kare cevre hesaplama


    }
}
