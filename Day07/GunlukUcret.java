package Day07;

public class GunlukUcret {
    public static void main(String[] args) {
        String gun = "sali";
        int calismaSuresi;
        int ucret;
        int odeme;
        switch (gun) {
            case "pazartesi":
                ucret = 40;
                calismaSuresi = 7;
                odeme = ucret * calismaSuresi;
                System.out.println("Pazartesi odeme tutari: " + odeme);
                break;
            case "sali":
                ucret = 35;
                calismaSuresi = 6;
                odeme = ucret * calismaSuresi;
                System.out.println("Sali odeme tutari: " + odeme);
                break;
            case "carsamba":
                ucret = 38;
                calismaSuresi = 5;
                odeme = ucret * calismaSuresi;
                System.out.println("Carsamba odeme tutari: " + odeme);
                break;
            case "persembe":
                ucret = 30;
                calismaSuresi = 6;
                odeme = ucret * calismaSuresi;
                System.out.println("Persembe odeme tutari: " + odeme);
                break;
            case "cuma":
                ucret = 45;
                calismaSuresi = 6;
                odeme = ucret * calismaSuresi;
                System.out.println("Cuma odeme tutari: " + odeme);
                break;
            case "cumartesi":
                ucret = 60;
                calismaSuresi = 4;
                odeme = ucret * calismaSuresi;
                System.out.println("Cumartesi odeme tutari: " + odeme);
                break;
            default:
                System.out.println("Gecersiz gun!!");
        }
    }
}
