package Day25;

import java.util.Scanner;

public class StringLowerUpperCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide a word : ");
        String word = scanner.nextLine();
        boolean lowerCase = false;
        for (int i = 0; i < word.length(); i++) {
            char karakter = word.charAt(i);
            if (Character.isLowerCase(karakter)) {
                lowerCase = true;
                break;
            }
        }
        if (lowerCase){
            System.out.println("Kelimenin icinde kucuk harf bulunuyor");
        } else {
            System.out.println("Kelime buyuk harflerden olusuyor");
        }
    }
}
