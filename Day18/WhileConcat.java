package Day18;

import java.util.Scanner;

public class WhileConcat {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir isim : ");
        String name = scanner.nextLine().toUpperCase();

        // checking first character
        char ilkKarakter = name.charAt(0);
        switch (ilkKarakter){
            case 'A':
            case 'a':
                System.out.println("Apple");
                break;
            case 'B':
            case 'b':
                System.out.println("Banana");
                break;
            case 'C':
            case 'c':
                System.out.println("Cherry");
                break;
            default:
                System.out.println("Diger");
        }

        // reverse the text
        String reverse = "";        // dummy variable
        for (int i = name.length()-1; i >= 0; i--) {
            reverse += name.charAt(i);
        }
        System.out.println("reverse : "+reverse);

        // receive a word from user and add "nnny"
        int counter = 0;
        int length = name.length(); // counter
        while ( length > 0) {
            char karakter = name.charAt(counter);
            System.out.println(karakter + "nnny");
            length--;
            counter++;
        }
    }
}
