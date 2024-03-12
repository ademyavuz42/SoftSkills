package Day22;

import java.util.Scanner;

public class TahminArray {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int num:numbers) {
            if (num==number) {
                System.out.println("Number found in Array");
                break;
            }
        }


    }
}
