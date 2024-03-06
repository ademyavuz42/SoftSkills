package Day17;

import java.util.Scanner;

public class IsimEslesme {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir erkek ve bir kiz ismi giriniz : ");
        String nameMale = scanner.nextLine();
        String nameFemale = scanner.nextLine();
        int fark = Math.abs(nameMale.length() - nameFemale.length());
        if (fark <=3){
            System.out.println("Iyi bir eslesme!");
        } else {
            System.out.println("Uyumsuz isimler!");
        }

        System.out.println("Enter your first name : ");
        String firstName = scanner.nextLine();
        System.out.println("Enter your last name : ");
        String lastName = scanner.nextLine();
        String fullName = firstName.concat(" ".concat(lastName));
        System.out.println(" Full name : " + fullName);
        System.out.println("Size of full name : "+ fullName.length());
    }
}
