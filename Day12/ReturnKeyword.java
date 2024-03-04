package Day12;

public class ReturnKeyword {
    public static void main(String[] args) {
        String name = "adem";
        String nickName = nicknameGenerator(name);
        System.out.println(nickName);

        double vizeNotu = 67;
        double finalNotu = 88;
        System.out.println("Ortalama: " + ortalamaHesaplama(vizeNotu, finalNotu));
    }

    private static double ortalamaHesaplama(double vizeNotu, double finalNotu) {
        double ortalama = (vizeNotu * 0.4 + finalNotu * 0.6);
        return ortalama;
    }

    private static String nicknameGenerator(String name) {
        return name + "nnny";
    }
}
