package Day22;

import java.util.Arrays;

public class NarrowingArray {
    public static void main(String[] args) {
        double[] doubleNumbers = {1.1,2.2,3.3,4.4,5.5,6.6,7.7,8.8,9.9,10.1};
        int[] intNumber = new int[10];
        for (int i = 0; i < doubleNumbers.length; i++){
            intNumber[i] = (int) doubleNumbers[i];
        }
        System.out.println(Arrays.toString(intNumber));
    }
}
