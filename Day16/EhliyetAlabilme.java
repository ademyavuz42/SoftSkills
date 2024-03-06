package Day16;

import java.util.Scanner;

public class EhliyetAlabilme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz : ");
        int yas = scanner.nextInt();
        String mesaj = (yas>=18) ? "Ehliyet alabilirsiniz!" : "Ehliyet alamazsiniz!";
        System.out.println(mesaj);
    }
}
