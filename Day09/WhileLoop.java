package Day09;

public class WhileLoop {
    public static void main(String[] args) {


        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
        System.out.println("----");

        int j = 1;
        while (j <= 100) {
            if (j % 2 == 0) {
                System.out.println(j);
            }
            j++;
        }
        System.out.println("-----");
         i = 1;
        int sum =0;
        do {
            sum+=i;
            if (sum%33==0){
                System.out.println(sum + ": 33 sayisinin katidir.");
                break;
            }
            System.out.println(sum);
            i++;
        }while (true);

    }
}
