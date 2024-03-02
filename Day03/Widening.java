package Day03;
class Widening {
    public static void main(String[] args) {
        //automatic change from small to big
        // byte -> short -> char -> int -> long -> float -> double

        // widening from float to double
        float nufusTurkiye = 83.67f;
        float nufusAlmanya = 83.02f;
        double farkNufus = nufusTurkiye-nufusAlmanya;
        System.out.println("Nufus farki : "+farkNufus);

        // narrowing from double to integer
        double hizRoketA = 4532.55657;
        double hizToketB = 3845.23053;
        int hizFark = (int)(hizRoketA-hizToketB);
        System.out.println("Hiz Farki : "+hizFark);

        double math = 87.2;
        double phy = 92.5;
        double chm = 78.9;
        double bio = 85.6;
        double ede = 91.3;
        double sum = math+phy+chm+bio+ede;
        double avg = sum/5;
        System.out.println("Average double : " + avg);
        int avgInt = (int) avg;
        System.out.println("Average integer : " + avgInt);





    }
}