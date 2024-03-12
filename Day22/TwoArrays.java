package Day22;

public class TwoArrays {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int[] array2 = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20,11};

        boolean statu = true;
        int i = 0;

        if (array1.length != array2.length) {
            System.out.println("Elemanlar esit degil!");
        } else {
            for (int arr1 : array1) {
                if (arr1 != array2[i]) {
                    statu = false;
                    break;
                }
                i++;
            }
            if (statu) {
                System.out.println("Array'ler esittir");
            } else {
                System.out.println("Array'ler esit degildir.");
            }
        }

    }
}
