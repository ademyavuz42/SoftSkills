package Day11;

public class Student {
    public static void main(String[] args) {
        String firstName = "Adem";
        String lastName = "Yavuz";
        int birthYear = 1980;
        char lisence = 'C';
        boolean active = true;
        ogrenciBilgileri(firstName,lastName,birthYear,lisence,active);

    }

    private static void ogrenciBilgileri(String firstName, String lastName, int birthYear, char lisence, boolean active) {
        System.out.println("Student Information:");
        System.out.println("First Name        : "+firstName);
        System.out.println("Last Name         : "+lastName);
        System.out.println("Birth Year        : "+birthYear);
        System.out.println("Licence           : "+lisence);
        System.out.println("Statu             : "+active);
    }
}
