package Day22;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Arrays

        String[] isimler = {"Adem", "Hafizo", "Hayrettin", "Hafsa", "Leyla"};
        String[] liste = new String[3]; //length
        System.out.println(isimler[0]); // erisim
        liste[0] = "Ali";   // eleman ekleme
        liste[1] = "Naciye";
        liste[2] = "Mehmet";


        System.out.print("[");
        for (String isim:isimler) { // elemanlari yazdirma
            System.out.print(isim+", ");
        }
        System.out.println("\b"+"\b]");
        System.out.print("[");
        for (String ls:liste) {
            System.out.print(ls+", ");
        }
        System.out.println("\b"+"\b]");

        int[] numbers = new int[5];
        int temp = 0;
        for (int i = 0; i < numbers.length; i++) {
            temp += 10;
            numbers[i] +=temp;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
