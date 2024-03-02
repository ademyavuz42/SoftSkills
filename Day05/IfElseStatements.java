package Day05;
class IfElseStatements {
    public static void main(String[] args) {
        // if statements
        boolean statu = false ;

        if (statu){
            System.out.println("Durum dogru!");
        }else {
            System.out.println("Durum dogru degil");
        }

        // task: credential for sports activities
        int age = -25;
        if (age < 18 && age >=0){
            System.out.println("Sport: Swimming");
        } else if (age >=18 && age <50) {
            System.out.println("Sport: Kosu");
        }else if (age >= 50){
            System.out.println("Sport: Yoga");
        } else {
            System.out.println("Invalid data!");
        }

        double amount = 2500;
        if (amount>2000){
            System.out.println("Tebrikler! Iyi bir kazanc elde ettiniz!");
        }else {
            System.out.println("Ha gayret biraz daha calisin!!");
        }
    }
}