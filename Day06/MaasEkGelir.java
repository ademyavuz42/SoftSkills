package Day06;public class MaasEkGelir {
    public static void main(String[] args) {
        int maas = 2500;
        int ekGelir = 500;
        int yas = 18;
        String message = (maas > 2000 || ekGelir >= 1000) && yas >= 18 ? "Kredi basvurunuz onaylanmistir" : "Kredi basvurunuz onaylanmamistir!";
        System.out.println(message);

    }
}