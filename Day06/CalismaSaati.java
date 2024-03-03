package Day06;public class CalismaSaati {
    public static void main(String[] args) {
        String gun = "Sali";
        int calismaSaati = 18;
        if (gun != "Pazartesi" && gun != "Sali" && gun != "Carsamba" && gun != "Persembe" && gun != "Cuma") {
            if (gun == "Cumartesi") {
                if (calismaSaati >= 10 && calismaSaati <= 14) {
                    System.out.println("Isci " + gun + " gunu calisma saatlerinde degil!");
                } else {
                    System.out.println("Isci " + gun + " gunu calisma saatlerinde degil!");
                }
            } else {
                System.out.println("Pazar gunu tatil!");
            }
        } else if (calismaSaati >= 9 && calismaSaati <= 17) {
            System.out.println("Isci " + gun + " gunu calisma saatlerinde!");
        } else {
            System.out.println("Isci " + gun + " gunu calisma saatlerinde degil!");
        }
    }
}
