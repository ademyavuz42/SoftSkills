package Day18;

import java.util.Scanner;

// charAt()
// substring()
public class Main {
    public static void main(String[] args) {

        // kullanicidan bir kelime taleb eder
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz : ");
        String girilenKelime = scanner.nextLine();  // accept word form user

        int kelimeUzunlugu = girilenKelime.length(); // size of the word
        char firstCharacter = girilenKelime.charAt(0);  // calling first character
        String concatinatedWord = girilenKelime.concat(" word"); // added "word"
        String subWord = concatinatedWord.substring(1); // substring start from second character
        String upperCase = subWord.toUpperCase();
        char ortadakiHarf = girilenKelime.charAt((girilenKelime.length()-1)/2); // kelimenin otasindaki harfi bulur

        System.out.println("kelimeUzunlugu : "+kelimeUzunlugu);
        System.out.println("First Character : "+firstCharacter);
        System.out.println("Eklenmis kelime : "+concatinatedWord);
        System.out.println("Substring : "+subWord);
        System.out.println("Buyuk harfe cevrili durumu : "+upperCase);
        System.out.println("ortadakiHarf : "+ortadakiHarf);

    }
}
