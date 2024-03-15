package Day25;

import java.util.Scanner;

public class StringCharAt {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Please provide a word : ");
        String word = scanner.nextLine().toUpperCase();
        for (int i = 0; i < word.length(); i++) {
             char letter = word.charAt(i);
            System.out.println(letter+"ahna");
        }
    }
}
