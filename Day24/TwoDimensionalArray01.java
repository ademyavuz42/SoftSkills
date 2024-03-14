package Day24;

import java.util.Arrays;

public class TwoDimensionalArray01 {
    public static void main(String[] args) {
        int[][] table = {{36,9,87},{26,54,5},{3,11,62}};
        System.out.println(Arrays.deepToString(table));

        int sum = 0;
        int[][] notes = {{99,42,74,83,100},
                {90,91,72,88,95},
                {88,61,74,89,96},
                {61,89,82,98,93},
                {93,73,75,78,99},
                {50,65,92,87,94}};
        for (int i = 0; i < notes.length; i++) {
            sum += notes[i][0];
        }
        double avg = sum/ notes.length;
        System.out.println(sum);
        System.out.println(avg);
    }
}
