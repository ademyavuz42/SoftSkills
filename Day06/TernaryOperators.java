package Day06;public class TernaryOperators {
    public static void main(String[] args) {
        char langLevel = 65;
        String message = langLevel == 65 ? "Dil seviyesi mukemmel" : (langLevel == 66 ? "Dil seviyesi daha iyi" : (langLevel == 67 ? "Dil seviyesi iyi" : (langLevel == 68 ? "Dil seviyesi idare eder" : (langLevel == 69 ? "Dil seviyesi yetersiz" : "Gecersiz dil seviyesi!"))));
        System.out.println(message);
    }
}

