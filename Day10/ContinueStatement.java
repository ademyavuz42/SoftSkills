package Day10;

public class ContinueStatement {
    public static void main(String[] args) {
        //To skip data vale use Continue keyword
        //skip multiplies of four
        for (int i = 0; i < 20; i++) {
            if (i % 4 == 0) {
                continue;
            }
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        // if sum is 15 or over loop stop
        int sum = 0;
        for (int i = 1; i < 30; i++) {
            sum += i;
            if (sum >= 15) {
                System.out.println("Last sum is: " + sum);
                break;
            }
            System.out.println(sum);
        }

        // example for continue keyword
        for (int i = 20; i <= 60; i++) {

            if (i%13==0 && i%2==0){
                System.out.println("continue");
                continue;
            }

            if (i%2==0){
                System.out.println(i);
            }

        }
    }
}
