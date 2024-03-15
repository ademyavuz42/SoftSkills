package Day25;

import java.util.Scanner;

public class StringIsEmpty {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Please provide a text : ");
        String text = scanner.nextLine();
        if (text.isEmpty()){
            System.out.println("Metin bos!");
        } else if (text.contains("Hello")|| text.contains("hello")) {
            System.out.println(text.concat(" World!"));
        }else {
            System.out.println(text);
        }
    }
}
