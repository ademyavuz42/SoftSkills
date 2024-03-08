package Day19;

// equals()
// equalsIgnoreCase()
// compareTo
// contains()

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir kelime girin : ");
        String ilkKelime = scanner.nextLine();
        System.out.println("Bir kelime daha girin : ");
        String ikinciKelime = scanner.nextLine();

        // equals()
        String messsage = (ilkKelime.equals(ikinciKelime)) ?
                "Esit" : "Esit degil";
        System.out.println(messsage);
        System.out.println("-------------");

        // equalsIgnoreCase()
        String messageIgnoreCase = (ilkKelime.equalsIgnoreCase(ikinciKelime)) ?
                "Esit" : "Esit degil";
        System.out.println(messageIgnoreCase);

        // contains()
        boolean kelimeGeciyorMu = ilkKelime.contains(ikinciKelime);
        if (kelimeGeciyorMu){
            System.out.println("Kelime geciyor");
        } else {
            System.out.println("Kelime gecmiyor");
        }

    }
}
