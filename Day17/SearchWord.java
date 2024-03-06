package Day17;

import java.util.Scanner;

public class SearchWord {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a text : ");
        String paragraph = scanner.nextLine();
        System.out.println("Enter a word to search : ");
        String word = scanner.nextLine();
        if (paragraph.isEmpty()){
            System.out.println("Girilen metin bos!");
        } else if (paragraph.indexOf(word) == -1){
           System.out.println("Kelime paragraf icinde gecmiyor!");
       } else {
           System.out.println("Kelime paragraf icerisinde geciyor.");
       }
    }
}
