package Day11;

public class Methods01 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {printHello();}

        printID();

    }

    private static void printID() {
        String name = "Adem";
        int yas = 44;
        char licence = 'C';
        System.out.println("ID Number: "+name+yas+licence);
    }

    private static void printHello() {
        System.out.println("Hello world!");
    }

}
