package Day06;

class NestedIfElse {

    public static void main(String[] args) {
        String kullaniciIsmi = "ademyavuz";
        String sifre = "adem42yavuz";
        if (kullaniciIsmi == "ademyavuz2") {
            System.out.println("Gecerli kullanici!");
            if (sifre == "adem42yavuz2") {
                System.out.println("Hos geldiniz!");
            } else {
                System.out.println("Invalid Password!");
            }
        } else {
            System.out.println("Invalid username or Password!");
        }

    }
}
