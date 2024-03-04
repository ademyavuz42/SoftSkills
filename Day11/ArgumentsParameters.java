package Day11;

public class ArgumentsParameters {
    public static void main(String[] args) {
        int num = 26;
        tekMiCiftMi(num);
    }

    private static void tekMiCiftMi(int num) {
        if (num%2==0) {
            System.out.println(num + " : is an even number.");
        }else {
            System.out.println(num + " : is an odd number.");
        }

    }
}
