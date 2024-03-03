package Day07;

public class BahceyeGidisSayisi {
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 1; i <= 365; i += 7) {
            if (i % 8 == 0) {
                counter++;
                System.out.println("Yilin " + i + ". gunu bahceye gitti.");
            }
        }
        System.out.println("Toplam " + counter + " kez bahceye gidildi.");
    }
}
