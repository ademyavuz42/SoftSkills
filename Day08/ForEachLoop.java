package Day08;

public class ForEachLoop {
    public static void main(String[] args) {
        String[] colors = {"Kirmizi", "Mavi", "Yesil", "Sari", "Turuncu"};
        for (String color : colors) {
            System.out.println(color);
        }

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int number : numbers) {
            if (number % 2 != 0) {
                System.out.println(number);
            }
        }
    }
}
