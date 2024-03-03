package Day06;public class OtobusKarti {
    public static void main(String[] args) {
        String isDurumu = "ogrenci";
        int gelir = 500;
        if (gelir < 1000) {
            if (isDurumu == "ogrenci") {
                System.out.println("%50 indirimden faydalanabilirsiniz");
            } else if (isDurumu == "memur") {
                System.out.println("%30 indirimden faydalanabilirsiniz");
            } else if (isDurumu == "issiz") {
                System.out.println("%20 indirimden faydalanabilirsiniz");
            } else {
                System.out.println("Gecersiz is durumu!");
            }
        } else {
            System.out.println("Geliriniz indirim icin yuksek! ");
        }

    }
}

