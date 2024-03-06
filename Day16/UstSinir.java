package Day16;

import java.util.Random;
import java.util.Scanner;

public class UstSinir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Random sayi olusturmak icin maksimim sayiyi giriniz : ");
        int girilenSayi = scanner.nextInt();
        Random random = new Random();
        int rastgeleSayi = random.nextInt(girilenSayi)+1;
        System.out.println(rastgeleSayi);
    }
}
